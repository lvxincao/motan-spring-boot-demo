package com.example;

import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Bean(name="registry")
    public RegistryConfigBean registry(){
        RegistryConfigBean config = new RegistryConfigBean();
        config.setRegProtocol(registryConfigProperties.getRegProtocol());
        config.setAddress(registryConfigProperties.getAddress());
        config.setPort(registryConfigProperties.getPort());
        return config;
    }



    @Bean(name = "motan")
    public ProtocolConfigBean protocolConfig(){
        ProtocolConfigBean config = new ProtocolConfigBean();
        config.setName(protocolConfigProperties.getName());
        config.setDefault(protocolConfigProperties.getDefaultConfig());
        config.setHaStrategy(protocolConfigProperties.getHaStrategy());
        config.setLoadbalance(protocolConfigProperties.getLoadbalance());
        config.setMaxClientConnection(protocolConfigProperties.getMaxClientConnection());
        config.setMaxClientConnection(protocolConfigProperties.getMinClientConnection());
        return config;
    }


}