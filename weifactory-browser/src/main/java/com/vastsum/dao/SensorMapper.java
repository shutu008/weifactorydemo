package com.vastsum.dao;

import com.vastsum.entity.Sensor;
import com.vastsum.entity.SensorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SensorMapper {
    long countByExample(SensorExample example);

    int deleteByExample(SensorExample example);

    int deleteByPrimaryKey(Integer sensorId);

    int insert(Sensor record);

    int insertSelective(Sensor record);

    List<Sensor> selectByExample(SensorExample example);

    Sensor selectByPrimaryKey(Integer sensorId);

    int updateByExampleSelective(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByExample(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByPrimaryKeySelective(Sensor record);

    int updateByPrimaryKey(Sensor record);
}