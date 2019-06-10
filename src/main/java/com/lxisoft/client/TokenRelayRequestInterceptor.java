package com.lxisoft.client;

import com.lxisoft.config.WebConfigurer;
import com.lxisoft.security.oauth2.AuthorizationHeaderUtil;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TokenRelayRequestInterceptor implements RequestInterceptor {

    public static final String AUTHORIZATION = "Authorization";

    private final AuthorizationHeaderUtil authorizationHeaderUtil;
    
    private final Logger log = LoggerFactory.getLogger(WebConfigurer.class);

    public TokenRelayRequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        super();
        this.authorizationHeaderUtil = authorizationHeaderUtil;
    }

    @Override
    public void apply(RequestTemplate template) {
    	  Optional<String> authorizationHeader = authorizationHeaderUtil.getAuthorizationHeaderFromOAuth2Context();
        if (authorizationHeader.isPresent()) {
        	template.header(AUTHORIZATION, authorizationHeader.get());
        }
    }
}
