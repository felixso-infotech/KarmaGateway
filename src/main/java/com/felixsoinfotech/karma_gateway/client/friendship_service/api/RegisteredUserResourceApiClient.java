package com.felixsoinfotech.karma_gateway.client.friendship_service.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.felixsoinfotech.karma_gateway.client.friendship_service.ClientConfiguration;

@FeignClient(name="${FriendshipService.name:FriendshipService}", url="${FriendshipService.url:35.209.40.232:8040/FriendshipService}", configuration = ClientConfiguration.class)
public interface RegisteredUserResourceApiClient extends RegisteredUserResourceApi {
}