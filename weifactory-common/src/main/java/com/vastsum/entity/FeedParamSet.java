package com.vastsum.entity;

import java.util.Date;

public class FeedParamSet {
    private Long feedParamId;

    private String plantId;

    private Integer dayFeedBgLength;

    private Integer dayFeedBgInterval;

    private Integer nightFeedBgLength;

    private Integer nightFeedBgInterval;

    private Integer dayFeedWaterLength;

    private Integer dayFeedWaterInterval;

    private Integer nightFeedWaterLength;

    private Integer nightFeedWaterInterval;

    private String status;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getFeedParamId() {
        return feedParamId;
    }

    public void setFeedParamId(Long feedParamId) {
        this.feedParamId = feedParamId;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public Integer getDayFeedBgLength() {
        return dayFeedBgLength;
    }

    public void setDayFeedBgLength(Integer dayFeedBgLength) {
        this.dayFeedBgLength = dayFeedBgLength;
    }

    public Integer getDayFeedBgInterval() {
        return dayFeedBgInterval;
    }

    public void setDayFeedBgInterval(Integer dayFeedBgInterval) {
        this.dayFeedBgInterval = dayFeedBgInterval;
    }

    public Integer getNightFeedBgLength() {
        return nightFeedBgLength;
    }

    public void setNightFeedBgLength(Integer nightFeedBgLength) {
        this.nightFeedBgLength = nightFeedBgLength;
    }

    public Integer getNightFeedBgInterval() {
        return nightFeedBgInterval;
    }

    public void setNightFeedBgInterval(Integer nightFeedBgInterval) {
        this.nightFeedBgInterval = nightFeedBgInterval;
    }

    public Integer getDayFeedWaterLength() {
        return dayFeedWaterLength;
    }

    public void setDayFeedWaterLength(Integer dayFeedWaterLength) {
        this.dayFeedWaterLength = dayFeedWaterLength;
    }

    public Integer getDayFeedWaterInterval() {
        return dayFeedWaterInterval;
    }

    public void setDayFeedWaterInterval(Integer dayFeedWaterInterval) {
        this.dayFeedWaterInterval = dayFeedWaterInterval;
    }

    public Integer getNightFeedWaterLength() {
        return nightFeedWaterLength;
    }

    public void setNightFeedWaterLength(Integer nightFeedWaterLength) {
        this.nightFeedWaterLength = nightFeedWaterLength;
    }

    public Integer getNightFeedWaterInterval() {
        return nightFeedWaterInterval;
    }

    public void setNightFeedWaterInterval(Integer nightFeedWaterInterval) {
        this.nightFeedWaterInterval = nightFeedWaterInterval;
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
        sb.append(", feedParamId=").append(feedParamId);
        sb.append(", plantId=").append(plantId);
        sb.append(", dayFeedBgLength=").append(dayFeedBgLength);
        sb.append(", dayFeedBgInterval=").append(dayFeedBgInterval);
        sb.append(", nightFeedBgLength=").append(nightFeedBgLength);
        sb.append(", nightFeedBgInterval=").append(nightFeedBgInterval);
        sb.append(", dayFeedWaterLength=").append(dayFeedWaterLength);
        sb.append(", dayFeedWaterInterval=").append(dayFeedWaterInterval);
        sb.append(", nightFeedWaterLength=").append(nightFeedWaterLength);
        sb.append(", nightFeedWaterInterval=").append(nightFeedWaterInterval);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}