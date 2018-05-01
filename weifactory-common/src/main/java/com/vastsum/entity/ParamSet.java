package com.vastsum.entity;

import java.util.Date;

public class ParamSet {
    private Long paramSetId;

    private Long batchId;

    private String sn;

    private String daySet;

    private String dayStartTime;

    private String dayEndTime;

    private String nightStartTime;

    private String nightEndTime;

    private Integer dayWindLenghtTime;

    private Integer dayWindCycleTime;

    private Integer dayBgLenght1;

    private Integer dayBgCycle1;

    private Integer dayBgLenght2;

    private Integer dayBgCycle2;

    private Integer dayBgLenght3;

    private Integer dayBgCycle3;

    private Integer dayYyLength1;

    private Integer dayYyCycle1;

    private Integer dayYyLength2;

    private Integer dayYyCycle2;

    private Integer dayYyLength3;

    private Integer dayYyCycle3;

    private Integer dayNewWindLength;

    private Integer dayNewWindTime;

    private String feedName;

    private Date feedPlantingTime;

    private Date feedRecoveryTime;

    private Integer dayFeedBgTime;

    private Integer dayFeedBgLength;

    private Integer dayFeedWaterLength;

    private Integer dayFeedWaterCycle;

    private Integer nightWindLenghtTime;

    private Integer nightWindCycleTime;

    private Integer nightBgLenght1;

    private Integer nightBgCycle1;

    private Integer nightBgLenght2;

    private Integer nightBgCycle2;

    private Integer nightBgLenght3;

    private Integer nightBgCycle3;

    private Integer nightYyLength1;

    private Integer nightYyCycle1;

    private Integer nightYyLength2;

    private Integer nightYyCycle2;

    private Integer nightYyLength3;

    private Integer nightYyCycle3;

    private Integer nightNewWindLength;

    private Integer nightNewWindTime;

    private Integer nightFeedBgTime;

    private Integer nightFeedBgLength;

    private Integer nightFeedWaterLength;

    private String batchNo1;

    private String plantName1;

    private String growthPattern1;

    private String dayTemperature1;

    private String nightTemperature1;

    private String dayHumidity1;

    private String nightHumidity1;

    private String batchNo2;

    private String plantName2;

    private String growthPattern2;

    private String dayTemperature2;

    private String nightTemperature2;

    private String dayHumidity2;

    private String nightHumidity2;

    private String batchNo3;

    private String plantName3;

    private String growthPattern3;

    private String dayTemperature3;

    private String nightTemperature3;

    private String dayHumidity3;

    private String nightHumidity3;

    private Integer nightFeedWaterCycle;

    private String yyBeforeTime;

    private String yyNextTime;

    private Integer yyPTime1;

    private Integer yyPTime2;

    private Integer yyPTime3;

    private Integer yyCTime;

    private Integer yyKTime;

    private Integer comm;

    private String ip;

    private Integer port;

    private Integer cyCycle;

    private Integer stCycle;

    private Date outTime;

    private Date inTime;

    private Integer timeLenghtMod;

    private Integer dateLength;

    private Integer dateYi;

    private String status;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getParamSetId() {
        return paramSetId;
    }

    public void setParamSetId(Long paramSetId) {
        this.paramSetId = paramSetId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getDaySet() {
        return daySet;
    }

    public void setDaySet(String daySet) {
        this.daySet = daySet == null ? null : daySet.trim();
    }

    public String getDayStartTime() {
        return dayStartTime;
    }

    public void setDayStartTime(String dayStartTime) {
        this.dayStartTime = dayStartTime == null ? null : dayStartTime.trim();
    }

    public String getDayEndTime() {
        return dayEndTime;
    }

    public void setDayEndTime(String dayEndTime) {
        this.dayEndTime = dayEndTime == null ? null : dayEndTime.trim();
    }

    public String getNightStartTime() {
        return nightStartTime;
    }

    public void setNightStartTime(String nightStartTime) {
        this.nightStartTime = nightStartTime == null ? null : nightStartTime.trim();
    }

    public String getNightEndTime() {
        return nightEndTime;
    }

    public void setNightEndTime(String nightEndTime) {
        this.nightEndTime = nightEndTime == null ? null : nightEndTime.trim();
    }

    public Integer getDayWindLenghtTime() {
        return dayWindLenghtTime;
    }

    public void setDayWindLenghtTime(Integer dayWindLenghtTime) {
        this.dayWindLenghtTime = dayWindLenghtTime;
    }

    public Integer getDayWindCycleTime() {
        return dayWindCycleTime;
    }

    public void setDayWindCycleTime(Integer dayWindCycleTime) {
        this.dayWindCycleTime = dayWindCycleTime;
    }

    public Integer getDayBgLenght1() {
        return dayBgLenght1;
    }

    public void setDayBgLenght1(Integer dayBgLenght1) {
        this.dayBgLenght1 = dayBgLenght1;
    }

    public Integer getDayBgCycle1() {
        return dayBgCycle1;
    }

    public void setDayBgCycle1(Integer dayBgCycle1) {
        this.dayBgCycle1 = dayBgCycle1;
    }

    public Integer getDayBgLenght2() {
        return dayBgLenght2;
    }

    public void setDayBgLenght2(Integer dayBgLenght2) {
        this.dayBgLenght2 = dayBgLenght2;
    }

    public Integer getDayBgCycle2() {
        return dayBgCycle2;
    }

    public void setDayBgCycle2(Integer dayBgCycle2) {
        this.dayBgCycle2 = dayBgCycle2;
    }

    public Integer getDayBgLenght3() {
        return dayBgLenght3;
    }

    public void setDayBgLenght3(Integer dayBgLenght3) {
        this.dayBgLenght3 = dayBgLenght3;
    }

    public Integer getDayBgCycle3() {
        return dayBgCycle3;
    }

    public void setDayBgCycle3(Integer dayBgCycle3) {
        this.dayBgCycle3 = dayBgCycle3;
    }

    public Integer getDayYyLength1() {
        return dayYyLength1;
    }

    public void setDayYyLength1(Integer dayYyLength1) {
        this.dayYyLength1 = dayYyLength1;
    }

    public Integer getDayYyCycle1() {
        return dayYyCycle1;
    }

    public void setDayYyCycle1(Integer dayYyCycle1) {
        this.dayYyCycle1 = dayYyCycle1;
    }

    public Integer getDayYyLength2() {
        return dayYyLength2;
    }

    public void setDayYyLength2(Integer dayYyLength2) {
        this.dayYyLength2 = dayYyLength2;
    }

    public Integer getDayYyCycle2() {
        return dayYyCycle2;
    }

    public void setDayYyCycle2(Integer dayYyCycle2) {
        this.dayYyCycle2 = dayYyCycle2;
    }

    public Integer getDayYyLength3() {
        return dayYyLength3;
    }

    public void setDayYyLength3(Integer dayYyLength3) {
        this.dayYyLength3 = dayYyLength3;
    }

    public Integer getDayYyCycle3() {
        return dayYyCycle3;
    }

    public void setDayYyCycle3(Integer dayYyCycle3) {
        this.dayYyCycle3 = dayYyCycle3;
    }

    public Integer getDayNewWindLength() {
        return dayNewWindLength;
    }

    public void setDayNewWindLength(Integer dayNewWindLength) {
        this.dayNewWindLength = dayNewWindLength;
    }

    public Integer getDayNewWindTime() {
        return dayNewWindTime;
    }

    public void setDayNewWindTime(Integer dayNewWindTime) {
        this.dayNewWindTime = dayNewWindTime;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName == null ? null : feedName.trim();
    }

    public Date getFeedPlantingTime() {
        return feedPlantingTime;
    }

    public void setFeedPlantingTime(Date feedPlantingTime) {
        this.feedPlantingTime = feedPlantingTime;
    }

    public Date getFeedRecoveryTime() {
        return feedRecoveryTime;
    }

    public void setFeedRecoveryTime(Date feedRecoveryTime) {
        this.feedRecoveryTime = feedRecoveryTime;
    }

    public Integer getDayFeedBgTime() {
        return dayFeedBgTime;
    }

    public void setDayFeedBgTime(Integer dayFeedBgTime) {
        this.dayFeedBgTime = dayFeedBgTime;
    }

    public Integer getDayFeedBgLength() {
        return dayFeedBgLength;
    }

    public void setDayFeedBgLength(Integer dayFeedBgLength) {
        this.dayFeedBgLength = dayFeedBgLength;
    }

    public Integer getDayFeedWaterLength() {
        return dayFeedWaterLength;
    }

    public void setDayFeedWaterLength(Integer dayFeedWaterLength) {
        this.dayFeedWaterLength = dayFeedWaterLength;
    }

    public Integer getDayFeedWaterCycle() {
        return dayFeedWaterCycle;
    }

    public void setDayFeedWaterCycle(Integer dayFeedWaterCycle) {
        this.dayFeedWaterCycle = dayFeedWaterCycle;
    }

    public Integer getNightWindLenghtTime() {
        return nightWindLenghtTime;
    }

    public void setNightWindLenghtTime(Integer nightWindLenghtTime) {
        this.nightWindLenghtTime = nightWindLenghtTime;
    }

    public Integer getNightWindCycleTime() {
        return nightWindCycleTime;
    }

    public void setNightWindCycleTime(Integer nightWindCycleTime) {
        this.nightWindCycleTime = nightWindCycleTime;
    }

    public Integer getNightBgLenght1() {
        return nightBgLenght1;
    }

    public void setNightBgLenght1(Integer nightBgLenght1) {
        this.nightBgLenght1 = nightBgLenght1;
    }

    public Integer getNightBgCycle1() {
        return nightBgCycle1;
    }

    public void setNightBgCycle1(Integer nightBgCycle1) {
        this.nightBgCycle1 = nightBgCycle1;
    }

    public Integer getNightBgLenght2() {
        return nightBgLenght2;
    }

    public void setNightBgLenght2(Integer nightBgLenght2) {
        this.nightBgLenght2 = nightBgLenght2;
    }

    public Integer getNightBgCycle2() {
        return nightBgCycle2;
    }

    public void setNightBgCycle2(Integer nightBgCycle2) {
        this.nightBgCycle2 = nightBgCycle2;
    }

    public Integer getNightBgLenght3() {
        return nightBgLenght3;
    }

    public void setNightBgLenght3(Integer nightBgLenght3) {
        this.nightBgLenght3 = nightBgLenght3;
    }

    public Integer getNightBgCycle3() {
        return nightBgCycle3;
    }

    public void setNightBgCycle3(Integer nightBgCycle3) {
        this.nightBgCycle3 = nightBgCycle3;
    }

    public Integer getNightYyLength1() {
        return nightYyLength1;
    }

    public void setNightYyLength1(Integer nightYyLength1) {
        this.nightYyLength1 = nightYyLength1;
    }

    public Integer getNightYyCycle1() {
        return nightYyCycle1;
    }

    public void setNightYyCycle1(Integer nightYyCycle1) {
        this.nightYyCycle1 = nightYyCycle1;
    }

    public Integer getNightYyLength2() {
        return nightYyLength2;
    }

    public void setNightYyLength2(Integer nightYyLength2) {
        this.nightYyLength2 = nightYyLength2;
    }

    public Integer getNightYyCycle2() {
        return nightYyCycle2;
    }

    public void setNightYyCycle2(Integer nightYyCycle2) {
        this.nightYyCycle2 = nightYyCycle2;
    }

    public Integer getNightYyLength3() {
        return nightYyLength3;
    }

    public void setNightYyLength3(Integer nightYyLength3) {
        this.nightYyLength3 = nightYyLength3;
    }

    public Integer getNightYyCycle3() {
        return nightYyCycle3;
    }

    public void setNightYyCycle3(Integer nightYyCycle3) {
        this.nightYyCycle3 = nightYyCycle3;
    }

    public Integer getNightNewWindLength() {
        return nightNewWindLength;
    }

    public void setNightNewWindLength(Integer nightNewWindLength) {
        this.nightNewWindLength = nightNewWindLength;
    }

    public Integer getNightNewWindTime() {
        return nightNewWindTime;
    }

    public void setNightNewWindTime(Integer nightNewWindTime) {
        this.nightNewWindTime = nightNewWindTime;
    }

    public Integer getNightFeedBgTime() {
        return nightFeedBgTime;
    }

    public void setNightFeedBgTime(Integer nightFeedBgTime) {
        this.nightFeedBgTime = nightFeedBgTime;
    }

    public Integer getNightFeedBgLength() {
        return nightFeedBgLength;
    }

    public void setNightFeedBgLength(Integer nightFeedBgLength) {
        this.nightFeedBgLength = nightFeedBgLength;
    }

    public Integer getNightFeedWaterLength() {
        return nightFeedWaterLength;
    }

    public void setNightFeedWaterLength(Integer nightFeedWaterLength) {
        this.nightFeedWaterLength = nightFeedWaterLength;
    }

    public String getBatchNo1() {
        return batchNo1;
    }

    public void setBatchNo1(String batchNo1) {
        this.batchNo1 = batchNo1 == null ? null : batchNo1.trim();
    }

    public String getPlantName1() {
        return plantName1;
    }

    public void setPlantName1(String plantName1) {
        this.plantName1 = plantName1 == null ? null : plantName1.trim();
    }

    public String getGrowthPattern1() {
        return growthPattern1;
    }

    public void setGrowthPattern1(String growthPattern1) {
        this.growthPattern1 = growthPattern1 == null ? null : growthPattern1.trim();
    }

    public String getDayTemperature1() {
        return dayTemperature1;
    }

    public void setDayTemperature1(String dayTemperature1) {
        this.dayTemperature1 = dayTemperature1 == null ? null : dayTemperature1.trim();
    }

    public String getNightTemperature1() {
        return nightTemperature1;
    }

    public void setNightTemperature1(String nightTemperature1) {
        this.nightTemperature1 = nightTemperature1 == null ? null : nightTemperature1.trim();
    }

    public String getDayHumidity1() {
        return dayHumidity1;
    }

    public void setDayHumidity1(String dayHumidity1) {
        this.dayHumidity1 = dayHumidity1 == null ? null : dayHumidity1.trim();
    }

    public String getNightHumidity1() {
        return nightHumidity1;
    }

    public void setNightHumidity1(String nightHumidity1) {
        this.nightHumidity1 = nightHumidity1 == null ? null : nightHumidity1.trim();
    }

    public String getBatchNo2() {
        return batchNo2;
    }

    public void setBatchNo2(String batchNo2) {
        this.batchNo2 = batchNo2 == null ? null : batchNo2.trim();
    }

    public String getPlantName2() {
        return plantName2;
    }

    public void setPlantName2(String plantName2) {
        this.plantName2 = plantName2 == null ? null : plantName2.trim();
    }

    public String getGrowthPattern2() {
        return growthPattern2;
    }

    public void setGrowthPattern2(String growthPattern2) {
        this.growthPattern2 = growthPattern2 == null ? null : growthPattern2.trim();
    }

    public String getDayTemperature2() {
        return dayTemperature2;
    }

    public void setDayTemperature2(String dayTemperature2) {
        this.dayTemperature2 = dayTemperature2 == null ? null : dayTemperature2.trim();
    }

    public String getNightTemperature2() {
        return nightTemperature2;
    }

    public void setNightTemperature2(String nightTemperature2) {
        this.nightTemperature2 = nightTemperature2 == null ? null : nightTemperature2.trim();
    }

    public String getDayHumidity2() {
        return dayHumidity2;
    }

    public void setDayHumidity2(String dayHumidity2) {
        this.dayHumidity2 = dayHumidity2 == null ? null : dayHumidity2.trim();
    }

    public String getNightHumidity2() {
        return nightHumidity2;
    }

    public void setNightHumidity2(String nightHumidity2) {
        this.nightHumidity2 = nightHumidity2 == null ? null : nightHumidity2.trim();
    }

    public String getBatchNo3() {
        return batchNo3;
    }

    public void setBatchNo3(String batchNo3) {
        this.batchNo3 = batchNo3 == null ? null : batchNo3.trim();
    }

    public String getPlantName3() {
        return plantName3;
    }

    public void setPlantName3(String plantName3) {
        this.plantName3 = plantName3 == null ? null : plantName3.trim();
    }

    public String getGrowthPattern3() {
        return growthPattern3;
    }

    public void setGrowthPattern3(String growthPattern3) {
        this.growthPattern3 = growthPattern3 == null ? null : growthPattern3.trim();
    }

    public String getDayTemperature3() {
        return dayTemperature3;
    }

    public void setDayTemperature3(String dayTemperature3) {
        this.dayTemperature3 = dayTemperature3 == null ? null : dayTemperature3.trim();
    }

    public String getNightTemperature3() {
        return nightTemperature3;
    }

    public void setNightTemperature3(String nightTemperature3) {
        this.nightTemperature3 = nightTemperature3 == null ? null : nightTemperature3.trim();
    }

    public String getDayHumidity3() {
        return dayHumidity3;
    }

    public void setDayHumidity3(String dayHumidity3) {
        this.dayHumidity3 = dayHumidity3 == null ? null : dayHumidity3.trim();
    }

    public String getNightHumidity3() {
        return nightHumidity3;
    }

    public void setNightHumidity3(String nightHumidity3) {
        this.nightHumidity3 = nightHumidity3 == null ? null : nightHumidity3.trim();
    }

    public Integer getNightFeedWaterCycle() {
        return nightFeedWaterCycle;
    }

    public void setNightFeedWaterCycle(Integer nightFeedWaterCycle) {
        this.nightFeedWaterCycle = nightFeedWaterCycle;
    }

    public String getYyBeforeTime() {
        return yyBeforeTime;
    }

    public void setYyBeforeTime(String yyBeforeTime) {
        this.yyBeforeTime = yyBeforeTime == null ? null : yyBeforeTime.trim();
    }

    public String getYyNextTime() {
        return yyNextTime;
    }

    public void setYyNextTime(String yyNextTime) {
        this.yyNextTime = yyNextTime == null ? null : yyNextTime.trim();
    }

    public Integer getYyPTime1() {
        return yyPTime1;
    }

    public void setYyPTime1(Integer yyPTime1) {
        this.yyPTime1 = yyPTime1;
    }

    public Integer getYyPTime2() {
        return yyPTime2;
    }

    public void setYyPTime2(Integer yyPTime2) {
        this.yyPTime2 = yyPTime2;
    }

    public Integer getYyPTime3() {
        return yyPTime3;
    }

    public void setYyPTime3(Integer yyPTime3) {
        this.yyPTime3 = yyPTime3;
    }

    public Integer getYyCTime() {
        return yyCTime;
    }

    public void setYyCTime(Integer yyCTime) {
        this.yyCTime = yyCTime;
    }

    public Integer getYyKTime() {
        return yyKTime;
    }

    public void setYyKTime(Integer yyKTime) {
        this.yyKTime = yyKTime;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getCyCycle() {
        return cyCycle;
    }

    public void setCyCycle(Integer cyCycle) {
        this.cyCycle = cyCycle;
    }

    public Integer getStCycle() {
        return stCycle;
    }

    public void setStCycle(Integer stCycle) {
        this.stCycle = stCycle;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Integer getTimeLenghtMod() {
        return timeLenghtMod;
    }

    public void setTimeLenghtMod(Integer timeLenghtMod) {
        this.timeLenghtMod = timeLenghtMod;
    }

    public Integer getDateLength() {
        return dateLength;
    }

    public void setDateLength(Integer dateLength) {
        this.dateLength = dateLength;
    }

    public Integer getDateYi() {
        return dateYi;
    }

    public void setDateYi(Integer dateYi) {
        this.dateYi = dateYi;
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
        sb.append(", paramSetId=").append(paramSetId);
        sb.append(", batchId=").append(batchId);
        sb.append(", sn=").append(sn);
        sb.append(", daySet=").append(daySet);
        sb.append(", dayStartTime=").append(dayStartTime);
        sb.append(", dayEndTime=").append(dayEndTime);
        sb.append(", nightStartTime=").append(nightStartTime);
        sb.append(", nightEndTime=").append(nightEndTime);
        sb.append(", dayWindLenghtTime=").append(dayWindLenghtTime);
        sb.append(", dayWindCycleTime=").append(dayWindCycleTime);
        sb.append(", dayBgLenght1=").append(dayBgLenght1);
        sb.append(", dayBgCycle1=").append(dayBgCycle1);
        sb.append(", dayBgLenght2=").append(dayBgLenght2);
        sb.append(", dayBgCycle2=").append(dayBgCycle2);
        sb.append(", dayBgLenght3=").append(dayBgLenght3);
        sb.append(", dayBgCycle3=").append(dayBgCycle3);
        sb.append(", dayYyLength1=").append(dayYyLength1);
        sb.append(", dayYyCycle1=").append(dayYyCycle1);
        sb.append(", dayYyLength2=").append(dayYyLength2);
        sb.append(", dayYyCycle2=").append(dayYyCycle2);
        sb.append(", dayYyLength3=").append(dayYyLength3);
        sb.append(", dayYyCycle3=").append(dayYyCycle3);
        sb.append(", dayNewWindLength=").append(dayNewWindLength);
        sb.append(", dayNewWindTime=").append(dayNewWindTime);
        sb.append(", feedName=").append(feedName);
        sb.append(", feedPlantingTime=").append(feedPlantingTime);
        sb.append(", feedRecoveryTime=").append(feedRecoveryTime);
        sb.append(", dayFeedBgTime=").append(dayFeedBgTime);
        sb.append(", dayFeedBgLength=").append(dayFeedBgLength);
        sb.append(", dayFeedWaterLength=").append(dayFeedWaterLength);
        sb.append(", dayFeedWaterCycle=").append(dayFeedWaterCycle);
        sb.append(", nightWindLenghtTime=").append(nightWindLenghtTime);
        sb.append(", nightWindCycleTime=").append(nightWindCycleTime);
        sb.append(", nightBgLenght1=").append(nightBgLenght1);
        sb.append(", nightBgCycle1=").append(nightBgCycle1);
        sb.append(", nightBgLenght2=").append(nightBgLenght2);
        sb.append(", nightBgCycle2=").append(nightBgCycle2);
        sb.append(", nightBgLenght3=").append(nightBgLenght3);
        sb.append(", nightBgCycle3=").append(nightBgCycle3);
        sb.append(", nightYyLength1=").append(nightYyLength1);
        sb.append(", nightYyCycle1=").append(nightYyCycle1);
        sb.append(", nightYyLength2=").append(nightYyLength2);
        sb.append(", nightYyCycle2=").append(nightYyCycle2);
        sb.append(", nightYyLength3=").append(nightYyLength3);
        sb.append(", nightYyCycle3=").append(nightYyCycle3);
        sb.append(", nightNewWindLength=").append(nightNewWindLength);
        sb.append(", nightNewWindTime=").append(nightNewWindTime);
        sb.append(", nightFeedBgTime=").append(nightFeedBgTime);
        sb.append(", nightFeedBgLength=").append(nightFeedBgLength);
        sb.append(", nightFeedWaterLength=").append(nightFeedWaterLength);
        sb.append(", batchNo1=").append(batchNo1);
        sb.append(", plantName1=").append(plantName1);
        sb.append(", growthPattern1=").append(growthPattern1);
        sb.append(", dayTemperature1=").append(dayTemperature1);
        sb.append(", nightTemperature1=").append(nightTemperature1);
        sb.append(", dayHumidity1=").append(dayHumidity1);
        sb.append(", nightHumidity1=").append(nightHumidity1);
        sb.append(", batchNo2=").append(batchNo2);
        sb.append(", plantName2=").append(plantName2);
        sb.append(", growthPattern2=").append(growthPattern2);
        sb.append(", dayTemperature2=").append(dayTemperature2);
        sb.append(", nightTemperature2=").append(nightTemperature2);
        sb.append(", dayHumidity2=").append(dayHumidity2);
        sb.append(", nightHumidity2=").append(nightHumidity2);
        sb.append(", batchNo3=").append(batchNo3);
        sb.append(", plantName3=").append(plantName3);
        sb.append(", growthPattern3=").append(growthPattern3);
        sb.append(", dayTemperature3=").append(dayTemperature3);
        sb.append(", nightTemperature3=").append(nightTemperature3);
        sb.append(", dayHumidity3=").append(dayHumidity3);
        sb.append(", nightHumidity3=").append(nightHumidity3);
        sb.append(", nightFeedWaterCycle=").append(nightFeedWaterCycle);
        sb.append(", yyBeforeTime=").append(yyBeforeTime);
        sb.append(", yyNextTime=").append(yyNextTime);
        sb.append(", yyPTime1=").append(yyPTime1);
        sb.append(", yyPTime2=").append(yyPTime2);
        sb.append(", yyPTime3=").append(yyPTime3);
        sb.append(", yyCTime=").append(yyCTime);
        sb.append(", yyKTime=").append(yyKTime);
        sb.append(", comm=").append(comm);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", cyCycle=").append(cyCycle);
        sb.append(", stCycle=").append(stCycle);
        sb.append(", outTime=").append(outTime);
        sb.append(", inTime=").append(inTime);
        sb.append(", timeLenghtMod=").append(timeLenghtMod);
        sb.append(", dateLength=").append(dateLength);
        sb.append(", dateYi=").append(dateYi);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}