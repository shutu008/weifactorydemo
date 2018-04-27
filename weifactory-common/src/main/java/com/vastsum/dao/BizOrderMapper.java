package com.vastsum.dao;

import com.vastsum.entity.BizOrder;
import com.vastsum.entity.BizOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizOrderMapper {
    long countByExample(BizOrderExample example);

    int deleteByExample(BizOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(BizOrder record);

    int insertSelective(BizOrder record);

    List<BizOrder> selectByExample(BizOrderExample example);

    BizOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") BizOrder record, @Param("example") BizOrderExample example);

    int updateByExample(@Param("record") BizOrder record, @Param("example") BizOrderExample example);

    int updateByPrimaryKeySelective(BizOrder record);

    int updateByPrimaryKey(BizOrder record);
}