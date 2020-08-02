package com.ilidan.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private String providerServerName = "http://RIBBON-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String helloRibbon(@RequestParam("msg") String msg){
        return  restTemplate.getForObject(providerServerName + "/hello?msg=" + msg, String.class);
    }

}
