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

    private Double dayTemperature;

    private Double dayHumidity;

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

    private Integer dayFeedBgTime;

    private Integer dayFeedBgLength;

    private Integer dayFeedWaterLength;

    private Integer dayFeedWaterCycle;

    private Double nightTemperature;

    private Double nightHumidity;

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

    public Double getDayTemperature() {
        return dayTemperature;
    }

    public void setDayTemperature(Double dayTemperature) {
        this.dayTemperature = dayTemperature;
    }

    public Double getDayHumidity() {
        return dayHumidity;
    }

    public void setDayHumidity(Double dayHumidity) {
        this.dayHumidity = dayHumidity;
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

    public Double getNightTemperature() {
        return nightTemperature;
    }

    public void setNightTemperature(Double nightTemperature) {
        this.nightTemperature = nightTemperature;
    }

    public Double getNightHumidity() {
        return nightHumidity;
    }

    public void setNightHumidity(Double nightHumidity) {
        this.nightHumidity = nightHumidity;
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
        sb.append(", dayTemperature=").append(dayTemperature);
        sb.append(", dayHumidity=").append(dayHumidity);
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
        sb.append(", dayFeedBgTime=").append(dayFeedBgTime);
        sb.append(", dayFeedBgLength=").append(dayFeedBgLength);
        sb.append(", dayFeedWaterLength=").append(dayFeedWaterLength);
        sb.append(", dayFeedWaterCycle=").append(dayFeedWaterCycle);
        sb.append(", nightTemperature=").append(nightTemperature);
        sb.append(", nightHumidity=").append(nightHumidity);
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