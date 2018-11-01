package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: lxc
 * Date: 2018/10/26
 * Time: 16:38
 * Description: RegistryConfigProperties
 */
@Configuration
@ConfigurationProperties(prefix = "china.motan.registry")
public class RegistryConfigProperties {

    /** 注册配置名称 */
    private String name;

    /** 注册协议 */
    private String regProtocol;

    /** 注册中心地址 */
    private String address;

    /** 注册中心端口 */
    private Integer port;

    /** 注册中心连接超时时间 (millisecond), default 1000 */
    private Integer connectTimeout;

    /** 注册中心请求超时时间 (millisecond), default 200 */
    private Integer requestTimeout;

    /** 注册中心会话超时时间 (millisecond), default 60 * 1000 */
    private Integer registrySessionTimeout;

    /** 失败后重试的时间间隔 (millisecond), default 30 * 1000 */
    private Integer registryRetryPeriod;

    /** 启动时检查失败后是否仍然启动, default true */
    private String check;

    /** 在该注册中心上服务是否暴露, default true */
    private Boolean register;

    /** 在该注册中心上服务是否引用, default true */
    private Boolean subscribe;

    /** 是否缺省的配置 */
    private Boolean defaultConfig;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegProtocol() {
        return regProtocol;
    }

    public void setRegProtocol(String regProtocol) {
        this.regProtocol = regProtocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public Integer getRegistrySessionTimeout() {
        return registrySessionTimeout;
    }

    public void setRegistrySessionTimeout(Integer registrySessionTimeout) {
        this.registrySessionTimeout = registrySessionTimeout;
    }

    public Integer getRegistryRetryPeriod() {
        return registryRetryPeriod;
    }

    public void setRegistryRetryPeriod(Integer registryRetryPeriod) {
        this.registryRetryPeriod = registryRetryPeriod;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public Boolean getRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
    }

    public Boolean getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    public Boolean getDefaultConfig() {
        return defaultConfig;
    }

    public void setDefaultConfig(Boolean defaultConfig) {
        this.defaultConfig = defaultConfig;
    }
}