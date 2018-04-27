package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.SensorMapper;
import com.vastsum.entity.SensorExample;
import com.vastsum.service.SensorService;
import com.vastsum.dao.SensorCollectionMapper;
import com.vastsum.entity.Sensor;
import com.vastsum.entity.SensorCollection;
import com.vastsum.entity.SensorCollectionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author ssj
 * @create 2017-09-16 14:24
 */
@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    private SensorMapper sensorMapper;
    @Autowired
    private SensorCollectionMapper sensorCollectionMapper;



    //根据设备id,开始时间，结束时间，分页信息获取传感器数据
    @Override
    public PageInfo<Sensor> selectSensorsBydeviceId(Integer deviceId, Date startTime, Date endTime,Integer page,Integer pageSize) {
        SensorExample sensorExample = new SensorExample();
        SensorExample.Criteria criteria = sensorExample.createCriteria();
        if (deviceId !=null){
            criteria.andDeviceIdEqualTo(deviceId);
        }
        if (startTime !=null){
            Date startTimestamp = new Timestamp(startTime.getTime());
            criteria.andGmtCreateGreaterThanOrEqualTo(startTimestamp);
        }
        if (endTime != null){
            Date endTimestamp = new Timestamp(endTime.getTime());
           criteria.andGmtCreateLessThanOrEqualTo(endTimestamp);
        }
        sensorExample.setOrderByClause("sensor_id desc");
        page = (page == 0 || page== null)? 1:page;
        pageSize = (pageSize == 0 || pageSize == null)? 10:pageSize;
        PageHelper.startPage(page,pageSize);
         List<Sensor> sensors = sensorMapper.selectByExample(sensorExample);
        return new PageInfo<>(sensors);
    }


    //返回最新的一条数据
    @Override
    public Sensor selectLastSensorBydeviceId(Integer deviceId) {
        SensorExample sensorExample = new SensorExample();
        sensorExample.createCriteria().andDeviceIdEqualTo(deviceId);
        sensorExample.setOrderByClause("gmt_create desc");
        List<Sensor> sensors = sensorMapper.selectByExample(sensorExample);
        if (sensors != null && !sensors.isEmpty()){
            return sensors.get(0);
        }

        return null;

    }

    //根据设备序列号和传感器标识获取最新的数据
    @Override
    public SensorCollection getLastSensorCollectionBySnAndSensor(String sn, Integer sensor) {
        SensorCollectionExample sensorCollectionExample = new SensorCollectionExample();
        sensorCollectionExample.createCriteria().andSnEqualTo(sn).andSensorEqualTo(sensor);
        sensorCollectionExample.setOrderByClause("id desc");
        List<SensorCollection> sensorCollections = sensorCollectionMapper.selectByExample(sensorCollectionExample);
        if (sensorCollections == null)
            return null;
        return sensorCollections.get(0);
    }

    //根据设备id获取传感器临时表中的数据
    @Override
    public PageInfo<SensorCollection> listSensorCollectionBySn(String sn, Integer page,Integer pageSize) {
        SensorCollectionExample sensorCollectionExample = new SensorCollectionExample();
        sensorCollectionExample.createCriteria().andSnEqualTo(sn);
        sensorCollectionExample.setOrderByClause("gmt_create desc");
        page = (page == 0 || page== null)? 1:page;
        pageSize = (pageSize == 0 || pageSize == null)? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<SensorCollection> sensorCollections = sensorCollectionMapper.selectByExample(sensorCollectionExample);
        return new PageInfo<>(sensorCollections);
    }
}
