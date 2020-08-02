package com.ilidan.springcloud.controller;

import com.ilidan.springcloud.service.OkHttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    OkHttpService okHttpService;

    @GetMapping("/search/githup/repo")
    public Object searchGithubRespoByQueryStr(@RequestParam("q") String queryStr){
        System.out.println("111");
        return okHttpService.searchGithubRepo(queryStr);
    }

}
