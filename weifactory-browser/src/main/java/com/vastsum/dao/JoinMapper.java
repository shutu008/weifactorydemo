package com.vastsum.dao;

import com.vastsum.entity.vo.UserInfo;
import com.vastsum.entity.Batch;
import com.vastsum.entity.vo.BatchInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ssj
 * @create 2017-08-20 8:27
 */
@Repository
public interface JoinMapper {

    /**
     * 根据主键获取用户信息，关联查询
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
     * 关联查询出批次和设备信息
     * @return List<Batch>
     */
    List<Batch> selectBatchInfos();

    /**
     * 根据用户id获取带有设备号的批次信息
     * @param userId
     * @return List<BatchInfo>
     */
    List<BatchInfo> selectBatchInfoByUserId(Integer userId);

}
