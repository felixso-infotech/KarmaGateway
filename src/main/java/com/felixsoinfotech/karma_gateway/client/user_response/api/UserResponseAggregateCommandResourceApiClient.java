package com.felixsoinfotech.karma_gateway.client.user_response.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.felixsoinfotech.karma_gateway.client.user_response.ClientConfiguration;

@FeignClient(name="${UserResponse.name:UserResponse}", url="${UserResponse.url:35.208.4.27:8075/UserResponse}", configuration = ClientConfiguration.class)
public interface UserResponseAggregateCommandResourceApiClient extends UserResponseAggregateCommandResourceApi {
}