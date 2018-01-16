package com.vastsum.entity;

import java.util.Date;

public class Experiment {
    private Integer experimentId;

    private Integer deviceId;

    private String cropName1;

    private Date plantTime1;

    private Date harvestTime1;

    private Integer plantNumber1;

    private Integer leaveNumber1;

    private Integer controlModel1;

    private String cropName2;

    private Date plantTime2;

    private Date harvestTime2;

    private Integer plantNumber2;

    private Integer leaveNumber2;

    private Integer controlModel2;

    private String cropName3;

    private Date plantTime3;

    private Date harvestTime3;

    private Integer plantNumber3;

    private Integer leaveNumber3;

    private Integer controlModel3;

    private String seedingName;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(Integer experimentId) {
        this.experimentId = experimentId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getCropName1() {
        return cropName1;
    }

    public void setCropName1(String cropName1) {
        this.cropName1 = cropName1 == null ? null : cropName1.trim();
    }

    public Date getPlantTime1() {
        return plantTime1;
    }

    public void setPlantTime1(Date plantTime1) {
        this.plantTime1 = plantTime1;
    }

    public Date getHarvestTime1() {
        return harvestTime1;
    }

    public void setHarvestTime1(Date harvestTime1) {
        this.harvestTime1 = harvestTime1;
    }

    public Integer getPlantNumber1() {
        return plantNumber1;
    }

    public void setPlantNumber1(Integer plantNumber1) {
        this.plantNumber1 = plantNumber1;
    }

    public Integer getLeaveNumber1() {
        return leaveNumber1;
    }

    public void setLeaveNumber1(Integer leaveNumber1) {
        this.leaveNumber1 = leaveNumber1;
    }

    public Integer getControlModel1() {
        return controlModel1;
    }

    public void setControlModel1(Integer controlModel1) {
        this.controlModel1 = controlModel1;
    }

    public String getCropName2() {
        return cropName2;
    }

    public void setCropName2(String cropName2) {
        this.cropName2 = cropName2 == null ? null : cropName2.trim();
    }

    public Date getPlantTime2() {
        return plantTime2;
    }

    public void setPlantTime2(Date plantTime2) {
        this.plantTime2 = plantTime2;
    }

    public Date getHarvestTime2() {
        return harvestTime2;
    }

    public void setHarvestTime2(Date harvestTime2) {
        this.harvestTime2 = harvestTime2;
    }

    public Integer getPlantNumber2() {
        return plantNumber2;
    }

    public void setPlantNumber2(Integer plantNumber2) {
        this.plantNumber2 = plantNumber2;
    }

    public Integer getLeaveNumber2() {
        return leaveNumber2;
    }

    public void setLeaveNumber2(Integer leaveNumber2) {
        this.leaveNumber2 = leaveNumber2;
    }

    public Integer getControlModel2() {
        return controlModel2;
    }

    public void setControlModel2(Integer controlModel2) {
        this.controlModel2 = controlModel2;
    }

    public String getCropName3() {
        return cropName3;
    }

    public void setCropName3(String cropName3) {
        this.cropName3 = cropName3 == null ? null : cropName3.trim();
    }

    public Date getPlantTime3() {
        return plantTime3;
    }

    public void setPlantTime3(Date plantTime3) {
        this.plantTime3 = plantTime3;
    }

    public Date getHarvestTime3() {
        return harvestTime3;
    }

    public void setHarvestTime3(Date harvestTime3) {
        this.harvestTime3 = harvestTime3;
    }

    public Integer getPlantNumber3() {
        return plantNumber3;
    }

    public void setPlantNumber3(Integer plantNumber3) {
        this.plantNumber3 = plantNumber3;
    }

    public Integer getLeaveNumber3() {
        return leaveNumber3;
    }

    public void setLeaveNumber3(Integer leaveNumber3) {
        this.leaveNumber3 = leaveNumber3;
    }

    public Integer getControlModel3() {
        return controlModel3;
    }

    public void setControlModel3(Integer controlModel3) {
        this.controlModel3 = controlModel3;
    }

    public String getSeedingName() {
        return seedingName;
    }

    public void setSeedingName(String seedingName) {
        this.seedingName = seedingName == null ? null : seedingName.trim();
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
        sb.append(", experimentId=").append(experimentId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", cropName1=").append(cropName1);
        sb.append(", plantTime1=").append(plantTime1);
        sb.append(", harvestTime1=").append(harvestTime1);
        sb.append(", plantNumber1=").append(plantNumber1);
        sb.append(", leaveNumber1=").append(leaveNumber1);
        sb.append(", controlModel1=").append(controlModel1);
        sb.append(", cropName2=").append(cropName2);
        sb.append(", plantTime2=").append(plantTime2);
        sb.append(", harvestTime2=").append(harvestTime2);
        sb.append(", plantNumber2=").append(plantNumber2);
        sb.append(", leaveNumber2=").append(leaveNumber2);
        sb.append(", controlModel2=").append(controlModel2);
        sb.append(", cropName3=").append(cropName3);
        sb.append(", plantTime3=").append(plantTime3);
        sb.append(", harvestTime3=").append(harvestTime3);
        sb.append(", plantNumber3=").append(plantNumber3);
        sb.append(", leaveNumber3=").append(leaveNumber3);
        sb.append(", controlModel3=").append(controlModel3);
        sb.append(", seedingName=").append(seedingName);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}