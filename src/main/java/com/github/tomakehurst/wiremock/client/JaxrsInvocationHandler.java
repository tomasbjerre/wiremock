package com.github.tomakehurst.wiremock.client;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.github.tomakehurst.wiremock.http.RequestMethod;

class JaxrsInvocationHandler implements InvocationHandler {

	private RequestMethod requestMethod;
	private Class<?> returnType;
	private String path;
	private List<InvocationParam> queryParams;
	private List<InvocationParam> pathParams;
	private List<String> requestContentTypeList;
	private Optional<String> responseContentType;

	@Override
	public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
		if (findAnnotation(method, GET.class).isPresent()) {
			this.requestMethod = RequestMethod.GET;
		} else if (findAnnotation(method, POST.class).isPresent()) {
			this.requestMethod = RequestMethod.POST;
		} else if (findAnnotation(method, PUT.class).isPresent()) {
			this.requestMethod = RequestMethod.PUT;
		} else if (findAnnotation(method, DELETE.class).isPresent()) {
			this.requestMethod = RequestMethod.DELETE;
		}

		this.returnType = method.getReturnType();
		this.queryParams = createQueryParams(method.getParameters(), args);
		this.pathParams = createPathParams(method.getParameters(), args);
		this.path = substituteParams(createPath(method), queryParams, pathParams);
		requestContentTypeList = getRequestContentTypeList(method);
		final Optional<Produces> responseContentTypeAnnotation = findAnnotation(method, Produces.class);
		if (responseContentTypeAnnotation.isPresent() && responseContentTypeAnnotation.get().value().length > 0) {
			this.responseContentType = Optional.of(responseContentTypeAnnotation.get().value()[0]);
		} else {
			this.responseContentType = Optional.empty();
		}
		return null;
	}

	private List<String> getRequestContentTypeList(final Method method) {
		final List<String> list = new ArrayList<>();
		for (final Consumes consumes : method.getAnnotationsByType(Consumes.class)) {
			for (final String value : consumes.value()) {
				list.add(value);
			}
		}
		return list;
	}

	public RequestMethod getRequestMethod() {
		return requestMethod;
	}

	public Optional<String> getResponseContentType() {
		return responseContentType;
	}

	public String getPath() {
		return path;
	}

	public List<String> getRequestContentTypeList() {
		return requestContentTypeList;
	}

	public Class<?> getReturnType() {
		return returnType;
	}

	public List<InvocationParam> getQueryParams() {
		return queryParams;
	}

	private String createPath(final Method method) {
		final Optional<Path> classPath = findAnnotation(method.getDeclaringClass().getAnnotations(), Path.class);
		final Optional<Path> methodPath = findAnnotation(method, Path.class);
		String str = "";
		if (classPath.isPresent()) {
			str += classPath.get().value();
		}
		if (methodPath.isPresent()) {
			str += "/" + methodPath.get().value();
		}
		return str.replace("//", "/");
	}

	private <T> Optional<T> findAnnotation(final Method method, final Class<T> findAnnotation) {
		final Annotation[] methodAnnotations = method.getAnnotations();
		return findAnnotation(methodAnnotations, findAnnotation);
	}

	@SuppressWarnings("unchecked")
	private <T> Optional<T> findAnnotation(final Annotation[] methodAnnotations, final Class<T> annotations) {
		for (final Annotation annotation : methodAnnotations) {
			if (annotation.annotationType() == annotations) {
				return Optional.of((T) annotation);
			}
		}
		return Optional.empty();
	}

	private List<InvocationParam> createQueryParams(final Parameter[] parameters, final Object[] args) {
		final List<InvocationParam> queryParams = new ArrayList<>();
		if (parameters.length != args.length) {
			throw new RuntimeException(parameters.length + " != " + args.length);
		}
		for (int i = 0; i < args.length; i++) {
			final Object arg = args[i];
			final Parameter param = parameters[i];
			final Optional<QueryParam> paramAnnotation = findAnnotation(param.getAnnotations(), QueryParam.class);
			if (paramAnnotation.isPresent()) {
				final String name = paramAnnotation.get().value();
				final InvocationParam invocationParam = new InvocationParam(name, arg);
				queryParams.add(invocationParam);
			}
		}
		return queryParams;
	}

	private List<InvocationParam> createPathParams(final Parameter[] parameters, final Object[] args) {
		final List<InvocationParam> queryParams = new ArrayList<>();
		if (parameters.length != args.length) {
			throw new RuntimeException(parameters.length + " != " + args.length);
		}
		for (int i = 0; i < args.length; i++) {
			final Object arg = args[i];
			final Parameter param = parameters[i];
			final Optional<PathParam> paramAnnotation = findAnnotation(param.getAnnotations(), PathParam.class);
			if (paramAnnotation.isPresent()) {
				final String name = paramAnnotation.get().value();
				final InvocationParam invocationParam = new InvocationParam(name, arg);
				queryParams.add(invocationParam);
			}
		}
		return queryParams;
	}

	private String substituteParams(final String createPath, final List<InvocationParam> queryParams,
			final List<InvocationParam> pathParams) {
		final String substituted = createPath;
		for (final InvocationParam queryParam : queryParams) {
			substituted.replace(queryParam.getName(), queryParam.getValue());
		}
		for (final InvocationParam pathParam : pathParams) {
			substituted.replace("{" + pathParam.getName() + "}", pathParam.getValue());
		}
		return substituted;
	}
}
