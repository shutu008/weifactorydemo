package com.vastsum.service.impl;

import com.vastsum.dao.SysMenuMapper;
import com.vastsum.dao.UserMapper;
import com.vastsum.entity.*;
import com.vastsum.dao.SysRoleMenuMapper;
import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.vo.Menu;
import com.vastsum.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ssj
 * @create 2017-08-27 14:36
 *
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;


    @Override
    public List<SysMenu> findSysMenusByuserId(Integer userId) {
        //根据用户id查询出所对应的权限
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles==null || userRoles.size()==0) {
            return null;
        }
        UserRole userRole = userRoles.get(0);
        //---权限与菜单对应关系
        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        Long longRoleId = Long.valueOf(userRole.getRoleId());
        sysRoleMenuExample.createCriteria().andRoleIdEqualTo(longRoleId);
        List<SysRoleMenu> sysRoleMenus = sysRoleMenuMapper.selectByExample(sysRoleMenuExample);
        if (sysRoleMenus==null || sysRoleMenus.size() ==0) {
            return null;
        }
        //封装一个in查询的集合
        List<Long> menuIdList = new LinkedList<>();
        for(SysRoleMenu sysRoleMenu:sysRoleMenus){
            menuIdList.add(sysRoleMenu.getMenuId());
        }
        //--执行in操作查询出菜单项
        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andMenuIdIn(menuIdList);
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);
        return sysMenus;
    }

    //根据id获取菜单信息
    @Override
    public SysMenu getSysMenu(Long menuId) {
        return sysMenuMapper.selectByPrimaryKey(menuId);
    }

    //列出一级菜单
    @Override
    public List<SysMenu> listSysMenuFirst() {
        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andParentIdIsNull();
        sysMenuExample.setOrderByClause("order_num asc");
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);
        return sysMenus;
    }

    //获取带有子菜单的菜单
    @Override
    public List<Menu<SysMenu>> listMenuAll() {
        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.setOrderByClause("order_num asc");
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);
        List<Menu<SysMenu>> menuList = new ArrayList<>();
        for (int i= 0; i<sysMenus.size(); i++){
            if (sysMenus.get(i).getParentId() == null){
                List<SysMenu> sysMenuList = new ArrayList<>();
                Menu<SysMenu> menu = new Menu<>();
                menu.setChildren(sysMenuList);
                for (int j= 0; j<sysMenus.size(); j++){
                    if (sysMenus.get(i).getMenuId().equals(sysMenus.get(j).getParentId())){
                        sysMenuList.add(sysMenus.get(j));
                        menu.setMenuId(sysMenus.get(i).getMenuId());
                        menu.setIcon(sysMenus.get(i).getIcon());
                        menu.setName(sysMenus.get(i).getName());
                        menu.setOrderNum(sysMenus.get(i).getOrderNum());
                        menu.setPerms(sysMenus.get(i).getPerms());
                        menu.setType(sysMenus.get(i).getType());
                    }
                }
                menuList.add(menu);
            }
        }
        return menuList;
    }

    //根据一级菜单，获取二级菜单
    @Override
    public List<SysMenu> listSysMenuSecond(Long menuId) {
        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andParentIdEqualTo(menuId);
        sysMenuExample.setOrderByClause("order_num asc");
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);
        return sysMenus;
    }

    //根据角色id获取相关的菜单信息
    @Override
    public List<Menu<SysMenu>> listSysMenuByRoleId(Long roleId) {
        //用户角色菜单查询
        SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
        sysRoleMenuExample.createCriteria().andRoleIdEqualTo(roleId);
        List<SysRoleMenu> sysRoleMenus = sysRoleMenuMapper.selectByExample(sysRoleMenuExample);

        //所有菜单
        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.setOrderByClause("order_num asc");
        //所有菜单对象列表
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(sysMenuExample);

        //如果sysRoleMenus为空，直接返回，说明权限没有对应的菜单,返回所有菜单，不过select选项全都是false
        if (sysRoleMenus == null || sysRoleMenus.isEmpty()){
            List<Menu<SysMenu>> menuList = new ArrayList<>();
            for (int i= 0; i<sysMenus.size(); i++){
                if (sysMenus.get(i).getParentId() == null){
                    List<SysMenu> sysMenuList = new ArrayList<>();
                    Menu<SysMenu> menu = new Menu<>();
                    menu.setChildren(sysMenuList);
                for (int j= 0; j<sysMenus.size(); j++){
                    if (sysMenus.get(i).getMenuId().equals(sysMenus.get(j).getParentId())){
                        sysMenus.get(j).setSelect(false);
                        sysMenuList.add(sysMenus.get(j));
                        menu.setMenuId(sysMenus.get(i).getMenuId());
                        menu.setIcon(sysMenus.get(i).getIcon());
                        menu.setName(sysMenus.get(i).getName());
                        menu.setOrderNum(sysMenus.get(i).getOrderNum());
                        menu.setPerms(sysMenus.get(i).getPerms());
                        menu.setType(sysMenus.get(i).getType());
                        menu.setSelect(false);
                    }
                }
                    menuList.add(menu);
                }
            }
            return menuList;
        }

        //角色拥有的取菜单idlist
        List<Long> menuIdList = new ArrayList<>();
        for (SysRoleMenu sysRoleMenu : sysRoleMenus){
            menuIdList.add(sysRoleMenu.getMenuId());
        }
        SysMenuExample sysMenuSpan = new SysMenuExample();
        sysMenuExample.createCriteria().andMenuIdIn(menuIdList);
        sysMenuExample.setOrderByClause("order_num asc");
        //角色有的菜单
        List<SysMenu> sysMenuz = sysMenuMapper.selectByExample(sysMenuSpan);

        //要返回的菜单对象
        List<Menu<SysMenu>> menuList = new ArrayList<>();
        for (int i= 0; i<sysMenus.size(); i++){
            //获取的菜单select等于true
            if (sysMenus.get(i).getParentId() == null){
                //二级菜单列表
                List<SysMenu> sysMenuList = new ArrayList<>();
                Menu<SysMenu> menu = new Menu<>();
                menu.setChildren(sysMenuList);
                for (int j= 0; j<sysMenus.size(); j++){
                    if (sysMenus.get(i).getMenuId().equals(sysMenus.get(j).getParentId())){
                        if (menuIdList.contains(sysMenus.get(j).getMenuId())){
                            sysMenus.get(j).setSelect(true);
                        }else {
                            sysMenus.get(j).setSelect(false);
                        }
                        sysMenuList.add(sysMenus.get(j));
                        menu.setMenuId(sysMenus.get(i).getMenuId());
                        menu.setIcon(sysMenus.get(i).getIcon());
                        menu.setName(sysMenus.get(i).getName());
                        menu.setOrderNum(sysMenus.get(i).getOrderNum());
                        menu.setPerms(sysMenus.get(i).getPerms());
                        menu.setType(sysMenus.get(i).getType());
                        //如果是用户的菜单，select等于TRUE
                        if (menuIdList.contains(sysMenus.get(i).getMenuId())){
                            menu.setSelect(true);
                        }else {
                           menu.setSelect(false);
                        }
                    }
                }
                menuList.add(menu);
            }
        }
        return menuList;
    }


    //添加一级菜单/如果有parentId则为二级菜单
    @Override
    public Integer add(SysMenu sysMenu) {
        return sysMenuMapper.insertSelective(sysMenu);
    }

    //修改一级菜单//如果有parentid则为二级菜单
    @Override
    public Integer update(SysMenu sysMenu) {
        return sysMenuMapper.updateByPrimaryKey(sysMenu);
    }

    //删除一级菜单二级菜单一并删除
    @Override
    public Integer delete(Long menuId) {
        SysMenuExample sysMenuExample = new SysMenuExample();
        sysMenuExample.createCriteria().andParentIdEqualTo(menuId);
        int i = sysMenuMapper.deleteByExample(sysMenuExample);
        int j = sysMenuMapper.deleteByPrimaryKey(menuId);
        return i+j;
    }


}
