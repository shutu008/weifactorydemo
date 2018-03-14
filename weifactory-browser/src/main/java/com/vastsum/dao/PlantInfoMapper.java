package com.vastsum.dao;

import com.vastsum.entity.PlantInfo;
import com.vastsum.entity.PlantInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlantInfoMapper {
    long countByExample(PlantInfoExample example);

    int deleteByExample(PlantInfoExample example);

    int deleteByPrimaryKey(Long plantInfoId);

    int insert(PlantInfo record);

    int insertSelective(PlantInfo record);

    List<PlantInfo> selectByExample(PlantInfoExample example);

    PlantInfo selectByPrimaryKey(Long plantInfoId);

    int updateByExampleSelective(@Param("record") PlantInfo record, @Param("example") PlantInfoExample example);

    int updateByExample(@Param("record") PlantInfo record, @Param("example") PlantInfoExample example);

    int updateByPrimaryKeySelective(PlantInfo record);

    int updateByPrimaryKey(PlantInfo record);
}