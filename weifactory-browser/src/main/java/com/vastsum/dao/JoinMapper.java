package com.vastsum.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vastsum.entity.Batch;
import com.vastsum.entity.vo.BatchInfo;
import com.vastsum.entity.vo.UserDevice;
import com.vastsum.entity.vo.UserInfo;

/**
 * @author ssj
 * @create 2017-08-20 8:27
 */
@Repository
public interface JoinMapper {

    /**
     * 根据用户id获取用户信息
     * @param id
     * @return UserInfo
     */
    UserInfo selectUserInfoByPrimaryKey(Integer id);

    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return List<UserInfo>
     */
    List<UserInfo> selectUserInfoByUserName(String userName);

    /**
     * 查询批次信息
     * @return List<Batch>
     */
    List<Batch> selectBatchInfos();

    /**
     * 
     * @param userId
     * @return List<BatchInfo>
     */
    List<BatchInfo> selectBatchInfoByUserId(Integer userId);
    
    /**
     * 查询用户和批次的关联数据，批次为主表
     * @param userBatchDto
     * @return List<UserDevice>
     */
    List<UserDevice> findByUserDeviceDto();

}
