package com.vastsum.entity.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ssj
 * @create 2017-08-12 7:48
 */
public class UserInfo implements Serializable {
	private static final long serialVersionUID = -8642874349687483464L;
	private Integer userId;             //用户id
    private String userName;            //用户名
    private String userPhone;           //手机号
    private String email;               //邮箱
    private String weixinId;            //微信号
    private String weixinNickName;      //微信昵称
    private String introduction;        //用户介绍
    private String roleName;            //角色名
    private Date gmtCreate;             //用户创建时间
    private Date gmtModified;           //用户修改时间
    private String enabled;             //是否可用1：可用；0：不可用

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
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(String weixinId) {
        this.weixinId = weixinId;
    }

    public String getWeixinNickName() {
        return weixinNickName;
    }

    public void setWeixinNickName(String weixinNickName) {
        this.weixinNickName = weixinNickName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRoleName() {
        return roleName;
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

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", email='" + email + '\'' +
                ", weixinId='" + weixinId + '\'' +
                ", weixinNickName='" + weixinNickName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", roleName='" + roleName + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", enabled='" + enabled + '\'' +
                '}';
    }
}
