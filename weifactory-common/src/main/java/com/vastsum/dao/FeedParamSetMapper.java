package com.vastsum.dao;

import com.vastsum.entity.FeedParamSet;
import com.vastsum.entity.FeedParamSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedParamSetMapper {
    long countByExample(FeedParamSetExample example);

    int deleteByExample(FeedParamSetExample example);

    int deleteByPrimaryKey(Long feedParamId);

    int insert(FeedParamSet record);

    int insertSelective(FeedParamSet record);

    List<FeedParamSet> selectByExample(FeedParamSetExample example);

    FeedParamSet selectByPrimaryKey(Long feedParamId);

    int updateByExampleSelective(@Param("record") FeedParamSet record, @Param("example") FeedParamSetExample example);

    int updateByExample(@Param("record") FeedParamSet record, @Param("example") FeedParamSetExample example);

    int updateByPrimaryKeySelective(FeedParamSet record);

    int updateByPrimaryKey(FeedParamSet record);
}