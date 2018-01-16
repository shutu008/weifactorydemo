package com.vastsum.dao;

import com.vastsum.entity.Temperature;
import com.vastsum.entity.TemperatureExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TemperatureMapper {
    long countByExample(TemperatureExample example);

    int deleteByExample(TemperatureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Temperature record);

    int insertSelective(Temperature record);

    List<Temperature> selectByExample(TemperatureExample example);

    Temperature selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Temperature record, @Param("example") TemperatureExample example);

    int updateByExample(@Param("record") Temperature record, @Param("example") TemperatureExample example);

    int updateByPrimaryKeySelective(Temperature record);

    int updateByPrimaryKey(Temperature record);
}