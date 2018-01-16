package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Role;

/**
 * 权限管理
 * @author ssj
 * @create 2017-08-06 8:25
 */
public interface RoleService {

    /**
     * 分页列出所有权限
     * @param page
     * @param pageSize
     * @return PageInfo<Role>
     */
     PageInfo<Role> list(int page, int pageSize);

    /**
     * 根据权限id查询所对应的权限
     * @param role
     * @return
     */
     Role findById(Role role);

    /**
     * 根据当前用户获取权限
     * @param userId
     * @return Role
     */
     Role selectRoleByUserId(Integer userId);

    /**
     * 删除角色
     * @param roleId
     * @return Integer
     */
     Integer delete(Integer roleId);

    /**
     * 更新角色菜单
     * @param roleId
     * @param menuString 以逗号分隔的菜单id
     * @return Integer
     */
     Integer updateRoleMenus(Long roleId, String menuString);

    /**
     * 判断用户是否是管理员
     * @param userId
     * @return boolean
     */
     boolean isAdminByUserId(int userId);
}
