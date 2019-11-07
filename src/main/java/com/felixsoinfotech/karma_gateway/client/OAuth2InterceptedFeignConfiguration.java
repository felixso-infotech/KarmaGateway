package com.felixsoinfotech.karma_gateway.client;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.felixsoinfotech.karma_gateway.security.oauth2.AuthorizationHeaderUtil;

import feign.RequestInterceptor;

@Configuration
public class OAuth2InterceptedFeignConfiguration {

	@Bean(name = "oauth2RequestInterceptor")
	public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil)
			throws IOException {
		return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
	}
}
