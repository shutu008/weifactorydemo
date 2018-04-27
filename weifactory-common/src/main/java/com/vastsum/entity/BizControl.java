package com.vastsum.entity;

import java.util.Date;

public class BizControl {
    private Long controlId;

    private String sn;

    private String actuatorName;

    private Integer actuatorId;

    private String status;

    private String timeval;

    private Date startTime;

    private Date endTime;

    private Integer position;

    private String enabled;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getControlId() {
        return controlId;
    }

    public void setControlId(Long controlId) {
        this.controlId = controlId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getActuatorName() {
        return actuatorName;
    }

    public void setActuatorName(String actuatorName) {
        this.actuatorName = actuatorName == null ? null : actuatorName.trim();
    }

    public Integer getActuatorId() {
        return actuatorId;
    }

    public void setActuatorId(Integer actuatorId) {
        this.actuatorId = actuatorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTimeval() {
        return timeval;
    }

    public void setTimeval(String timeval) {
        this.timeval = timeval == null ? null : timeval.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", controlId=").append(controlId);
        sb.append(", sn=").append(sn);
        sb.append(", actuatorName=").append(actuatorName);
        sb.append(", actuatorId=").append(actuatorId);
        sb.append(", status=").append(status);
        sb.append(", timeval=").append(timeval);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", position=").append(position);
        sb.append(", enabled=").append(enabled);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}