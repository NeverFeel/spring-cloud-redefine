package com.ilidan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients注解表示当程序启动时，会进行包扫描，
// 扫描所有带@FeignCleint的注解的类并进行处理。
@EnableFeignClients
public class FeignHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHelloApplication.class, args);
    }

}
