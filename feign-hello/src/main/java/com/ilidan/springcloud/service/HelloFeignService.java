package com.ilidan.springcloud.service;

import com.ilidan.springcloud.configuration.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "github-client",
        url = "https://api.github.com",
        configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {

    @GetMapping("/search/repositories")
    String searchRepo(@RequestParam("q") String queryStr);

}
