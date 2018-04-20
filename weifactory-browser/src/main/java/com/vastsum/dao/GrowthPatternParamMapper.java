package com.vastsum.dao;

import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.entity.GrowthPatternParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrowthPatternParamMapper {
    long countByExample(GrowthPatternParamExample example);

    int deleteByExample(GrowthPatternParamExample example);

    int deleteByPrimaryKey(Long growthId);

    int insert(GrowthPatternParam record);

    int insertSelective(GrowthPatternParam record);

    List<GrowthPatternParam> selectByExample(GrowthPatternParamExample example);

    GrowthPatternParam selectByPrimaryKey(Long growthId);

    int updateByExampleSelective(@Param("record") GrowthPatternParam record, @Param("example") GrowthPatternParamExample example);

    int updateByExample(@Param("record") GrowthPatternParam record, @Param("example") GrowthPatternParamExample example);

    int updateByPrimaryKeySelective(GrowthPatternParam record);

    int updateByPrimaryKey(GrowthPatternParam record);
}