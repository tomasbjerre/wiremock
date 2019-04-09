package com.github.tomakehurst.wiremock.client;

import java.lang.reflect.Proxy;

import javax.ws.rs.core.HttpHeaders;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.matching.EqualToJsonPattern;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import com.github.tomakehurst.wiremock.matching.RegexPattern;
import com.github.tomakehurst.wiremock.matching.RequestPatternBuilder;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.matching.UrlPattern;

class JaxrsInvocationMappingBuilder<T> extends BasicMappingBuilder {

	private static JaxrsInvocationHandler handler;

	public JaxrsInvocationMappingBuilder(final Class<T> resource, final ResourceInvocation<T> invocation) {
		super(JaxrsInvocationMappingBuilder.requestMatcher(resource, invocation));
	}

	public BasicMappingBuilder willReturn(final ResponseDefinitionBuilder responseDefBuilder,
			final Object responseObject) {
		final Class<?> expectedReturnType = handler.getReturnType();
		if (responseDefBuilder.status >= 200 && responseDefBuilder.status <= 299) {
			if (!expectedReturnType.isAssignableFrom(responseObject.getClass())) {
				throw new RuntimeException(
						"Cannot assign " + expectedReturnType + " from " + responseObject.getClass());
			}
		}

		responseDefBuilder.withBody(toJson(responseObject));

		return willReturn(responseDefBuilder);
	}

	@Override
	public BasicMappingBuilder willReturn(final ResponseDefinitionBuilder responseDefBuilder) {
		final Class<?> expectedReturnType = handler.getReturnType();
		if (responseDefBuilder.status >= 200 && responseDefBuilder.status <= 299) {
			if (!expectedReturnType.isAssignableFrom(Void.class)) {
				throw new RuntimeException("Stubbed method returns " + expectedReturnType
						+ ", use the method willReturn(responseDefBuilder, responseObject)");
			}
		}

		if (handler.getResponseContentType().isPresent()) {
			responseDefBuilder.withHeader(HttpHeaders.CONTENT_TYPE, handler.getResponseContentType().get());
		}

		return super.willReturn(responseDefBuilder);
	}

	private static <T> RequestPatternBuilder requestMatcher(final Class<T> resource,
			final ResourceInvocation<T> invocation) {
		handler = new JaxrsInvocationHandler();

		@SuppressWarnings("unchecked")
		final T recordingProxy = (T) Proxy.newProxyInstance(resource.getClassLoader(), new Class[] { resource },
				handler);

		invocation.invoke(recordingProxy);

		final String path = handler.getPath();

		final UrlPattern urlPattern = new UrlPattern(new RegexPattern(".*" + path + ".*"), true);
		final RequestPatternBuilder pb = new RequestPatternBuilder(handler.getRequestMethod(), urlPattern);

		for (final String it : handler.getRequestContentTypeList()) {
			pb.withHeader(HttpHeaders.ACCEPT, new EqualToPattern(it));
		}

		for (final InvocationParam qp : handler.getQueryParams()) {
			StringValuePattern valuePattern = null;
			final Boolean ignoreArrayOrder = true;
			final Boolean ignoreExtraElements = true;
			if (qp.getValue().getClass().isPrimitive()) {
				valuePattern = new EqualToPattern(qp.getValue().toString());
			} else {
				final String json = toJson(qp.getValue());
				valuePattern = new EqualToJsonPattern(json, ignoreArrayOrder, ignoreExtraElements);
			}
			pb.withQueryParam(qp.getName(), valuePattern);
		}
		return pb;
	}

	private static String toJson(final Object object) {
		try {
			final ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.setSerializationInclusion(Include.NON_EMPTY);
			return objectMapper.writeValueAsString(object);
		} catch (final JsonProcessingException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
