package com.vastsum.entity;

import java.util.Date;

public class BSysParam {
    private Long sysId;

    private String sn;

    private Double jingdu;

    private Double weidu;

    private Long userId;

    private String phone;

    private String wechat;

    private String phoneStatus;

    private String shareStatus;

    private String comment;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getSysId() {
        return sysId;
    }

    public void setSysId(Long sysId) {
        this.sysId = sysId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Double getJingdu() {
        return jingdu;
    }

    public void setJingdu(Double jingdu) {
        this.jingdu = jingdu;
    }

    public Double getWeidu() {
        return weidu;
    }

    public void setWeidu(Double weidu) {
        this.weidu = weidu;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus == null ? null : phoneStatus.trim();
    }

    public String getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus == null ? null : shareStatus.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
        sb.append(", sysId=").append(sysId);
        sb.append(", sn=").append(sn);
        sb.append(", jingdu=").append(jingdu);
        sb.append(", weidu=").append(weidu);
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", wechat=").append(wechat);
        sb.append(", phoneStatus=").append(phoneStatus);
        sb.append(", shareStatus=").append(shareStatus);
        sb.append(", comment=").append(comment);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}