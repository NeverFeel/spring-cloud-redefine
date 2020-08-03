package com.ilidan.hystrixdemo.controller;

import com.ilidan.hystrixdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String helloHystrix(@RequestParam("username") String username) throws Exception {
        return userService.getUser(username);
    }

}
