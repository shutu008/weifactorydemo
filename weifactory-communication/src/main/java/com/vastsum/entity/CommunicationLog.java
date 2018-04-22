package com.vastsum.entity;

import java.util.Date;

/**
 * @author ssj
 * @create 2017-11-19 11:21
 */
public class CommunicationLog {

    //连接记录标识
    private Long clientConnectionId;
    //设备序列号
    private String sn;
    //服务器外网地址
    private String serverNetAddress;
    //客户端ip
    private String clientIpAddress;
    //客户端端口号
    private Integer clientPort;
    //服务器端ip
    private String serverIpAddress;
    //服务器端口号
    private Integer serverPort;
    //操作类型
    private Integer optiontype;
    //记录时间
    private Date gmtCreate;

    public Long getClientConnectionId() {
        return clientConnectionId;
    }

    public void setClientConnectionId(Long clientConnectionId) {
        this.clientConnectionId = clientConnectionId;
    }

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public Integer getOptiontype() {
        return optiontype;
    }

    public void setOptiontype(Integer optiontype) {
        this.optiontype = optiontype;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getServerNetAddress() {
        return serverNetAddress;
    }

    public void setServerNetAddress(String serverNetAddress) {
        this.serverNetAddress = serverNetAddress;
    }
}
