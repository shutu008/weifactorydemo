package com.vastsum.service.impl;

import com.vastsum.entity.Role;
import com.vastsum.entity.UserRole;
import com.vastsum.service.UserRoleService;
import com.vastsum.dao.RoleMapper;
import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.UserRoleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author ssj
 * @create 2017-07-29 11:12
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    private static Logger logger = LoggerFactory.getLogger(UserRoleServiceImpl.class);
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMapper roleMapper;


    /**
     * 为用户添加权限
     * @param userRole
     * @return int
     */
    @Override
    public int add(UserRole userRole) {
        userRole.setGmtModified(new Date());
        userRole.setGmtCreate(new Date());
        return userRoleMapper.insertSelective(userRole);
    }

    @Override
    public int update(UserRole userRole) {
        return userRoleMapper.updateByPrimaryKeySelective(userRole);
    }

    /**
     * 根据用户id获取用户的角色信息
     * @param userId
     * @return 用户的角色信息
     */
    @Override
    public Role findRoleByuserId(Integer userId) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles == null || userRoles.size() == 0) {
            return null;
        }
        UserRole userRole = userRoles.get(0);
        //根据用户角色对应信息获取角色信息
        return roleMapper.selectByPrimaryKey(userRole.getRoleId());
    }
}
