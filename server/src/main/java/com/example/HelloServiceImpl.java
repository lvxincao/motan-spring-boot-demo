package com.example;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;
@MotanService(basicService = "serviceBasicConfig")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hi "+name+"!";
    }
}
