package com.ilidan.ribbonregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RibbonRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonRegistryApplication.class, args);
    }

}
