package com.vastsum.service;

import com.vastsum.entity.SysMenu;
import com.vastsum.entity.vo.Menu;

import java.util.List;

/**
 * 菜单管理
 */
public interface SysMenuService {
    /**
     * 根据用户id查询对应的菜单信息
     * @param userId
     * @return 菜单列表
     */
    List<SysMenu> findSysMenusByuserId(Integer userId);

    /**
     * 根据菜单id获取菜单信息
     * @param menuId
     * @return SysMenu
     */
    SysMenu getSysMenu(Long menuId);

    /**
     * 列出所有一级菜单
     * @return PageInfo<SysMenu>
     */
    List<SysMenu> listSysMenuFirst();

    /**
     * 列出所有一级二级菜单
     * @return PageInfo<Menu<SysMenu>>
     */
    List<Menu<SysMenu>> listMenuAll();

    /**
     * 根据一级菜单id,获取所有二级菜单
     * @param menuId
     * @return PageInfo<SysMenu>
     */
    List<SysMenu> listSysMenuSecond(Long menuId);

    /**
     * 根据角色id获取相关权限信息
     * @param roleId
     * @return List<SysMenu>
     */
    List<Menu<SysMenu>> listSysMenuByRoleId(Long roleId);

    /**
     * 添加一级菜单/如果有parentId则为二级菜单
     * @param sysMenu
     * @return Integer
     */
    Integer add(SysMenu sysMenu);


    /**
     * 修改一级菜单//如果有parentid则为二级菜单
     * @param sysMenu
     * @return Integer
     */
    Integer update(SysMenu sysMenu);


    /**
     * 删除一级菜单二级菜单一并删除
     * @param menuId
     * @return Integer
     */
    Integer delete(Long menuId);

}
