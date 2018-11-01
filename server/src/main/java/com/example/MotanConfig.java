package com.example;

import com.weibo.api.motan.config.ProtocolConfig;
import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: lxc
 * Date: 2018/10/26
 * Time: 15:44
 * Description: MotanConfig
 */
@Configuration
public class MotanConfig {
    @Autowired
    private ProtocolConfigProperties protocolConfigProperties;
    @Autowired
    private RegistryConfigProperties registryConfigProperties;

    @Bean(name = "demoMotan")
    public ProtocolConfigBean protocolConfig(){
        ProtocolConfigBean config = new ProtocolConfigBean();
        config.setName(protocolConfigProperties.getName());
        config.setDefault(protocolConfigProperties.getDefaultConfig());
        config.setMaxServerConnection(protocolConfigProperties.getMaxServerConnection());
        config.setMaxContentLength(protocolConfigProperties.getMaxContentLength());
        config.setMinWorkerThread(protocolConfigProperties.getMinWorkerThread());
        config.setMaxWorkerThread(protocolConfigProperties.getMaxWorkerThread());
        return config;
    }

    @Bean(name = "registry")
    public RegistryConfigBean registryConfigBean(){
        RegistryConfigBean config = new RegistryConfigBean();
        config.setRegProtocol(registryConfigProperties.getRegProtocol());
        config.setAddress(registryConfigProperties.getAddress());
        config.setPort(registryConfigProperties.getPort());
        return config;
    }

}