package com.vastsum.dao;

import com.vastsum.entity.ExperimentSetting;
import com.vastsum.entity.ExperimentSettingExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExperimentSettingMapper {
    long countByExample(ExperimentSettingExample example);

    int deleteByExample(ExperimentSettingExample example);

    int deleteByPrimaryKey(Integer experimentSettingId);

    int insert(ExperimentSetting record);

    int insertSelective(ExperimentSetting record);

    List<ExperimentSetting> selectByExample(ExperimentSettingExample example);

    ExperimentSetting selectByPrimaryKey(Integer experimentSettingId);

    int updateByExampleSelective(@Param("record") ExperimentSetting record, @Param("example") ExperimentSettingExample example);

    int updateByExample(@Param("record") ExperimentSetting record, @Param("example") ExperimentSettingExample example);

    int updateByPrimaryKeySelective(ExperimentSetting record);

    int updateByPrimaryKey(ExperimentSetting record);
}