package com.example;

/**
 * Created with IntelliJ IDEA.
 * User: lxc
 * Date: 2018/10/28
 * Time: 12:44
 * Description:
 */

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MotanClientConfig {

    @Autowired
    private BasicRefererConfigProperties basicRefererConfigProperties;
    @Autowired
    private RegistryConfigBean registry;
    @Autowired
    private ProtocolConfigBean motan;

    @Bean(name = "clientBasicConfig")
    public BasicRefererConfigBean basicRefererConfigBean(){
        BasicRefererConfigBean basicRefererConfigBean = new BasicRefererConfigBean();
        basicRefererConfigBean.setId(basicRefererConfigProperties.getId());
        basicRefererConfigBean.setProtocol(motan);
        basicRefererConfigBean.setRegistry(registry);
        basicRefererConfigBean.setGroup(basicRefererConfigProperties.getGroup());
        basicRefererConfigBean.setModule(basicRefererConfigProperties.getModule());
        basicRefererConfigBean.setApplication(basicRefererConfigProperties.getApplication());
        basicRefererConfigBean.setRequestTimeout(basicRefererConfigProperties.getRequestTimeout());
        basicRefererConfigBean.setAccessLog(basicRefererConfigProperties.getAccessLog());
        basicRefererConfigBean.setRetries(basicRefererConfigProperties.getRetries());
        basicRefererConfigBean.setCheck(basicRefererConfigProperties.getCheck());
        basicRefererConfigBean.setThrowException(basicRefererConfigProperties.getThrowException());
        return basicRefererConfigBean;
    }

}