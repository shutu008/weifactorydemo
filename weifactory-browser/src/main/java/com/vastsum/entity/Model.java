package com.vastsum.entity;

import java.util.Date;

public class Model {
    private Integer modelId;

    private Integer userId;

    private String modelName;

    private Double temperatureUp;

    private Double temperatureDown;

    private Double humidityUp;

    private Double humidityDown;

    private Double illuminationUp;

    private Double illuminationDown;

    private Double co2Up;

    private Double co2Down;

    private Double phUp;

    private Double phDown;

    private Double ecUp;

    private Double ecDown;

    private Double oxygenUp;

    private Double oxygenDown;

    private Double highLevelUp;

    private Double hightLevelDown;

    private Double lowLevelUp;

    private Double lowLevelDown;

    private Boolean status;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public Double getTemperatureUp() {
        return temperatureUp;
    }

    public void setTemperatureUp(Double temperatureUp) {
        this.temperatureUp = temperatureUp;
    }

    public Double getTemperatureDown() {
        return temperatureDown;
    }

    public void setTemperatureDown(Double temperatureDown) {
        this.temperatureDown = temperatureDown;
    }

    public Double getHumidityUp() {
        return humidityUp;
    }

    public void setHumidityUp(Double humidityUp) {
        this.humidityUp = humidityUp;
    }

    public Double getHumidityDown() {
        return humidityDown;
    }

    public void setHumidityDown(Double humidityDown) {
        this.humidityDown = humidityDown;
    }

    public Double getIlluminationUp() {
        return illuminationUp;
    }

    public void setIlluminationUp(Double illuminationUp) {
        this.illuminationUp = illuminationUp;
    }

    public Double getIlluminationDown() {
        return illuminationDown;
    }

    public void setIlluminationDown(Double illuminationDown) {
        this.illuminationDown = illuminationDown;
    }

    public Double getCo2Up() {
        return co2Up;
    }

    public void setCo2Up(Double co2Up) {
        this.co2Up = co2Up;
    }

    public Double getCo2Down() {
        return co2Down;
    }

    public void setCo2Down(Double co2Down) {
        this.co2Down = co2Down;
    }

    public Double getPhUp() {
        return phUp;
    }

    public void setPhUp(Double phUp) {
        this.phUp = phUp;
    }

    public Double getPhDown() {
        return phDown;
    }

    public void setPhDown(Double phDown) {
        this.phDown = phDown;
    }

    public Double getEcUp() {
        return ecUp;
    }

    public void setEcUp(Double ecUp) {
        this.ecUp = ecUp;
    }

    public Double getEcDown() {
        return ecDown;
    }

    public void setEcDown(Double ecDown) {
        this.ecDown = ecDown;
    }

    public Double getOxygenUp() {
        return oxygenUp;
    }

    public void setOxygenUp(Double oxygenUp) {
        this.oxygenUp = oxygenUp;
    }

    public Double getOxygenDown() {
        return oxygenDown;
    }

    public void setOxygenDown(Double oxygenDown) {
        this.oxygenDown = oxygenDown;
    }

    public Double getHighLevelUp() {
        return highLevelUp;
    }

    public void setHighLevelUp(Double highLevelUp) {
        this.highLevelUp = highLevelUp;
    }

    public Double getHightLevelDown() {
        return hightLevelDown;
    }

    public void setHightLevelDown(Double hightLevelDown) {
        this.hightLevelDown = hightLevelDown;
    }

    public Double getLowLevelUp() {
        return lowLevelUp;
    }

    public void setLowLevelUp(Double lowLevelUp) {
        this.lowLevelUp = lowLevelUp;
    }

    public Double getLowLevelDown() {
        return lowLevelDown;
    }

    public void setLowLevelDown(Double lowLevelDown) {
        this.lowLevelDown = lowLevelDown;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
        sb.append(", modelId=").append(modelId);
        sb.append(", userId=").append(userId);
        sb.append(", modelName=").append(modelName);
        sb.append(", temperatureUp=").append(temperatureUp);
        sb.append(", temperatureDown=").append(temperatureDown);
        sb.append(", humidityUp=").append(humidityUp);
        sb.append(", humidityDown=").append(humidityDown);
        sb.append(", illuminationUp=").append(illuminationUp);
        sb.append(", illuminationDown=").append(illuminationDown);
        sb.append(", co2Up=").append(co2Up);
        sb.append(", co2Down=").append(co2Down);
        sb.append(", phUp=").append(phUp);
        sb.append(", phDown=").append(phDown);
        sb.append(", ecUp=").append(ecUp);
        sb.append(", ecDown=").append(ecDown);
        sb.append(", oxygenUp=").append(oxygenUp);
        sb.append(", oxygenDown=").append(oxygenDown);
        sb.append(", highLevelUp=").append(highLevelUp);
        sb.append(", hightLevelDown=").append(hightLevelDown);
        sb.append(", lowLevelUp=").append(lowLevelUp);
        sb.append(", lowLevelDown=").append(lowLevelDown);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}