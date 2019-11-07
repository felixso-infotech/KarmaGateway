package com.felixsoinfotech.karma_gateway.client.karma.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.felixsoinfotech.karma_gateway.client.karma.ClientConfiguration;

@FeignClient(name="${Karma.name:Karma}", url="${Karma.url:35.208.4.27:8065/Karma}", configuration = ClientConfiguration.class)
public interface RegisteredUserResourceApiClient extends RegisteredUserResourceApi {
}