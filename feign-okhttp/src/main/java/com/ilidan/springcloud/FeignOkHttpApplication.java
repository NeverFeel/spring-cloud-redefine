package com.ilidan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignOkHttpApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOkHttpApplication.class, args);
    }

}
