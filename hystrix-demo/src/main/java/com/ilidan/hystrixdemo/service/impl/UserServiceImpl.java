package com.ilidan.hystrixdemo.service.impl;

import com.ilidan.hystrixdemo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @HystrixCommand(fallbackMethod = "defaultUser")
    @Override
    public String getUser(String username) throws Exception {
        if ("hystrix".equals(username)) {
            return "this is real user";
        } else {
            throw new Exception();
        }
    }

    /**
     * 方法参数和getUser参数一致
     * @param username
     * @return
     */
    @Override
    public String defaultUser(String username){
        return "This user does not exist in this system!";
    }

}
