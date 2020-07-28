package com.ilidan.springcloud.controller;

import com.ilidan.springcloud.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    HelloFeignService helloFeignService;

    @GetMapping("/search/githup/repo")
    public Object searchGithubRespoByQueryStr(@RequestParam("q") String queryStr){
        return helloFeignService.searchRepo(queryStr);
    }

}
