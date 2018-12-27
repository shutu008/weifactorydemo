package com.vastsum.dao;

import com.vastsum.entity.MechanismExample;
import com.vastsum.entity.Mechanism;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MechanismMapper {
    long countByExample(MechanismExample example);

    int deleteByExample(MechanismExample example);

    int deleteByPrimaryKey(Integer mechanismId);

    int insert(Mechanism record);

    int insertSelective(Mechanism record);

    List<Mechanism> selectByExample(MechanismExample example);

    Mechanism selectByPrimaryKey(Integer mechanismId);

    int updateByExampleSelective(@Param("record") Mechanism record, @Param("example") MechanismExample example);

    int updateByExample(@Param("record") Mechanism record, @Param("example") MechanismExample example);

    int updateByPrimaryKeySelective(Mechanism record);

    int updateByPrimaryKey(Mechanism record);
}