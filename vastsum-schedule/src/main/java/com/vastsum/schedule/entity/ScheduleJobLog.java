package com.vastsum.schedule.entity;

import java.io.Serializable;
import java.util.Date;

public class ScheduleJobLog implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3544125469293253370L;

	private Long logId;

    private String errorMessage;

    private Date gmtCreate;

    private Long jobId;

    private String methodName;

    private String params;

    private String status;

    private Integer times;

    private String beanName;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName == null ? null : beanName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", jobId=").append(jobId);
        sb.append(", methodName=").append(methodName);
        sb.append(", params=").append(params);
        sb.append(", status=").append(status);
        sb.append(", times=").append(times);
        sb.append(", beanName=").append(beanName);
        sb.append("]");
        return sb.toString();
    }
}