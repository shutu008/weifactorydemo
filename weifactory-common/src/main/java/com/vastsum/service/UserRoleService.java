package com.vastsum.service;

import com.vastsum.entity.Role;
import com.vastsum.entity.UserRole;

/**
 * @author ssj
 * @create 2017-07-29 11:11
 */
public interface UserRoleService {

    /**
     * 为用户赋予默认权限
     * @param userRole
     * @return 结果状态
     */
    public int add(UserRole userRole);

    /**
     * 更改用户权限
     * @param userRole
     * @return 结果状态
     */
    public int update(UserRole userRole);

    /**
     * 根据用户id获取用户权限
     * @param userId
     * @return 用户的权限信息
     */
    public Role findRoleByuserId(Integer userId);
}
