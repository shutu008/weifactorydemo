package com.vastsum.dao;

import com.vastsum.entity.BizControl;
import com.vastsum.entity.BizControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizControlMapper {
    long countByExample(BizControlExample example);

    int deleteByExample(BizControlExample example);

    int deleteByPrimaryKey(Long controlId);

    int insert(BizControl record);

    int insertSelective(BizControl record);

    List<BizControl> selectByExample(BizControlExample example);

    BizControl selectByPrimaryKey(Long controlId);

    int updateByExampleSelective(@Param("record") BizControl record, @Param("example") BizControlExample example);

    int updateByExample(@Param("record") BizControl record, @Param("example") BizControlExample example);

    int updateByPrimaryKeySelective(BizControl record);

    int updateByPrimaryKey(BizControl record);
}