package com.vastsum.dao;

import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.CommunicationLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommunicationLogMapper {
    long countByExample(CommunicationLogExample example);

    int deleteByExample(CommunicationLogExample example);

    int deleteByPrimaryKey(Long clientConnectionId);

    int insert(CommunicationLog record);

    int insertSelective(CommunicationLog record);

    List<CommunicationLog> selectByExample(CommunicationLogExample example);

    CommunicationLog selectByPrimaryKey(Long clientConnectionId);

    int updateByExampleSelective(@Param("record") CommunicationLog record, @Param("example") CommunicationLogExample example);

    int updateByExample(@Param("record") CommunicationLog record, @Param("example") CommunicationLogExample example);

    int updateByPrimaryKeySelective(CommunicationLog record);

    int updateByPrimaryKey(CommunicationLog record);
}