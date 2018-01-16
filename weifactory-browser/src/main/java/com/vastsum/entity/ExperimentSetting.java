package com.vastsum.entity;

import java.util.Date;

public class ExperimentSetting {
    private Integer experimentSettingId;

    private Integer experimentId;

    private Date nutrientLiquidLastChangeTime;

    private Date nutrientLiquidRemindTime;

    private Integer nutrientLiquidEmissionTime1;

    private Integer nutrientLiquidEmissionTime2;

    private Integer nutrientLiquidEmissionTime3;

    private Integer nutrientLiquidFillTime;

    private Integer nutrientLiquidEmptyTime;

    private Integer communicationFrequency;

    private String ipAddress;

    private Integer portNumber;

    private Integer samplingPeriod;

    private Integer storageCycle;

    private Integer outRoomTime;

    private Integer inRoomTime;

    private Boolean timeMode;

    private Integer dayDuration;

    private Integer timeShift;

    private Date gmtCreate;

    public Integer getExperimentSettingId() {
        return experimentSettingId;
    }

    public void setExperimentSettingId(Integer experimentSettingId) {
        this.experimentSettingId = experimentSettingId;
    }

    public Integer getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(Integer experimentId) {
        this.experimentId = experimentId;
    }

    public Date getNutrientLiquidLastChangeTime() {
        return nutrientLiquidLastChangeTime;
    }

    public void setNutrientLiquidLastChangeTime(Date nutrientLiquidLastChangeTime) {
        this.nutrientLiquidLastChangeTime = nutrientLiquidLastChangeTime;
    }

    public Date getNutrientLiquidRemindTime() {
        return nutrientLiquidRemindTime;
    }

    public void setNutrientLiquidRemindTime(Date nutrientLiquidRemindTime) {
        this.nutrientLiquidRemindTime = nutrientLiquidRemindTime;
    }

    public Integer getNutrientLiquidEmissionTime1() {
        return nutrientLiquidEmissionTime1;
    }

    public void setNutrientLiquidEmissionTime1(Integer nutrientLiquidEmissionTime1) {
        this.nutrientLiquidEmissionTime1 = nutrientLiquidEmissionTime1;
    }

    public Integer getNutrientLiquidEmissionTime2() {
        return nutrientLiquidEmissionTime2;
    }

    public void setNutrientLiquidEmissionTime2(Integer nutrientLiquidEmissionTime2) {
        this.nutrientLiquidEmissionTime2 = nutrientLiquidEmissionTime2;
    }

    public Integer getNutrientLiquidEmissionTime3() {
        return nutrientLiquidEmissionTime3;
    }

    public void setNutrientLiquidEmissionTime3(Integer nutrientLiquidEmissionTime3) {
        this.nutrientLiquidEmissionTime3 = nutrientLiquidEmissionTime3;
    }

    public Integer getNutrientLiquidFillTime() {
        return nutrientLiquidFillTime;
    }

    public void setNutrientLiquidFillTime(Integer nutrientLiquidFillTime) {
        this.nutrientLiquidFillTime = nutrientLiquidFillTime;
    }

    public Integer getNutrientLiquidEmptyTime() {
        return nutrientLiquidEmptyTime;
    }

    public void setNutrientLiquidEmptyTime(Integer nutrientLiquidEmptyTime) {
        this.nutrientLiquidEmptyTime = nutrientLiquidEmptyTime;
    }

    public Integer getCommunicationFrequency() {
        return communicationFrequency;
    }

    public void setCommunicationFrequency(Integer communicationFrequency) {
        this.communicationFrequency = communicationFrequency;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    public Integer getSamplingPeriod() {
        return samplingPeriod;
    }

    public void setSamplingPeriod(Integer samplingPeriod) {
        this.samplingPeriod = samplingPeriod;
    }

    public Integer getStorageCycle() {
        return storageCycle;
    }

    public void setStorageCycle(Integer storageCycle) {
        this.storageCycle = storageCycle;
    }

    public Integer getOutRoomTime() {
        return outRoomTime;
    }

    public void setOutRoomTime(Integer outRoomTime) {
        this.outRoomTime = outRoomTime;
    }

    public Integer getInRoomTime() {
        return inRoomTime;
    }

    public void setInRoomTime(Integer inRoomTime) {
        this.inRoomTime = inRoomTime;
    }

    public Boolean getTimeMode() {
        return timeMode;
    }

    public void setTimeMode(Boolean timeMode) {
        this.timeMode = timeMode;
    }

    public Integer getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(Integer dayDuration) {
        this.dayDuration = dayDuration;
    }

    public Integer getTimeShift() {
        return timeShift;
    }

    public void setTimeShift(Integer timeShift) {
        this.timeShift = timeShift;
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
        sb.append(", experimentSettingId=").append(experimentSettingId);
        sb.append(", experimentId=").append(experimentId);
        sb.append(", nutrientLiquidLastChangeTime=").append(nutrientLiquidLastChangeTime);
        sb.append(", nutrientLiquidRemindTime=").append(nutrientLiquidRemindTime);
        sb.append(", nutrientLiquidEmissionTime1=").append(nutrientLiquidEmissionTime1);
        sb.append(", nutrientLiquidEmissionTime2=").append(nutrientLiquidEmissionTime2);
        sb.append(", nutrientLiquidEmissionTime3=").append(nutrientLiquidEmissionTime3);
        sb.append(", nutrientLiquidFillTime=").append(nutrientLiquidFillTime);
        sb.append(", nutrientLiquidEmptyTime=").append(nutrientLiquidEmptyTime);
        sb.append(", communicationFrequency=").append(communicationFrequency);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", portNumber=").append(portNumber);
        sb.append(", samplingPeriod=").append(samplingPeriod);
        sb.append(", storageCycle=").append(storageCycle);
        sb.append(", outRoomTime=").append(outRoomTime);
        sb.append(", inRoomTime=").append(inRoomTime);
        sb.append(", timeMode=").append(timeMode);
        sb.append(", dayDuration=").append(dayDuration);
        sb.append(", timeShift=").append(timeShift);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append("]");
        return sb.toString();
    }
}