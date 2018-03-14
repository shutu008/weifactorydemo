package com.vastsum.dao;

import com.vastsum.entity.HistoryInfo;
import com.vastsum.entity.HistoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryInfoMapper {
    long countByExample(HistoryInfoExample example);

    int deleteByExample(HistoryInfoExample example);

    int deleteByPrimaryKey(Long historyId);

    int insert(HistoryInfo record);

    int insertSelective(HistoryInfo record);

    List<HistoryInfo> selectByExample(HistoryInfoExample example);

    HistoryInfo selectByPrimaryKey(Long historyId);

    int updateByExampleSelective(@Param("record") HistoryInfo record, @Param("example") HistoryInfoExample example);

    int updateByExample(@Param("record") HistoryInfo record, @Param("example") HistoryInfoExample example);

    int updateByPrimaryKeySelective(HistoryInfo record);

    int updateByPrimaryKey(HistoryInfo record);
}