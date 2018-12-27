package com.vastsum.dao;

import com.vastsum.entity.DeviceSn;
import com.vastsum.entity.DeviceSnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceSnMapper {
    long countByExample(DeviceSnExample example);

    int deleteByExample(DeviceSnExample example);

    int deleteByPrimaryKey(String sn);

    int insert(DeviceSn record);

    int insertSelective(DeviceSn record);

    List<DeviceSn> selectByExample(DeviceSnExample example);

    DeviceSn selectByPrimaryKey(String sn);

    int updateByExampleSelective(@Param("record") DeviceSn record, @Param("example") DeviceSnExample example);

    int updateByExample(@Param("record") DeviceSn record, @Param("example") DeviceSnExample example);

    int updateByPrimaryKeySelective(DeviceSn record);

    int updateByPrimaryKey(DeviceSn record);
}