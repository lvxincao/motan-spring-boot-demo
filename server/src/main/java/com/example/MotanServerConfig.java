package com.example;

import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: lxc
 * Date: 2018/10/26
 * Time: 16:18
 * Description: MotanServerConfig
 */
@Configuration
public class MotanServerConfig {
    @Autowired
    private BasicServiceConfigProperties basicServiceConfigProperties;

    @Bean(name = "serviceBasicConfig")
    public BasicServiceConfigBean basicServiceConfig(){
        BasicServiceConfigBean config = new BasicServiceConfigBean();
        config.setExport(basicServiceConfigProperties.getExport());
        config.setGroup(basicServiceConfigProperties.getGroup());
        config.setAccessLog(basicServiceConfigProperties.getAccessLog());
        config.setShareChannel(basicServiceConfigProperties.getShareChannel());
        config.setModule(basicServiceConfigProperties.getModule());
        config.setRegistry(basicServiceConfigProperties.getRegistry());
        config.setApplication(basicServiceConfigProperties.getApplication());
        return config;
    }

}