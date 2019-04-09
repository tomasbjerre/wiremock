package com.github.tomakehurst.wiremock.client;

import static com.github.tomakehurst.wiremock.http.RequestMethod.GET;
import static com.github.tomakehurst.wiremock.http.RequestMethod.POST;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.github.tomakehurst.wiremock.stubbing.StubMapping;

public class InvocationMappingBuilderTest {

	@Test
	public void canRecordGet() {
		final StubMapping actual = new JaxrsInvocationMappingBuilder<>(TestResouce.class, (r) -> r.getStuff()).build();

		assertThat(actual.getRequest().getMethod(), equalTo(GET));
	}

	@Test
	public void canRecordPost() {
		final TestResourceDTO data = new TestResourceDTO("some value");
		final StubMapping actual = new JaxrsInvocationMappingBuilder<>(TestResouce.class, (r) -> r.postStuff(data))
				.build();

		assertThat(actual.getRequest().getMethod(), equalTo(POST));
	}
}
