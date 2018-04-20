package com.vastsum.schedule.entity;

import java.io.Serializable;
import java.util.Date;

public class ScheduleJobEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5268818877412920573L;
	public static final String JOB_PARAM_KEY = "VASTSUM";
    private Long jobId;

    private String cronExpression;

    private Date gmtCreate;

    private Date gmtModified;

    private String methodName;

    private String params;

    private String remark;

    private String status;

    private String beanName;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", jobId=").append(jobId);
        sb.append(", cronExpression=").append(cronExpression);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", methodName=").append(methodName);
        sb.append(", params=").append(params);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", beanName=").append(beanName);
        sb.append("]");
        return sb.toString();
    }
}