package com.vastsum.dao;

import com.vastsum.entity.Seed;
import com.vastsum.entity.SeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeedMapper {
    long countByExample(SeedExample example);

    int deleteByExample(SeedExample example);

    int deleteByPrimaryKey(Long seedId);

    int insert(Seed record);

    int insertSelective(Seed record);

    List<Seed> selectByExample(SeedExample example);

    Seed selectByPrimaryKey(Long seedId);

    int updateByExampleSelective(@Param("record") Seed record, @Param("example") SeedExample example);

    int updateByExample(@Param("record") Seed record, @Param("example") SeedExample example);

    int updateByPrimaryKeySelective(Seed record);

    int updateByPrimaryKey(Seed record);
}