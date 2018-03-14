package com.vastsum.dao;

import com.vastsum.entity.HandControl;
import com.vastsum.entity.HandControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandControlMapper {
    long countByExample(HandControlExample example);

    int deleteByExample(HandControlExample example);

    int deleteByPrimaryKey(Long handControlId);

    int insert(HandControl record);

    int insertSelective(HandControl record);

    List<HandControl> selectByExample(HandControlExample example);

    HandControl selectByPrimaryKey(Long handControlId);

    int updateByExampleSelective(@Param("record") HandControl record, @Param("example") HandControlExample example);

    int updateByExample(@Param("record") HandControl record, @Param("example") HandControlExample example);

    int updateByPrimaryKeySelective(HandControl record);

    int updateByPrimaryKey(HandControl record);
}