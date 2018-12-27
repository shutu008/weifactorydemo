package com.vastsum.entity;

import java.util.Date;

public class Seed {
    private Long seedId;

    private Long batchId;

    private String seedRoomPlant;

    private Date seedPlantingTime;

    private Date seedRecoveryTime;

    private String seedLed;

    private String seedSpray;

    private String status;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getSeedId() {
        return seedId;
    }

    public void setSeedId(Long seedId) {
        this.seedId = seedId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getSeedRoomPlant() {
        return seedRoomPlant;
    }

    public void setSeedRoomPlant(String seedRoomPlant) {
        this.seedRoomPlant = seedRoomPlant == null ? null : seedRoomPlant.trim();
    }

    public Date getSeedPlantingTime() {
        return seedPlantingTime;
    }

    public void setSeedPlantingTime(Date seedPlantingTime) {
        this.seedPlantingTime = seedPlantingTime;
    }

    public Date getSeedRecoveryTime() {
        return seedRecoveryTime;
    }

    public void setSeedRecoveryTime(Date seedRecoveryTime) {
        this.seedRecoveryTime = seedRecoveryTime;
    }

    public String getSeedLed() {
        return seedLed;
    }

    public void setSeedLed(String seedLed) {
        this.seedLed = seedLed == null ? null : seedLed.trim();
    }

    public String getSeedSpray() {
        return seedSpray;
    }

    public void setSeedSpray(String seedSpray) {
        this.seedSpray = seedSpray == null ? null : seedSpray.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", seedId=").append(seedId);
        sb.append(", batchId=").append(batchId);
        sb.append(", seedRoomPlant=").append(seedRoomPlant);
        sb.append(", seedPlantingTime=").append(seedPlantingTime);
        sb.append(", seedRecoveryTime=").append(seedRecoveryTime);
        sb.append(", seedLed=").append(seedLed);
        sb.append(", seedSpray=").append(seedSpray);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}