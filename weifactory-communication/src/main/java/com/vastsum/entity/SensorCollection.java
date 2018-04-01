package com.vastsum.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ssj
 * @create 2017-10-01 7:30
 */
public class SensorCollection implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5497310740247888567L;
	private Long id;            //序号id
    private String sn;          //设备序列号
    private Integer sensor;     //传感器编号
    private String data;        //数据
    private Integer dataType;   //数据类型
    private String batchNo;       //批次号用于标识采集批次
    private Date gmtCreate;     //插入时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return "SensorCollection{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", sensor=" + sensor +
                ", data='" + data + '\'' +
                ", dataType=" + dataType +
                ", batchNo=" + batchNo +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}
