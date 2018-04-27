package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Sensor;
import com.vastsum.entity.SensorCollection;

import java.util.Date;

/**
 * 传感器管理。采集的历史数据
 * @author ssj
 * @create 2017-09-16 13:09
 */
public interface SensorService {

    /**
     * 根据条件查询历史数据
     * @param deviceId
     * @param startTime
     * @param endTime
     * @param page
     * @param pageSize
     * @return PageInfo<Sensor>
     */
     PageInfo<Sensor> selectSensorsBydeviceId(Integer deviceId, Date startTime, Date endTime, Integer page, Integer pageSize);

    /**
     * 根据设备id获取最新的传感器信息
     * @param deviceId
     * @return Sensor
     */
     Sensor selectLastSensorBydeviceId(Integer deviceId);

    /**
     * 根据设备序列号和传感器标识，获取设备传感器的最新数据
     * @param sn
     * @param sensor
     * @return SensorCollection
     */
     SensorCollection getLastSensorCollectionBySnAndSensor(String sn, Integer sensor);

    /**
     * 根据设备序列号，列出临时存储的采集信息
     * @param sn
     * @param page
     * @param pageSize
     * @return PageInfo<SensorCollection>
     */
    PageInfo<SensorCollection> listSensorCollectionBySn(String sn, Integer page, Integer pageSize);


}
