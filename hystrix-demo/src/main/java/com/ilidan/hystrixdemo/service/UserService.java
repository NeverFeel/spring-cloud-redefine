package com.ilidan.hystrixdemo.service;

public interface UserService {

    String getUser(String username) throws Exception;

    String defaultUser(String username);
}
