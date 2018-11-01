package com.example;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: lxc
 * Date: 2018/10/29
 * Time: 11:19
 * Description: HelloController
 */
@RestController
public class HelloController {

    @MotanReferer(basicReferer = "clientBasicConfig",interfaceClass = DemoService.class)
    private DemoService service;

    @MotanReferer(basicReferer = "clientBasicConfig", interfaceClass = HelloService.class)
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name){
        String a = service.hello(name);
        String b = helloService.hello(name);
        return service.hello(name)+"-------"+helloService.hello(name);
    }

}