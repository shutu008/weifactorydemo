package com.vastsum.enums;

/**
 * 传感器对应关系表
 * @author ssj
 * @create 2017-10-15 16:31
 */
public enum  SensorEnum {

    SENSOR_TEMPERATURE_1(1, "室内温度1"),
    SENSOR_TEMPERATURE_2(2, "室内温度2"),
    SENSOR_TEMPERATURE_3(3, "室内温度3"),
    SENSOR_HUMIDITY_1(4, "室内湿度1"),
    SENSOR_HUMIDITY_2(5, "室内湿度2"),
    SENSOR_HUMIDITY_3(6, "室内湿度3"),
    SENSOR_ILLUMINATION_1(7, "室内光照1"),
    SENSOR_ILLUMINATION_2(8, "室内光照2"),
    SENSOR_ILLUMINATION_3(9, "室内光照3"),
    SENSOR_CO2(10, "室内CO2"),
    SENSOR_PH(11, "PH"),
    SENSOR_EC(12, "EC"),
    SENSOR_OXYGEN(13, "溶氧"),
    SENSOR_NUTRIENT_SOLUTION(14, "营养液温度"),
    OUTDOOR_TEMPERATURE(15, "室外温度"),
    SENSOR_HIGH_LEVEL(16, "液位上限"),
    SENSOR_LOW_LEVEL(17, "液位下限");

    Integer index;
    String name;
     SensorEnum(Integer i, String name){
        this.index = i;
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
