package com.vastsum.entity;

import java.util.Date;

public class PlantInfo {
    private Long plantInfoId;

    private Long batchId;

    private String plantName1;

    private Date plantDate1;

    private Date recoveryDate1;

    private Integer plantNum1;

    private Integer plantLeafNum1;

    private Integer controlMod1;

    private String plantName2;

    private Date plantDate2;

    private Date recoveryDate2;

    private Integer plantNum2;

    private Integer plantLeafNum2;

    private Integer controlMod2;

    private String plantName3;

    private Date plantDate3;

    private Date recoveryDate3;

    private Integer plantNum3;

    private Integer plantLeafNum3;

    private Integer controlMod3;

    private String feedName;

    private Date feedDate;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getPlantInfoId() {
        return plantInfoId;
    }

    public void setPlantInfoId(Long plantInfoId) {
        this.plantInfoId = plantInfoId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getPlantName1() {
        return plantName1;
    }

    public void setPlantName1(String plantName1) {
        this.plantName1 = plantName1 == null ? null : plantName1.trim();
    }

    public Date getPlantDate1() {
        return plantDate1;
    }

    public void setPlantDate1(Date plantDate1) {
        this.plantDate1 = plantDate1;
    }

    public Date getRecoveryDate1() {
        return recoveryDate1;
    }

    public void setRecoveryDate1(Date recoveryDate1) {
        this.recoveryDate1 = recoveryDate1;
    }

    public Integer getPlantNum1() {
        return plantNum1;
    }

    public void setPlantNum1(Integer plantNum1) {
        this.plantNum1 = plantNum1;
    }

    public Integer getPlantLeafNum1() {
        return plantLeafNum1;
    }

    public void setPlantLeafNum1(Integer plantLeafNum1) {
        this.plantLeafNum1 = plantLeafNum1;
    }

    public Integer getControlMod1() {
        return controlMod1;
    }

    public void setControlMod1(Integer controlMod1) {
        this.controlMod1 = controlMod1;
    }

    public String getPlantName2() {
        return plantName2;
    }

    public void setPlantName2(String plantName2) {
        this.plantName2 = plantName2 == null ? null : plantName2.trim();
    }

    public Date getPlantDate2() {
        return plantDate2;
    }

    public void setPlantDate2(Date plantDate2) {
        this.plantDate2 = plantDate2;
    }

    public Date getRecoveryDate2() {
        return recoveryDate2;
    }

    public void setRecoveryDate2(Date recoveryDate2) {
        this.recoveryDate2 = recoveryDate2;
    }

    public Integer getPlantNum2() {
        return plantNum2;
    }

    public void setPlantNum2(Integer plantNum2) {
        this.plantNum2 = plantNum2;
    }

    public Integer getPlantLeafNum2() {
        return plantLeafNum2;
    }

    public void setPlantLeafNum2(Integer plantLeafNum2) {
        this.plantLeafNum2 = plantLeafNum2;
    }

    public Integer getControlMod2() {
        return controlMod2;
    }

    public void setControlMod2(Integer controlMod2) {
        this.controlMod2 = controlMod2;
    }

    public String getPlantName3() {
        return plantName3;
    }

    public void setPlantName3(String plantName3) {
        this.plantName3 = plantName3 == null ? null : plantName3.trim();
    }

    public Date getPlantDate3() {
        return plantDate3;
    }

    public void setPlantDate3(Date plantDate3) {
        this.plantDate3 = plantDate3;
    }

    public Date getRecoveryDate3() {
        return recoveryDate3;
    }

    public void setRecoveryDate3(Date recoveryDate3) {
        this.recoveryDate3 = recoveryDate3;
    }

    public Integer getPlantNum3() {
        return plantNum3;
    }

    public void setPlantNum3(Integer plantNum3) {
        this.plantNum3 = plantNum3;
    }

    public Integer getPlantLeafNum3() {
        return plantLeafNum3;
    }

    public void setPlantLeafNum3(Integer plantLeafNum3) {
        this.plantLeafNum3 = plantLeafNum3;
    }

    public Integer getControlMod3() {
        return controlMod3;
    }

    public void setControlMod3(Integer controlMod3) {
        this.controlMod3 = controlMod3;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName == null ? null : feedName.trim();
    }

    public Date getFeedDate() {
        return feedDate;
    }

    public void setFeedDate(Date feedDate) {
        this.feedDate = feedDate;
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
        sb.append(", plantInfoId=").append(plantInfoId);
        sb.append(", batchId=").append(batchId);
        sb.append(", plantName1=").append(plantName1);
        sb.append(", plantDate1=").append(plantDate1);
        sb.append(", recoveryDate1=").append(recoveryDate1);
        sb.append(", plantNum1=").append(plantNum1);
        sb.append(", plantLeafNum1=").append(plantLeafNum1);
        sb.append(", controlMod1=").append(controlMod1);
        sb.append(", plantName2=").append(plantName2);
        sb.append(", plantDate2=").append(plantDate2);
        sb.append(", recoveryDate2=").append(recoveryDate2);
        sb.append(", plantNum2=").append(plantNum2);
        sb.append(", plantLeafNum2=").append(plantLeafNum2);
        sb.append(", controlMod2=").append(controlMod2);
        sb.append(", plantName3=").append(plantName3);
        sb.append(", plantDate3=").append(plantDate3);
        sb.append(", recoveryDate3=").append(recoveryDate3);
        sb.append(", plantNum3=").append(plantNum3);
        sb.append(", plantLeafNum3=").append(plantLeafNum3);
        sb.append(", controlMod3=").append(controlMod3);
        sb.append(", feedName=").append(feedName);
        sb.append(", feedDate=").append(feedDate);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}