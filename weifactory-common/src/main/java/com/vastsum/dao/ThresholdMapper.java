package com.vastsum.dao;

import com.vastsum.entity.ThresholdExample;
import com.vastsum.entity.Threshold;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ThresholdMapper {
    long countByExample(ThresholdExample example);

    int deleteByExample(ThresholdExample example);

    int deleteByPrimaryKey(Integer thresholdId);

    int insert(Threshold record);

    int insertSelective(Threshold record);

    List<Threshold> selectByExample(ThresholdExample example);

    Threshold selectByPrimaryKey(Integer thresholdId);

    int updateByExampleSelective(@Param("record") Threshold record, @Param("example") ThresholdExample example);

    int updateByExample(@Param("record") Threshold record, @Param("example") ThresholdExample example);

    int updateByPrimaryKeySelective(Threshold record);

    int updateByPrimaryKey(Threshold record);
}