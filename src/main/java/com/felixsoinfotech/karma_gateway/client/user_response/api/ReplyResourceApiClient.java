package com.felixsoinfotech.karma_gateway.client.user_response.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.felixsoinfotech.karma_gateway.client.user_response.ClientConfiguration;

@FeignClient(name="${userResponse.name:userResponse}", url="${userResponse.url:34.66.94.234:8075/UserResponse}", configuration = ClientConfiguration.class)
public interface ReplyResourceApiClient extends ReplyResourceApi {
}