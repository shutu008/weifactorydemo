package com.vastsum.dao;

import com.vastsum.entity.BSysParam;
import com.vastsum.entity.BSysParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BSysParamMapper {
    long countByExample(BSysParamExample example);

    int deleteByExample(BSysParamExample example);

    int deleteByPrimaryKey(Long sysId);

    int insert(BSysParam record);

    int insertSelective(BSysParam record);

    List<BSysParam> selectByExample(BSysParamExample example);

    BSysParam selectByPrimaryKey(Long sysId);

    int updateByExampleSelective(@Param("record") BSysParam record, @Param("example") BSysParamExample example);

    int updateByExample(@Param("record") BSysParam record, @Param("example") BSysParamExample example);

    int updateByPrimaryKeySelective(BSysParam record);

    int updateByPrimaryKey(BSysParam record);
}