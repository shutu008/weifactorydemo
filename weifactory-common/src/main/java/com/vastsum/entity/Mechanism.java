package com.vastsum.entity;

public class Mechanism {
    private Integer mechanismId;

    private Integer deviceId;

    private Boolean timelyIntervention;

    private Boolean airDisinfection;

    private Boolean liquidDisinfection;

    private Boolean wind;

    private Boolean compressor;

    private Boolean spray;

    private Boolean ledTop1;

    private Boolean ledTop2;

    private Boolean ledTop3;

    private Boolean ledMiddle1;

    private Boolean ledMiddle2;

    private Boolean ledMiddle3;

    private Boolean ledBottom1;

    private Boolean ledBottom2;

    private Boolean ledBottom3;

    private Boolean heat1;

    private Boolean heat2;

    private Boolean heat3;

    private Boolean waterin1;

    private Boolean waterin2;

    private Boolean waterin3;

    private Boolean waterout1;

    private Boolean waterout2;

    private Boolean waterout3;

    private Boolean seedled;

    private Boolean seedspray;

    private Boolean pump;

    private Boolean fan1;

    private Boolean fan2;

    private Boolean fan3;

    private Boolean addwater;

    private Boolean drainage;

    public Integer getMechanismId() {
        return mechanismId;
    }

    public void setMechanismId(Integer mechanismId) {
        this.mechanismId = mechanismId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Boolean getTimelyIntervention() {
        return timelyIntervention;
    }

    public void setTimelyIntervention(Boolean timelyIntervention) {
        this.timelyIntervention = timelyIntervention;
    }

    public Boolean getAirDisinfection() {
        return airDisinfection;
    }

    public void setAirDisinfection(Boolean airDisinfection) {
        this.airDisinfection = airDisinfection;
    }

    public Boolean getLiquidDisinfection() {
        return liquidDisinfection;
    }

    public void setLiquidDisinfection(Boolean liquidDisinfection) {
        this.liquidDisinfection = liquidDisinfection;
    }

    public Boolean getWind() {
        return wind;
    }

    public void setWind(Boolean wind) {
        this.wind = wind;
    }

    public Boolean getCompressor() {
        return compressor;
    }

    public void setCompressor(Boolean compressor) {
        this.compressor = compressor;
    }

    public Boolean getSpray() {
        return spray;
    }

    public void setSpray(Boolean spray) {
        this.spray = spray;
    }

    public Boolean getLedTop1() {
        return ledTop1;
    }

    public void setLedTop1(Boolean ledTop1) {
        this.ledTop1 = ledTop1;
    }

    public Boolean getLedTop2() {
        return ledTop2;
    }

    public void setLedTop2(Boolean ledTop2) {
        this.ledTop2 = ledTop2;
    }

    public Boolean getLedTop3() {
        return ledTop3;
    }

    public void setLedTop3(Boolean ledTop3) {
        this.ledTop3 = ledTop3;
    }

    public Boolean getLedMiddle1() {
        return ledMiddle1;
    }

    public void setLedMiddle1(Boolean ledMiddle1) {
        this.ledMiddle1 = ledMiddle1;
    }

    public Boolean getLedMiddle2() {
        return ledMiddle2;
    }

    public void setLedMiddle2(Boolean ledMiddle2) {
        this.ledMiddle2 = ledMiddle2;
    }

    public Boolean getLedMiddle3() {
        return ledMiddle3;
    }

    public void setLedMiddle3(Boolean ledMiddle3) {
        this.ledMiddle3 = ledMiddle3;
    }

    public Boolean getLedBottom1() {
        return ledBottom1;
    }

    public void setLedBottom1(Boolean ledBottom1) {
        this.ledBottom1 = ledBottom1;
    }

    public Boolean getLedBottom2() {
        return ledBottom2;
    }

    public void setLedBottom2(Boolean ledBottom2) {
        this.ledBottom2 = ledBottom2;
    }

    public Boolean getLedBottom3() {
        return ledBottom3;
    }

    public void setLedBottom3(Boolean ledBottom3) {
        this.ledBottom3 = ledBottom3;
    }

    public Boolean getHeat1() {
        return heat1;
    }

    public void setHeat1(Boolean heat1) {
        this.heat1 = heat1;
    }

    public Boolean getHeat2() {
        return heat2;
    }

    public void setHeat2(Boolean heat2) {
        this.heat2 = heat2;
    }

    public Boolean getHeat3() {
        return heat3;
    }

    public void setHeat3(Boolean heat3) {
        this.heat3 = heat3;
    }

    public Boolean getWaterin1() {
        return waterin1;
    }

    public void setWaterin1(Boolean waterin1) {
        this.waterin1 = waterin1;
    }

    public Boolean getWaterin2() {
        return waterin2;
    }

    public void setWaterin2(Boolean waterin2) {
        this.waterin2 = waterin2;
    }

    public Boolean getWaterin3() {
        return waterin3;
    }

    public void setWaterin3(Boolean waterin3) {
        this.waterin3 = waterin3;
    }

    public Boolean getWaterout1() {
        return waterout1;
    }

    public void setWaterout1(Boolean waterout1) {
        this.waterout1 = waterout1;
    }

    public Boolean getWaterout2() {
        return waterout2;
    }

    public void setWaterout2(Boolean waterout2) {
        this.waterout2 = waterout2;
    }

    public Boolean getWaterout3() {
        return waterout3;
    }

    public void setWaterout3(Boolean waterout3) {
        this.waterout3 = waterout3;
    }

    public Boolean getSeedled() {
        return seedled;
    }

    public void setSeedled(Boolean seedled) {
        this.seedled = seedled;
    }

    public Boolean getSeedspray() {
        return seedspray;
    }

    public void setSeedspray(Boolean seedspray) {
        this.seedspray = seedspray;
    }

    public Boolean getPump() {
        return pump;
    }

    public void setPump(Boolean pump) {
        this.pump = pump;
    }

    public Boolean getFan1() {
        return fan1;
    }

    public void setFan1(Boolean fan1) {
        this.fan1 = fan1;
    }

    public Boolean getFan2() {
        return fan2;
    }

    public void setFan2(Boolean fan2) {
        this.fan2 = fan2;
    }

    public Boolean getFan3() {
        return fan3;
    }

    public void setFan3(Boolean fan3) {
        this.fan3 = fan3;
    }

    public Boolean getAddwater() {
        return addwater;
    }

    public void setAddwater(Boolean addwater) {
        this.addwater = addwater;
    }

    public Boolean getDrainage() {
        return drainage;
    }

    public void setDrainage(Boolean drainage) {
        this.drainage = drainage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mechanismId=").append(mechanismId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", timelyIntervention=").append(timelyIntervention);
        sb.append(", airDisinfection=").append(airDisinfection);
        sb.append(", liquidDisinfection=").append(liquidDisinfection);
        sb.append(", wind=").append(wind);
        sb.append(", compressor=").append(compressor);
        sb.append(", spray=").append(spray);
        sb.append(", ledTop1=").append(ledTop1);
        sb.append(", ledTop2=").append(ledTop2);
        sb.append(", ledTop3=").append(ledTop3);
        sb.append(", ledMiddle1=").append(ledMiddle1);
        sb.append(", ledMiddle2=").append(ledMiddle2);
        sb.append(", ledMiddle3=").append(ledMiddle3);
        sb.append(", ledBottom1=").append(ledBottom1);
        sb.append(", ledBottom2=").append(ledBottom2);
        sb.append(", ledBottom3=").append(ledBottom3);
        sb.append(", heat1=").append(heat1);
        sb.append(", heat2=").append(heat2);
        sb.append(", heat3=").append(heat3);
        sb.append(", waterin1=").append(waterin1);
        sb.append(", waterin2=").append(waterin2);
        sb.append(", waterin3=").append(waterin3);
        sb.append(", waterout1=").append(waterout1);
        sb.append(", waterout2=").append(waterout2);
        sb.append(", waterout3=").append(waterout3);
        sb.append(", seedled=").append(seedled);
        sb.append(", seedspray=").append(seedspray);
        sb.append(", pump=").append(pump);
        sb.append(", fan1=").append(fan1);
        sb.append(", fan2=").append(fan2);
        sb.append(", fan3=").append(fan3);
        sb.append(", addwater=").append(addwater);
        sb.append(", drainage=").append(drainage);
        sb.append("]");
        return sb.toString();
    }
}