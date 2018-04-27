package com.vastsum.dao;

import com.vastsum.entity.Humidity;
import com.vastsum.entity.HumidityExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HumidityMapper {
    long countByExample(HumidityExample example);

    int deleteByExample(HumidityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Humidity record);

    int insertSelective(Humidity record);

    List<Humidity> selectByExample(HumidityExample example);

    Humidity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Humidity record, @Param("example") HumidityExample example);

    int updateByExample(@Param("record") Humidity record, @Param("example") HumidityExample example);

    int updateByPrimaryKeySelective(Humidity record);

    int updateByPrimaryKey(Humidity record);
}