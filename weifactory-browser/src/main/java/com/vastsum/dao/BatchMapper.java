package com.vastsum.dao;

import com.vastsum.entity.Batch;
import com.vastsum.entity.BatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchMapper {
    long countByExample(BatchExample example);

    int deleteByExample(BatchExample example);

    int deleteByPrimaryKey(Integer batchId);

    int insert(Batch record);

    int insertSelective(Batch record);

    List<Batch> selectByExample(BatchExample example);

    Batch selectByPrimaryKey(Integer batchId);

    int updateByExampleSelective(@Param("record") Batch record, @Param("example") BatchExample example);

    int updateByExample(@Param("record") Batch record, @Param("example") BatchExample example);

    int updateByPrimaryKeySelective(Batch record);

    int updateByPrimaryKey(Batch record);
}