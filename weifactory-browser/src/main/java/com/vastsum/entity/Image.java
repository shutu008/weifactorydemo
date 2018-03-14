package com.vastsum.entity;

import java.util.Date;

public class Image {
    private Long id;

    private String sn;

    private Long batchId;

    private String sensorMark;

    private String onePicName;

    private String twoPicName;

    private String threePicName;

    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getSensorMark() {
        return sensorMark;
    }

    public void setSensorMark(String sensorMark) {
        this.sensorMark = sensorMark == null ? null : sensorMark.trim();
    }

    public String getOnePicName() {
        return onePicName;
    }

    public void setOnePicName(String onePicName) {
        this.onePicName = onePicName == null ? null : onePicName.trim();
    }

    public String getTwoPicName() {
        return twoPicName;
    }

    public void setTwoPicName(String twoPicName) {
        this.twoPicName = twoPicName == null ? null : twoPicName.trim();
    }

    public String getThreePicName() {
        return threePicName;
    }

    public void setThreePicName(String threePicName) {
        this.threePicName = threePicName == null ? null : threePicName.trim();
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
        sb.append(", id=").append(id);
        sb.append(", sn=").append(sn);
        sb.append(", batchId=").append(batchId);
        sb.append(", sensorMark=").append(sensorMark);
        sb.append(", onePicName=").append(onePicName);
        sb.append(", twoPicName=").append(twoPicName);
        sb.append(", threePicName=").append(threePicName);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append("]");
        return sb.toString();
    }
}