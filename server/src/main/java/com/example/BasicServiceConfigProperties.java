package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: lxc
 * Date: 2018/10/26
 * Time: 16:44
 * Description: BasicServiceConfigProperties
 */
@Configuration
@ConfigurationProperties(prefix = "china.motan.basicService")
public class BasicServiceConfigProperties {

    private String id;

    /** 服务暴露的方式，包含协议及端口号，多个协议端口用"," 分隔 */
    private String export;

    /** 服务暴露端口 */
    private String exportPort;

    /** 扩展配置Id */
    private String extConfigId;

    /** 代理类型 */
    private String proxy;

    /** 服务分组, default default_rpc */
    private String group;

    /** 版本, default 1.0 */
    private String version;

    /** 抛出异常, default true */
    private Boolean throwException;

    /** 应用信息, default motan */
    private String application;

    /** 是否共享channel, default false */
    private Boolean shareChannel;

    /** 注册中心的id 列表，多个用“,”分隔，如果为空，则使用所有的配置中心 */
    private String registry;

    /** 设为true，将向logger 中输出访问日志, default false */
    private Boolean accessLog;

    /** 是否开启gzip压缩.只有compressMotan的codec才能支持, default false */
    private Boolean usegz;

    /**
     * 开启gzip压缩的阈值.usegz开关开启，且传输数据大于此阈值时，才会进行gzip压缩。
     * 只有compressMotan的codec才能支持.
     *
     * default 1000
     */
    private Integer mingzSize;

    /** 协议编码, default motan */
    private String codec;

    /** 过滤器配置 */
    private String filter;

    /** 模块信息, default motan */
    private String module;

    /** 最大请求数，0为不做并发限制, default 0 */
    private Integer actives;

    /** 在该注册中心上服务是否暴露, default true */
    private Boolean register;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getExportPort() {
        return exportPort;
    }

    public void setExportPort(String exportPort) {
        this.exportPort = exportPort;
    }

    public String getExtConfigId() {
        return extConfigId;
    }

    public void setExtConfigId(String extConfigId) {
        this.extConfigId = extConfigId;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getThrowException() {
        return throwException;
    }

    public void setThrowException(Boolean throwException) {
        this.throwException = throwException;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Boolean getShareChannel() {
        return shareChannel;
    }

    public void setShareChannel(Boolean shareChannel) {
        this.shareChannel = shareChannel;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public Boolean getAccessLog() {
        return accessLog;
    }

    public void setAccessLog(Boolean accessLog) {
        this.accessLog = accessLog;
    }

    public Boolean getUsegz() {
        return usegz;
    }

    public void setUsegz(Boolean usegz) {
        this.usegz = usegz;
    }

    public Integer getMingzSize() {
        return mingzSize;
    }

    public void setMingzSize(Integer mingzSize) {
        this.mingzSize = mingzSize;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Integer getActives() {
        return actives;
    }

    public void setActives(Integer actives) {
        this.actives = actives;
    }

    public Boolean getRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
    }
}