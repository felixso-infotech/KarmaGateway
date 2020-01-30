package com.felixsoinfotech.karma_gateway.client.user_response.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.felixsoinfotech.karma_gateway.client.user_response.ClientConfiguration;

@FeignClient(name="${userResponse.name:userResponse}", url="${userResponse.url:35.209.40.232:8075/UserResponse}", configuration = ClientConfiguration.class)
public interface CommentResourceApiClient extends CommentResourceApi {
}