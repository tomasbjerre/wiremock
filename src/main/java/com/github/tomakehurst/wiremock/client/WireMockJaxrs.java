package com.github.tomakehurst.wiremock.client;

public class WireMockJaxrs {
	public static <T> MappingBuilder invocation(final Class<T> resource, final ResourceInvocation<T> invocation) {
		return new JaxrsInvocationMappingBuilder<>(resource, invocation);
	}
}
