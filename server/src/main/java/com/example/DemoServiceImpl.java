package com.example;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@MotanService(basicService = "serviceBasicConfig")
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
