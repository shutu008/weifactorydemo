package com.vastsum.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ssj
 * @create 2017-09-25 22:07
 */
public class TestSensor implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 557651604829532705L;
	private Integer id;
    private String sn;
    private Integer sensor;
    private String data;
    private Integer dataType;
    private Date  gmtCreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getSensor() {
        return sensor;
    }

    public void setSensor(Integer sensor) {
        this.sensor = sensor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }


    @Override
    public String toString() {
        return "TestSensor{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", sensor=" + sensor +
                ", data='" + data + '\'' +
                ", dataType=" + dataType +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}
