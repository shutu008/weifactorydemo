package com.vastsum.entity;

import java.util.Date;

/**
 * @author ssj
 * @create 2017-10-08 19:49
 */
public class DeviceSn {
    private String sn;
    private int status;
    private Date gmtCreate;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
