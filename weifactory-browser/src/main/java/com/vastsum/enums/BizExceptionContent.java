package com.vastsum.enums;

/**
 * 业务异常内容
 * @author ssj
 * @create 2017-11-17 21:47
 */
public enum  BizExceptionContent {

    TEMPERATURE_UP("温度过高"),
    TEMPERATURE_DOWN("温度过低"),
    HUMIDITY_UP("湿度过高"),
    HUMIDITY_DOWN("湿度过低"),
    ILLUMINATION_UP("光照强度过高"),
    ILLUMINATION_DOWN("光照强度过低"),
    CO2_UP("二氧化碳浓度过高"),
    CO2_DOWN("二氧化碳浓度过低"),
    PH_UP("PH浓度过高"),
    PH_DOWN("PH浓度过低"),
    EC_UP("EC值过高"),
    EC_DOWN("EC值过低"),
    OXYGEN_UP("氧气浓度过高"),
    OXYGEN_DOWN("氧气浓度过低"),
    HIGH_LEVEL_UP("高液位过高"),
    HIGHT_LEVEL_DOWN("高液位过低"),
    LOW_LEVEL_UP("低液位过高"),
    LOW_LEVEL_DOWN("低液位过低");

    private String content;

    BizExceptionContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
