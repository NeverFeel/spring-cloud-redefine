package com.ilidan.ribbonprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String helloRibbon(String msg) {
        System.out.println(msg);
        return "from " + port;
    }

}
