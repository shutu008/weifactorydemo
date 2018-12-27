package com.vastsum.dao;

import com.vastsum.entity.SysDictItem;
import com.vastsum.entity.SysDictItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysDictItemMapper {
    long countByExample(SysDictItemExample example);

    int deleteByExample(SysDictItemExample example);

    int insert(SysDictItem record);

    int insertSelective(SysDictItem record);

    List<SysDictItem> selectByExample(SysDictItemExample example);

    int updateByExampleSelective(@Param("record") SysDictItem record, @Param("example") SysDictItemExample example);

    int updateByExample(@Param("record") SysDictItem record, @Param("example") SysDictItemExample example);
}