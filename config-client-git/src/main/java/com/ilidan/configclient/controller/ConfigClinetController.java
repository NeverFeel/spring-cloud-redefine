package com.ilidan.configclient.controller;

import com.ilidan.configclient.properties.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClinetController {

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping("/getConfig")
    public ConfigProperties getConfig(){
        return configProperties;
    }

}
