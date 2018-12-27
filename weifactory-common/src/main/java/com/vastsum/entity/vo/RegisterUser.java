package com.vastsum.entity.vo;

import java.io.Serializable;

/**
 * @author ssj
 * @create 2017-07-30 20:35
 */
public class RegisterUser implements Serializable {
    private static final long serialVersionUID = 5737111696792183056L;
    private String userName;
    private String userPassword;
    private String enpassword;
    private String userEmail;
    private String userPhone;
    private Integer roleId;
    private String codeNum;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEnpassword() {
        return enpassword;
    }

    public void setEnpassword(String enpassword) {
        this.enpassword = enpassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(String codeNum) {
        this.codeNum = codeNum;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
