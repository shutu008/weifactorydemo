package com.vastsum.entity;

import java.util.Date;

public class BizException {
    private Long exceptionId;

    private String sn;

    private Integer sensorNo;

    private Integer userId;

    private Integer exceptionType;

    private String exceptionContent;

    private Date gmtCreate;

    public Long getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(Long exceptionId) {
        this.exceptionId = exceptionId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getSensorNo() {
        return sensorNo;
    }

    public void setSensorNo(Integer sensorNo) {
        this.sensorNo = sensorNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(Integer exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getExceptionContent() {
        return exceptionContent;
    }

    public void setExceptionContent(String exceptionContent) {
        this.exceptionContent = exceptionContent == null ? null : exceptionContent.trim();
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
        sb.append(", exceptionId=").append(exceptionId);
        sb.append(", sn=").append(sn);
        sb.append(", sensorNo=").append(sensorNo);
        sb.append(", userId=").append(userId);
        sb.append(", exceptionType=").append(exceptionType);
        sb.append(", exceptionContent=").append(exceptionContent);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append("]");
        return sb.toString();
    }
}