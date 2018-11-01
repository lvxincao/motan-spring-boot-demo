package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: lxc
 * Date: 2018/10/26
 * Time: 16:23
 * Description: ProtocolConfigProperties
 */
@Configuration
@ConfigurationProperties(prefix = "china.motan.protocol")
public class ProtocolConfigProperties {

    /** 服务协议名 */
     String name;

    /** 序列化方式, default hessian2 */
    private String serialization;

    /** 最大请求数据长度 */
    private Integer payload;

    /** 缓存区大小 */
    private Integer buffer;

    /** 心跳间隔 */
    private Integer heartbeat;

    /** 网络传输方式 */
    private String transporter;

    /** 线程池大小 */
    private Integer threads;

    /** IO线程池大小, default availableProcessors + 1 */
    private Integer iothreads;

    /** 请求超时, default 200 */
    private Integer requestTimeout;

    /** client最小连接数, default 2 */
    private Integer minClientConnection;

    /** client最大连接数, default 10 */
    private Integer maxClientConnection;

    /** 最小工作pool线程数, default 20 */
    private Integer minWorkerThread;

    /** 最大工作pool线程数, default 200 */
    private Integer maxWorkerThread;

    /** 请求响应包的最大长度限制, default 10M */
    private Integer maxContentLength;

    /** server支持的最大连接数, default 100000 */
    private Integer maxServerConnection;

    /** 连接池管理方式，是否lifo, default true */
    private Boolean poolLifo;

    /** 是否延迟init, default false */
    private Boolean lazyInit;

    /** endpoint factory, defalut motan */
    private String endpointFactory;

    /** 采用哪种cluster的实现, defalut defalut */
    private String cluster;

    /** 高可用策略, defalut failover */
    private String haStrategy;

    /** Server工作队列大小, defalut 0 */
    private Integer workerQueueSize;

    /** Server可接受连接数, defalut 0 */
    private Integer acceptConnections;

    /** proxy type, like jdk or javassist, default jdk */
    private String proxy;

    /** filter, 多个filter用","分割，blank String 表示采用默认的filter配置 */
    private String filter;

    /** 调用失败时重试次数, defalut 0 */
    private Integer retries;

    /** if the request is called async, a taskFuture result will be sent back, defalut false */
    private Boolean async;

    /** 线程池队列大小 */
    private Integer queueSize;

    /** 最大接收连接数 */
    private Integer accepts;

    /** 信息线程模型派发方式 */
    private String dispatcher;

    /** 服务器端实现 */
    private String server;

    /** 客户端端实现 */
    private String client;

    /** 是否缺省的配置 */
    private Boolean defaultConfig;

    /** default localSwitcherService */
    private String switcherService;

    /** default motan */
    private String heartbeatFactory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialization() {
        return serialization;
    }

    public void setSerialization(String serialization) {
        this.serialization = serialization;
    }

    public Integer getPayload() {
        return payload;
    }

    public void setPayload(Integer payload) {
        this.payload = payload;
    }

    public Integer getBuffer() {
        return buffer;
    }

    public void setBuffer(Integer buffer) {
        this.buffer = buffer;
    }

    public Integer getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Integer heartbeat) {
        this.heartbeat = heartbeat;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    public Integer getIothreads() {
        return iothreads;
    }

    public void setIothreads(Integer iothreads) {
        this.iothreads = iothreads;
    }

    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public Integer getMinClientConnection() {
        return minClientConnection;
    }

    public void setMinClientConnection(Integer minClientConnection) {
        this.minClientConnection = minClientConnection;
    }

    public Integer getMaxClientConnection() {
        return maxClientConnection;
    }

    public void setMaxClientConnection(Integer maxClientConnection) {
        this.maxClientConnection = maxClientConnection;
    }

    public Integer getMinWorkerThread() {
        return minWorkerThread;
    }

    public void setMinWorkerThread(Integer minWorkerThread) {
        this.minWorkerThread = minWorkerThread;
    }

    public Integer getMaxWorkerThread() {
        return maxWorkerThread;
    }

    public void setMaxWorkerThread(Integer maxWorkerThread) {
        this.maxWorkerThread = maxWorkerThread;
    }

    public Integer getMaxContentLength() {
        return maxContentLength;
    }

    public void setMaxContentLength(Integer maxContentLength) {
        this.maxContentLength = maxContentLength;
    }

    public Integer getMaxServerConnection() {
        return maxServerConnection;
    }

    public void setMaxServerConnection(Integer maxServerConnection) {
        this.maxServerConnection = maxServerConnection;
    }

    public Boolean getPoolLifo() {
        return poolLifo;
    }

    public void setPoolLifo(Boolean poolLifo) {
        this.poolLifo = poolLifo;
    }

    public Boolean getLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(Boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String getEndpointFactory() {
        return endpointFactory;
    }

    public void setEndpointFactory(String endpointFactory) {
        this.endpointFactory = endpointFactory;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getHaStrategy() {
        return haStrategy;
    }

    public void setHaStrategy(String haStrategy) {
        this.haStrategy = haStrategy;
    }

    public Integer getWorkerQueueSize() {
        return workerQueueSize;
    }

    public void setWorkerQueueSize(Integer workerQueueSize) {
        this.workerQueueSize = workerQueueSize;
    }

    public Integer getAcceptConnections() {
        return acceptConnections;
    }

    public void setAcceptConnections(Integer acceptConnections) {
        this.acceptConnections = acceptConnections;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Boolean getAsync() {
        return async;
    }

    public void setAsync(Boolean async) {
        this.async = async;
    }

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }

    public Integer getAccepts() {
        return accepts;
    }

    public void setAccepts(Integer accepts) {
        this.accepts = accepts;
    }

    public String getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(String dispatcher) {
        this.dispatcher = dispatcher;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Boolean getDefaultConfig() {
        return defaultConfig;
    }

    public void setDefaultConfig(Boolean defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    public String getSwitcherService() {
        return switcherService;
    }

    public void setSwitcherService(String switcherService) {
        this.switcherService = switcherService;
    }

    public String getHeartbeatFactory() {
        return heartbeatFactory;
    }

    public void setHeartbeatFactory(String heartbeatFactory) {
        this.heartbeatFactory = heartbeatFactory;
    }
}