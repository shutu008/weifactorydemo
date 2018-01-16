package com.vastsum.dao;

import com.vastsum.entity.BizException;
import com.vastsum.entity.BizExceptionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BizExceptionMapper {
    long countByExample(BizExceptionExample example);

    int deleteByExample(BizExceptionExample example);

    int deleteByPrimaryKey(Long exceptionId);

    int insert(BizException record);

    int insertSelective(BizException record);

    List<BizException> selectByExample(BizExceptionExample example);

    BizException selectByPrimaryKey(Long exceptionId);

    int updateByExampleSelective(@Param("record") BizException record, @Param("example") BizExceptionExample example);

    int updateByExample(@Param("record") BizException record, @Param("example") BizExceptionExample example);

    int updateByPrimaryKeySelective(BizException record);

    int updateByPrimaryKey(BizException record);
}