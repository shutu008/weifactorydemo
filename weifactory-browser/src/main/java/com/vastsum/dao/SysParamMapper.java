package com.vastsum.dao;

import com.vastsum.entity.SysParam;
import com.vastsum.entity.SysParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysParamMapper {
    long countByExample(SysParamExample example);

    int deleteByExample(SysParamExample example);

    int deleteByPrimaryKey(Long paramId);

    int insert(SysParam record);

    int insertSelective(SysParam record);

    List<SysParam> selectByExample(SysParamExample example);

    SysParam selectByPrimaryKey(Long paramId);

    int updateByExampleSelective(@Param("record") SysParam record, @Param("example") SysParamExample example);

    int updateByExample(@Param("record") SysParam record, @Param("example") SysParamExample example);

    int updateByPrimaryKeySelective(SysParam record);

    int updateByPrimaryKey(SysParam record);
}