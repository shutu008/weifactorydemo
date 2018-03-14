package com.vastsum.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String realname;

    private String userPassword;

    private String userPhone;

    private Boolean isBindPhone;

    private String userEmail;

    private String userWeixinId;

    private String userWeixinNickname;

    private String personalIntroduction;

    private String appId;

    private String appSecret;

    private Date gmtCreate;

    private Date gmtModified;

    private Boolean enabled;

    private String loginStatus;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Boolean getIsBindPhone() {
        return isBindPhone;
    }

    public void setIsBindPhone(Boolean isBindPhone) {
        this.isBindPhone = isBindPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserWeixinId() {
        return userWeixinId;
    }

    public void setUserWeixinId(String userWeixinId) {
        this.userWeixinId = userWeixinId == null ? null : userWeixinId.trim();
    }

    public String getUserWeixinNickname() {
        return userWeixinNickname;
    }

    public void setUserWeixinNickname(String userWeixinNickname) {
        this.userWeixinNickname = userWeixinNickname == null ? null : userWeixinNickname.trim();
    }

    public String getPersonalIntroduction() {
        return personalIntroduction;
    }

    public void setPersonalIntroduction(String personalIntroduction) {
        this.personalIntroduction = personalIntroduction == null ? null : personalIntroduction.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus == null ? null : loginStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", realname=").append(realname);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", isBindPhone=").append(isBindPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userWeixinId=").append(userWeixinId);
        sb.append(", userWeixinNickname=").append(userWeixinNickname);
        sb.append(", personalIntroduction=").append(personalIntroduction);
        sb.append(", appId=").append(appId);
        sb.append(", appSecret=").append(appSecret);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", enabled=").append(enabled);
        sb.append(", loginStatus=").append(loginStatus);
        sb.append("]");
        return sb.toString();
    }
}