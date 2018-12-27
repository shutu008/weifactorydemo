package com.vastsum.dao;

import com.vastsum.entity.ParamSet;
import com.vastsum.entity.ParamSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParamSetMapper {
    long countByExample(ParamSetExample example);

    int deleteByExample(ParamSetExample example);

    int deleteByPrimaryKey(Long paramSetId);

    int insert(ParamSet record);

    int insertSelective(ParamSet record);

    List<ParamSet> selectByExample(ParamSetExample example);

    ParamSet selectByPrimaryKey(Long paramSetId);

    int updateByExampleSelective(@Param("record") ParamSet record, @Param("example") ParamSetExample example);

    int updateByExample(@Param("record") ParamSet record, @Param("example") ParamSetExample example);

    int updateByPrimaryKeySelective(ParamSet record);

    int updateByPrimaryKey(ParamSet record);
}