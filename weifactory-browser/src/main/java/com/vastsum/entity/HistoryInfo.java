package com.vastsum.entity;

import java.util.Date;

public class HistoryInfo {
    private Long historyId;

    private Long batchId;

    private String historyNo;

    private String sn;

    private Double oneTemperature;

    private Double oneHumidity;

    private String oneYy;

    private String oneLed1;

    private String oneLed2;

    private String oneLed3;

    private Double twoTemperature;

    private Double twoHumidity;

    private String twoYy;

    private String twoLed1;

    private String twoLed2;

    private String twoLed3;

    private Double threeTemperature;

    private Double threeHumidity;

    private String threeYy;

    private String threeLed1;

    private String threeLed2;

    private String threeLed3;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getHistoryNo() {
        return historyNo;
    }

    public void setHistoryNo(String historyNo) {
        this.historyNo = historyNo == null ? null : historyNo.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Double getOneTemperature() {
        return oneTemperature;
    }

    public void setOneTemperature(Double oneTemperature) {
        this.oneTemperature = oneTemperature;
    }

    public Double getOneHumidity() {
        return oneHumidity;
    }

    public void setOneHumidity(Double oneHumidity) {
        this.oneHumidity = oneHumidity;
    }

    public String getOneYy() {
        return oneYy;
    }

    public void setOneYy(String oneYy) {
        this.oneYy = oneYy == null ? null : oneYy.trim();
    }

    public String getOneLed1() {
        return oneLed1;
    }

    public void setOneLed1(String oneLed1) {
        this.oneLed1 = oneLed1 == null ? null : oneLed1.trim();
    }

    public String getOneLed2() {
        return oneLed2;
    }

    public void setOneLed2(String oneLed2) {
        this.oneLed2 = oneLed2 == null ? null : oneLed2.trim();
    }

    public String getOneLed3() {
        return oneLed3;
    }

    public void setOneLed3(String oneLed3) {
        this.oneLed3 = oneLed3 == null ? null : oneLed3.trim();
    }

    public Double getTwoTemperature() {
        return twoTemperature;
    }

    public void setTwoTemperature(Double twoTemperature) {
        this.twoTemperature = twoTemperature;
    }

    public Double getTwoHumidity() {
        return twoHumidity;
    }

    public void setTwoHumidity(Double twoHumidity) {
        this.twoHumidity = twoHumidity;
    }

    public String getTwoYy() {
        return twoYy;
    }

    public void setTwoYy(String twoYy) {
        this.twoYy = twoYy == null ? null : twoYy.trim();
    }

    public String getTwoLed1() {
        return twoLed1;
    }

    public void setTwoLed1(String twoLed1) {
        this.twoLed1 = twoLed1 == null ? null : twoLed1.trim();
    }

    public String getTwoLed2() {
        return twoLed2;
    }

    public void setTwoLed2(String twoLed2) {
        this.twoLed2 = twoLed2 == null ? null : twoLed2.trim();
    }

    public String getTwoLed3() {
        return twoLed3;
    }

    public void setTwoLed3(String twoLed3) {
        this.twoLed3 = twoLed3 == null ? null : twoLed3.trim();
    }

    public Double getThreeTemperature() {
        return threeTemperature;
    }

    public void setThreeTemperature(Double threeTemperature) {
        this.threeTemperature = threeTemperature;
    }

    public Double getThreeHumidity() {
        return threeHumidity;
    }

    public void setThreeHumidity(Double threeHumidity) {
        this.threeHumidity = threeHumidity;
    }

    public String getThreeYy() {
        return threeYy;
    }

    public void setThreeYy(String threeYy) {
        this.threeYy = threeYy == null ? null : threeYy.trim();
    }

    public String getThreeLed1() {
        return threeLed1;
    }

    public void setThreeLed1(String threeLed1) {
        this.threeLed1 = threeLed1 == null ? null : threeLed1.trim();
    }

    public String getThreeLed2() {
        return threeLed2;
    }

    public void setThreeLed2(String threeLed2) {
        this.threeLed2 = threeLed2 == null ? null : threeLed2.trim();
    }

    public String getThreeLed3() {
        return threeLed3;
    }

    public void setThreeLed3(String threeLed3) {
        this.threeLed3 = threeLed3 == null ? null : threeLed3.trim();
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
        sb.append(", historyId=").append(historyId);
        sb.append(", batchId=").append(batchId);
        sb.append(", historyNo=").append(historyNo);
        sb.append(", sn=").append(sn);
        sb.append(", oneTemperature=").append(oneTemperature);
        sb.append(", oneHumidity=").append(oneHumidity);
        sb.append(", oneYy=").append(oneYy);
        sb.append(", oneLed1=").append(oneLed1);
        sb.append(", oneLed2=").append(oneLed2);
        sb.append(", oneLed3=").append(oneLed3);
        sb.append(", twoTemperature=").append(twoTemperature);
        sb.append(", twoHumidity=").append(twoHumidity);
        sb.append(", twoYy=").append(twoYy);
        sb.append(", twoLed1=").append(twoLed1);
        sb.append(", twoLed2=").append(twoLed2);
        sb.append(", twoLed3=").append(twoLed3);
        sb.append(", threeTemperature=").append(threeTemperature);
        sb.append(", threeHumidity=").append(threeHumidity);
        sb.append(", threeYy=").append(threeYy);
        sb.append(", threeLed1=").append(threeLed1);
        sb.append(", threeLed2=").append(threeLed2);
        sb.append(", threeLed3=").append(threeLed3);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}