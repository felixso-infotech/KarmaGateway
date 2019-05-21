package com.lxisoft.client.karma_app.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.lxisoft.client.karma_app.ClientConfiguration;

@FeignClient(name="${KarmaApp.name:KarmaApp}", url="${KarmaApp.url:35.196.249.196:8075/KarmaApp}", configuration = ClientConfiguration.class)
public interface RegisteredUserResourceApiClient extends RegisteredUserResourceApi {
}