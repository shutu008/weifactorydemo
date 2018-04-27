package com.vastsum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.RoleMapper;
import com.vastsum.dao.SysRoleMenuMapper;
import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.Role;
import com.vastsum.entity.RoleExample;
import com.vastsum.entity.SysRoleMenu;
import com.vastsum.entity.SysRoleMenuExample;
import com.vastsum.entity.UserRole;
import com.vastsum.entity.UserRoleExample;
import com.vastsum.service.RoleService;

/**
 * 角色管理
 * @author ssj
 * @create 2017-08-06 8:28
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public PageInfo<Role> list(int page, int pageSize) {
        //默认分页
        RoleExample roleExample = new RoleExample();
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        PageInfo<Role> pageInfo = new PageInfo<>(roles);
        return pageInfo;
    }

    @Override
    public Role findById(Role role) {
        return roleMapper.selectByPrimaryKey(role.getRoleId());
    }

    //根据用户id获取用户权限
    @Override
    public Role selectRoleByUserId(Integer userId) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles == null || userRoles.isEmpty()){
            return null;
        }else {
            Integer roleId = userRoles.get(0).getRoleId();
            Role role = roleMapper.selectByPrimaryKey(roleId);
            return role;
        }

    }

    //删除角色
    @Override
    public Integer delete(Integer roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    //更新角色菜单信息
    @Override
    public Integer updateRoleMenus(Long roleId, String menuString) {
        //删除旧菜单，初次添加没有旧菜单
        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        sysRoleMenuExample.createCriteria().andRoleIdEqualTo(roleId);
        sysRoleMenuMapper.deleteByExample(sysRoleMenuExample);
        if (menuString.trim().equals("")){
            return 1;
        }
        //添加新菜单
        String[] strings = menuString.split(",");
        for(int i=0; i<strings.length; i++){
            long l = Long.parseLong(strings[i]);
            SysRoleMenu sysRoleMenu = new SysRoleMenu();
            sysRoleMenu.setRoleId(roleId);
            sysRoleMenu.setMenuId(l);
            sysRoleMenuMapper.insertSelective(sysRoleMenu);
        }
        //执行成功
        return 1;
    }

    //判断用户是否是超级管理员
    @Override
    public boolean isAdminByUserId(int userId) {
       UserRoleExample userRoleExample = new UserRoleExample();
       userRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles != null){
            UserRole userRole = userRoles.get(0);
            if (userRole != null){
                if (userRole.getRoleId() == 1){
                    return true;
                }
            }
        }
        return false;
    }
}
