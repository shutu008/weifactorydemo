package com.vastsum.entity;

import java.util.Date;

public class Sensor {
    private Integer sensorId;

    private Integer deviceId;

    private String sn;

    private String batchNo;

    private Double sensorTemperature1;

    private Double sensorTemperature2;

    private Double sensorTemperature3;

    private Double sensorHumidity1;

    private Double sensorHumidity2;

    private Double sensorHumidity3;

    private Double sensorIllumination1;

    private Double sensorIllumination2;

    private Double sensorIllumination3;

    private Double sensorCo2;

    private Double sensorPh;

    private Double sensorEc;

    private Double sensorOxygen;

    private Double sensorNutrientSolution;

    private Double outdoorTemperature;

    private Double sensorHighLevel;

    private Double sensorLowLevel;

    private String imgPath1;

    private String imgPath2;

    private String imgPath3;

    private Date gmtCreate;

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public Double getSensorTemperature1() {
        return sensorTemperature1;
    }

    public void setSensorTemperature1(Double sensorTemperature1) {
        this.sensorTemperature1 = sensorTemperature1;
    }

    public Double getSensorTemperature2() {
        return sensorTemperature2;
    }

    public void setSensorTemperature2(Double sensorTemperature2) {
        this.sensorTemperature2 = sensorTemperature2;
    }

    public Double getSensorTemperature3() {
        return sensorTemperature3;
    }

    public void setSensorTemperature3(Double sensorTemperature3) {
        this.sensorTemperature3 = sensorTemperature3;
    }

    public Double getSensorHumidity1() {
        return sensorHumidity1;
    }

    public void setSensorHumidity1(Double sensorHumidity1) {
        this.sensorHumidity1 = sensorHumidity1;
    }

    public Double getSensorHumidity2() {
        return sensorHumidity2;
    }

    public void setSensorHumidity2(Double sensorHumidity2) {
        this.sensorHumidity2 = sensorHumidity2;
    }

    public Double getSensorHumidity3() {
        return sensorHumidity3;
    }

    public void setSensorHumidity3(Double sensorHumidity3) {
        this.sensorHumidity3 = sensorHumidity3;
    }

    public Double getSensorIllumination1() {
        return sensorIllumination1;
    }

    public void setSensorIllumination1(Double sensorIllumination1) {
        this.sensorIllumination1 = sensorIllumination1;
    }

    public Double getSensorIllumination2() {
        return sensorIllumination2;
    }

    public void setSensorIllumination2(Double sensorIllumination2) {
        this.sensorIllumination2 = sensorIllumination2;
    }

    public Double getSensorIllumination3() {
        return sensorIllumination3;
    }

    public void setSensorIllumination3(Double sensorIllumination3) {
        this.sensorIllumination3 = sensorIllumination3;
    }

    public Double getSensorCo2() {
        return sensorCo2;
    }

    public void setSensorCo2(Double sensorCo2) {
        this.sensorCo2 = sensorCo2;
    }

    public Double getSensorPh() {
        return sensorPh;
    }

    public void setSensorPh(Double sensorPh) {
        this.sensorPh = sensorPh;
    }

    public Double getSensorEc() {
        return sensorEc;
    }

    public void setSensorEc(Double sensorEc) {
        this.sensorEc = sensorEc;
    }

    public Double getSensorOxygen() {
        return sensorOxygen;
    }

    public void setSensorOxygen(Double sensorOxygen) {
        this.sensorOxygen = sensorOxygen;
    }

    public Double getSensorNutrientSolution() {
        return sensorNutrientSolution;
    }

    public void setSensorNutrientSolution(Double sensorNutrientSolution) {
        this.sensorNutrientSolution = sensorNutrientSolution;
    }

    public Double getOutdoorTemperature() {
        return outdoorTemperature;
    }

    public void setOutdoorTemperature(Double outdoorTemperature) {
        this.outdoorTemperature = outdoorTemperature;
    }

    public Double getSensorHighLevel() {
        return sensorHighLevel;
    }

    public void setSensorHighLevel(Double sensorHighLevel) {
        this.sensorHighLevel = sensorHighLevel;
    }

    public Double getSensorLowLevel() {
        return sensorLowLevel;
    }

    public void setSensorLowLevel(Double sensorLowLevel) {
        this.sensorLowLevel = sensorLowLevel;
    }

    public String getImgPath1() {
        return imgPath1;
    }

    public void setImgPath1(String imgPath1) {
        this.imgPath1 = imgPath1 == null ? null : imgPath1.trim();
    }

    public String getImgPath2() {
        return imgPath2;
    }

    public void setImgPath2(String imgPath2) {
        this.imgPath2 = imgPath2 == null ? null : imgPath2.trim();
    }

    public String getImgPath3() {
        return imgPath3;
    }

    public void setImgPath3(String imgPath3) {
        this.imgPath3 = imgPath3 == null ? null : imgPath3.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sensorId=").append(sensorId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", sn=").append(sn);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", sensorTemperature1=").append(sensorTemperature1);
        sb.append(", sensorTemperature2=").append(sensorTemperature2);
        sb.append(", sensorTemperature3=").append(sensorTemperature3);
        sb.append(", sensorHumidity1=").append(sensorHumidity1);
        sb.append(", sensorHumidity2=").append(sensorHumidity2);
        sb.append(", sensorHumidity3=").append(sensorHumidity3);
        sb.append(", sensorIllumination1=").append(sensorIllumination1);
        sb.append(", sensorIllumination2=").append(sensorIllumination2);
        sb.append(", sensorIllumination3=").append(sensorIllumination3);
        sb.append(", sensorCo2=").append(sensorCo2);
        sb.append(", sensorPh=").append(sensorPh);
        sb.append(", sensorEc=").append(sensorEc);
        sb.append(", sensorOxygen=").append(sensorOxygen);
        sb.append(", sensorNutrientSolution=").append(sensorNutrientSolution);
        sb.append(", outdoorTemperature=").append(outdoorTemperature);
        sb.append(", sensorHighLevel=").append(sensorHighLevel);
        sb.append(", sensorLowLevel=").append(sensorLowLevel);
        sb.append(", imgPath1=").append(imgPath1);
        sb.append(", imgPath2=").append(imgPath2);
        sb.append(", imgPath3=").append(imgPath3);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append("]");
        return sb.toString();
    }
}