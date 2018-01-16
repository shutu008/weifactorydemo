package com.vastsum.dao;

import com.vastsum.entity.Experiment;
import com.vastsum.entity.ExperimentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExperimentMapper {
    long countByExample(ExperimentExample example);

    int deleteByExample(ExperimentExample example);

    int deleteByPrimaryKey(Integer experimentId);

    int insert(Experiment record);

    int insertSelective(Experiment record);

    List<Experiment> selectByExample(ExperimentExample example);

    Experiment selectByPrimaryKey(Integer experimentId);

    int updateByExampleSelective(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByExample(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByPrimaryKeySelective(Experiment record);

    int updateByPrimaryKey(Experiment record);
}