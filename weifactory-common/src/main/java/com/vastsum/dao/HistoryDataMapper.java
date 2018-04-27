package com.vastsum.dao;

import com.vastsum.entity.HistoryData;
import com.vastsum.entity.HistoryDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryDataMapper {
    long countByExample(HistoryDataExample example);

    int deleteByExample(HistoryDataExample example);

    int deleteByPrimaryKey(Long historyId);

    int insert(HistoryData record);

    int insertSelective(HistoryData record);

    List<HistoryData> selectByExample(HistoryDataExample example);

    HistoryData selectByPrimaryKey(Long historyId);

    int updateByExampleSelective(@Param("record") HistoryData record, @Param("example") HistoryDataExample example);

    int updateByExample(@Param("record") HistoryData record, @Param("example") HistoryDataExample example);

    int updateByPrimaryKeySelective(HistoryData record);

    int updateByPrimaryKey(HistoryData record);
}