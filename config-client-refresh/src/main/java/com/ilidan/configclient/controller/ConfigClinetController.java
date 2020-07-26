package com.ilidan.configclient.controller;

import com.ilidan.configclient.properties.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClinetController {

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping("/getConfig")
    public String getConfig(){
        return configProperties.getConfig();
    }

}
