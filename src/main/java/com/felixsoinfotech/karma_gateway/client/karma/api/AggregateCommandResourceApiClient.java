package com.felixsoinfotech.karma_gateway.client.karma.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.felixsoinfotech.karma_gateway.client.karma.ClientConfiguration;

@FeignClient(name="${karma.name:karma}", url="${karma.url:34.66.94.234:8065/Karma}", configuration = ClientConfiguration.class)
public interface AggregateCommandResourceApiClient extends AggregateCommandResourceApi {
}