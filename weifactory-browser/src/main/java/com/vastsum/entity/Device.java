package com.vastsum.entity;

import java.util.Date;

public class Device {
    private Integer deviceId;

    private String sn;

    private String deviceType;

    private Integer userId;

    private String note;

    private Date gmtCreate;

    private Date gmtModified;

    private String truestStatus;

    private String orderStatus;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getTruestStatus() {
        return truestStatus;
    }

    public void setTruestStatus(String truestStatus) {
        this.truestStatus = truestStatus == null ? null : truestStatus.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviceId=").append(deviceId);
        sb.append(", sn=").append(sn);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", userId=").append(userId);
        sb.append(", note=").append(note);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", truestStatus=").append(truestStatus);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append("]");
        return sb.toString();
    }
}