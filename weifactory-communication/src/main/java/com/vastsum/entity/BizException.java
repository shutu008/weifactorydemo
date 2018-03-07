package com.vastsum.entity;

import java.util.Date;

/**
 * @author ssj
 * @create 2017-11-23 21:59
 */
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
        this.sn = sn;
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
        this.exceptionContent = exceptionContent;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
