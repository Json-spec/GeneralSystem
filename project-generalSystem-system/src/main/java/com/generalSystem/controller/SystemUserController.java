package com.generalSystem.controller;

import com.generalSystem.annotation.SystemLoggling;

import com.generalSystem.result.ResultConfig;
import com.generalSystem.server.SystemUserServer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SystemUserController {

    private static final Logger logger = LoggerFactory.getLogger(SystemUserController.class);

    @RequestMapping("/index")
    @SystemLoggling
    public String getUser(){
        return UUID.randomUUID().toString();
        /*ResultConfig<User> userById = systemUserFeginClient.getUserById(id);
        return userById;*/
    }
    @RequestMapping("/index1")
    @SystemLoggling
    public String getUser1(){
        return "shabi";
        /*ResultConfig<User> userById = systemUserFeginClient.getUserById(id);
        return userById;*/
    }
}
