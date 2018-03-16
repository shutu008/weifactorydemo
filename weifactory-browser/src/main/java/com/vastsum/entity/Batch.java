package com.vastsum.entity;

import java.util.Date;

public class Batch {
    private Long batchId;

    private Integer deviceId;

    private String plantOneType;

    private String plantOne;

    private String cultModelOne;

    private Double temperatureOne;

    private Double humidityOne;

    private String ledOneLeft;

    private String ledOneMiddle;

    private String ledOneRight;

    private String videoOne;

    private Double lightOne;

    private String plantTwoType;

    private String plantTwo;

    private String cultModelTwo;

    private Double temperatureTwo;

    private Double humidityTwo;

    private String ledTwoLeft;

    private String ledTwoMiddle;

    private String ledTwoRight;

    private String videoTwo;

    private Double lightTwo;

    private String plantThreeType;

    private String plantThree;

    private String cultModelThree;

    private Double temperatureThree;

    private Double humidityThree;

    private String ledThreeLeft;

    private String ledThreeMiddle;

    private String ledThreeRight;

    private String videoThree;

    private Double lightThree;

    private Double co2;

    private Double ph;

    private Double ec;

    private Double ox;

    private Double solutionTemperature;

    private Double outdoorTemperature;

    private Double levelUp;

    private Double levelDown;

    private String status;

    private Integer modelId;

    private String orderStatus;

    private String trustStatus;

    private Date onePlantingTime;

    private Date oneRecoveryTime;

    private Date twoPlantingTime;

    private Date twoRecoveryTime;

    private Date threePlantingTime;

    private Date threeRecoveryTime;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getPlantOneType() {
        return plantOneType;
    }

    public void setPlantOneType(String plantOneType) {
        this.plantOneType = plantOneType == null ? null : plantOneType.trim();
    }

    public String getPlantOne() {
        return plantOne;
    }

    public void setPlantOne(String plantOne) {
        this.plantOne = plantOne == null ? null : plantOne.trim();
    }

    public String getCultModelOne() {
        return cultModelOne;
    }

    public void setCultModelOne(String cultModelOne) {
        this.cultModelOne = cultModelOne == null ? null : cultModelOne.trim();
    }

    public Double getTemperatureOne() {
        return temperatureOne;
    }

    public void setTemperatureOne(Double temperatureOne) {
        this.temperatureOne = temperatureOne;
    }

    public Double getHumidityOne() {
        return humidityOne;
    }

    public void setHumidityOne(Double humidityOne) {
        this.humidityOne = humidityOne;
    }

    public String getLedOneLeft() {
        return ledOneLeft;
    }

    public void setLedOneLeft(String ledOneLeft) {
        this.ledOneLeft = ledOneLeft == null ? null : ledOneLeft.trim();
    }

    public String getLedOneMiddle() {
        return ledOneMiddle;
    }

    public void setLedOneMiddle(String ledOneMiddle) {
        this.ledOneMiddle = ledOneMiddle == null ? null : ledOneMiddle.trim();
    }

    public String getLedOneRight() {
        return ledOneRight;
    }

    public void setLedOneRight(String ledOneRight) {
        this.ledOneRight = ledOneRight == null ? null : ledOneRight.trim();
    }

    public String getVideoOne() {
        return videoOne;
    }

    public void setVideoOne(String videoOne) {
        this.videoOne = videoOne == null ? null : videoOne.trim();
    }

    public Double getLightOne() {
        return lightOne;
    }

    public void setLightOne(Double lightOne) {
        this.lightOne = lightOne;
    }

    public String getPlantTwoType() {
        return plantTwoType;
    }

    public void setPlantTwoType(String plantTwoType) {
        this.plantTwoType = plantTwoType == null ? null : plantTwoType.trim();
    }

    public String getPlantTwo() {
        return plantTwo;
    }

    public void setPlantTwo(String plantTwo) {
        this.plantTwo = plantTwo == null ? null : plantTwo.trim();
    }

    public String getCultModelTwo() {
        return cultModelTwo;
    }

    public void setCultModelTwo(String cultModelTwo) {
        this.cultModelTwo = cultModelTwo == null ? null : cultModelTwo.trim();
    }

    public Double getTemperatureTwo() {
        return temperatureTwo;
    }

    public void setTemperatureTwo(Double temperatureTwo) {
        this.temperatureTwo = temperatureTwo;
    }

    public Double getHumidityTwo() {
        return humidityTwo;
    }

    public void setHumidityTwo(Double humidityTwo) {
        this.humidityTwo = humidityTwo;
    }

    public String getLedTwoLeft() {
        return ledTwoLeft;
    }

    public void setLedTwoLeft(String ledTwoLeft) {
        this.ledTwoLeft = ledTwoLeft == null ? null : ledTwoLeft.trim();
    }

    public String getLedTwoMiddle() {
        return ledTwoMiddle;
    }

    public void setLedTwoMiddle(String ledTwoMiddle) {
        this.ledTwoMiddle = ledTwoMiddle == null ? null : ledTwoMiddle.trim();
    }

    public String getLedTwoRight() {
        return ledTwoRight;
    }

    public void setLedTwoRight(String ledTwoRight) {
        this.ledTwoRight = ledTwoRight == null ? null : ledTwoRight.trim();
    }

    public String getVideoTwo() {
        return videoTwo;
    }

    public void setVideoTwo(String videoTwo) {
        this.videoTwo = videoTwo == null ? null : videoTwo.trim();
    }

    public Double getLightTwo() {
        return lightTwo;
    }

    public void setLightTwo(Double lightTwo) {
        this.lightTwo = lightTwo;
    }

    public String getPlantThreeType() {
        return plantThreeType;
    }

    public void setPlantThreeType(String plantThreeType) {
        this.plantThreeType = plantThreeType == null ? null : plantThreeType.trim();
    }

    public String getPlantThree() {
        return plantThree;
    }

    public void setPlantThree(String plantThree) {
        this.plantThree = plantThree == null ? null : plantThree.trim();
    }

    public String getCultModelThree() {
        return cultModelThree;
    }

    public void setCultModelThree(String cultModelThree) {
        this.cultModelThree = cultModelThree == null ? null : cultModelThree.trim();
    }

    public Double getTemperatureThree() {
        return temperatureThree;
    }

    public void setTemperatureThree(Double temperatureThree) {
        this.temperatureThree = temperatureThree;
    }

    public Double getHumidityThree() {
        return humidityThree;
    }

    public void setHumidityThree(Double humidityThree) {
        this.humidityThree = humidityThree;
    }

    public String getLedThreeLeft() {
        return ledThreeLeft;
    }

    public void setLedThreeLeft(String ledThreeLeft) {
        this.ledThreeLeft = ledThreeLeft == null ? null : ledThreeLeft.trim();
    }

    public String getLedThreeMiddle() {
        return ledThreeMiddle;
    }

    public void setLedThreeMiddle(String ledThreeMiddle) {
        this.ledThreeMiddle = ledThreeMiddle == null ? null : ledThreeMiddle.trim();
    }

    public String getLedThreeRight() {
        return ledThreeRight;
    }

    public void setLedThreeRight(String ledThreeRight) {
        this.ledThreeRight = ledThreeRight == null ? null : ledThreeRight.trim();
    }

    public String getVideoThree() {
        return videoThree;
    }

    public void setVideoThree(String videoThree) {
        this.videoThree = videoThree == null ? null : videoThree.trim();
    }

    public Double getLightThree() {
        return lightThree;
    }

    public void setLightThree(Double lightThree) {
        this.lightThree = lightThree;
    }

    public Double getCo2() {
        return co2;
    }

    public void setCo2(Double co2) {
        this.co2 = co2;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getEc() {
        return ec;
    }

    public void setEc(Double ec) {
        this.ec = ec;
    }

    public Double getOx() {
        return ox;
    }

    public void setOx(Double ox) {
        this.ox = ox;
    }

    public Double getSolutionTemperature() {
        return solutionTemperature;
    }

    public void setSolutionTemperature(Double solutionTemperature) {
        this.solutionTemperature = solutionTemperature;
    }

    public Double getOutdoorTemperature() {
        return outdoorTemperature;
    }

    public void setOutdoorTemperature(Double outdoorTemperature) {
        this.outdoorTemperature = outdoorTemperature;
    }

    public Double getLevelUp() {
        return levelUp;
    }

    public void setLevelUp(Double levelUp) {
        this.levelUp = levelUp;
    }

    public Double getLevelDown() {
        return levelDown;
    }

    public void setLevelDown(Double levelDown) {
        this.levelDown = levelDown;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getTrustStatus() {
        return trustStatus;
    }

    public void setTrustStatus(String trustStatus) {
        this.trustStatus = trustStatus == null ? null : trustStatus.trim();
    }

    public Date getOnePlantingTime() {
        return onePlantingTime;
    }

    public void setOnePlantingTime(Date onePlantingTime) {
        this.onePlantingTime = onePlantingTime;
    }

    public Date getOneRecoveryTime() {
        return oneRecoveryTime;
    }

    public void setOneRecoveryTime(Date oneRecoveryTime) {
        this.oneRecoveryTime = oneRecoveryTime;
    }

    public Date getTwoPlantingTime() {
        return twoPlantingTime;
    }

    public void setTwoPlantingTime(Date twoPlantingTime) {
        this.twoPlantingTime = twoPlantingTime;
    }

    public Date getTwoRecoveryTime() {
        return twoRecoveryTime;
    }

    public void setTwoRecoveryTime(Date twoRecoveryTime) {
        this.twoRecoveryTime = twoRecoveryTime;
    }

    public Date getThreePlantingTime() {
        return threePlantingTime;
    }

    public void setThreePlantingTime(Date threePlantingTime) {
        this.threePlantingTime = threePlantingTime;
    }

    public Date getThreeRecoveryTime() {
        return threeRecoveryTime;
    }

    public void setThreeRecoveryTime(Date threeRecoveryTime) {
        this.threeRecoveryTime = threeRecoveryTime;
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
        sb.append(", batchId=").append(batchId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", plantOneType=").append(plantOneType);
        sb.append(", plantOne=").append(plantOne);
        sb.append(", cultModelOne=").append(cultModelOne);
        sb.append(", temperatureOne=").append(temperatureOne);
        sb.append(", humidityOne=").append(humidityOne);
        sb.append(", ledOneLeft=").append(ledOneLeft);
        sb.append(", ledOneMiddle=").append(ledOneMiddle);
        sb.append(", ledOneRight=").append(ledOneRight);
        sb.append(", videoOne=").append(videoOne);
        sb.append(", lightOne=").append(lightOne);
        sb.append(", plantTwoType=").append(plantTwoType);
        sb.append(", plantTwo=").append(plantTwo);
        sb.append(", cultModelTwo=").append(cultModelTwo);
        sb.append(", temperatureTwo=").append(temperatureTwo);
        sb.append(", humidityTwo=").append(humidityTwo);
        sb.append(", ledTwoLeft=").append(ledTwoLeft);
        sb.append(", ledTwoMiddle=").append(ledTwoMiddle);
        sb.append(", ledTwoRight=").append(ledTwoRight);
        sb.append(", videoTwo=").append(videoTwo);
        sb.append(", lightTwo=").append(lightTwo);
        sb.append(", plantThreeType=").append(plantThreeType);
        sb.append(", plantThree=").append(plantThree);
        sb.append(", cultModelThree=").append(cultModelThree);
        sb.append(", temperatureThree=").append(temperatureThree);
        sb.append(", humidityThree=").append(humidityThree);
        sb.append(", ledThreeLeft=").append(ledThreeLeft);
        sb.append(", ledThreeMiddle=").append(ledThreeMiddle);
        sb.append(", ledThreeRight=").append(ledThreeRight);
        sb.append(", videoThree=").append(videoThree);
        sb.append(", lightThree=").append(lightThree);
        sb.append(", co2=").append(co2);
        sb.append(", ph=").append(ph);
        sb.append(", ec=").append(ec);
        sb.append(", ox=").append(ox);
        sb.append(", solutionTemperature=").append(solutionTemperature);
        sb.append(", outdoorTemperature=").append(outdoorTemperature);
        sb.append(", levelUp=").append(levelUp);
        sb.append(", levelDown=").append(levelDown);
        sb.append(", status=").append(status);
        sb.append(", modelId=").append(modelId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", trustStatus=").append(trustStatus);
        sb.append(", onePlantingTime=").append(onePlantingTime);
        sb.append(", oneRecoveryTime=").append(oneRecoveryTime);
        sb.append(", twoPlantingTime=").append(twoPlantingTime);
        sb.append(", twoRecoveryTime=").append(twoRecoveryTime);
        sb.append(", threePlantingTime=").append(threePlantingTime);
        sb.append(", threeRecoveryTime=").append(threeRecoveryTime);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}