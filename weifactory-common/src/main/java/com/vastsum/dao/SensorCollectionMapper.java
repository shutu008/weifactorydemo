package com.vastsum.dao;

import com.vastsum.entity.SensorCollection;
import com.vastsum.entity.SensorCollectionExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SensorCollectionMapper {
    long countByExample(SensorCollectionExample example);

    int deleteByExample(SensorCollectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SensorCollection record);

    int insertSelective(SensorCollection record);

    List<SensorCollection> selectByExample(SensorCollectionExample example);

    SensorCollection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SensorCollection record, @Param("example") SensorCollectionExample example);

    int updateByExample(@Param("record") SensorCollection record, @Param("example") SensorCollectionExample example);

    int updateByPrimaryKeySelective(SensorCollection record);

    int updateByPrimaryKey(SensorCollection record);
}