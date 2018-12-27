package com.vastsum.entity;

import java.util.Date;

public class CommunicationLog {
    private Long clientConnectionId;

    private String sn;

    private String clientIpAddress;

    private Integer clientPort;

    private String serverIpAddress;

    private String serverNetAddress;

    private Integer serverPort;

    private Integer optionType;

    private Date gmtCreate;

    private String optionTypeName;

    public String getOptionTypeName() {
        return optionTypeName;
    }

    public void setOptionTypeName(String optionTypeName) {
        this.optionTypeName = optionTypeName;
    }

    public Long getClientConnectionId() {
        return clientConnectionId;
    }

    public void setClientConnectionId(Long clientConnectionId) {
        this.clientConnectionId = clientConnectionId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress == null ? null : clientIpAddress.trim();
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
        this.serverIpAddress = serverIpAddress == null ? null : serverIpAddress.trim();
    }

    public String getServerNetAddress() {
        return serverNetAddress;
    }

    public void setServerNetAddress(String serverNetAddress) {
        this.serverNetAddress = serverNetAddress == null ? null : serverNetAddress.trim();
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public Integer getOptionType() {
        return optionType;
    }

    public void setOptionType(Integer optionType) {
        this.optionType = optionType;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientConnectionId=").append(clientConnectionId);
        sb.append(", sn=").append(sn);
        sb.append(", clientIpAddress=").append(clientIpAddress);
        sb.append(", clientPort=").append(clientPort);
        sb.append(", serverIpAddress=").append(serverIpAddress);
        sb.append(", serverNetAddress=").append(serverNetAddress);
        sb.append(", serverPort=").append(serverPort);
        sb.append(", optionType=").append(optionType);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append("]");
        return sb.toString();
    }
}