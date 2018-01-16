package com.vastsum.controller.system;

import com.vastsum.entity.Role;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.service.DeviceService;
import com.vastsum.service.SysMenuService;
import com.vastsum.service.UserRoleService;
import com.vastsum.service.UserService;
import com.vastsum.entity.SysMenu;
import com.vastsum.entity.User;
import com.vastsum.entity.vo.Menu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ssj
 * @create 2017-08-27 14:42
 */
@RestController
@RequestMapping("/menu")
@Api(value = "/menu",tags = {"菜单管理"})
public class MenuController extends BaseController {

    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private DeviceService deviceService;

    @GetMapping(value = "/{userId}")
    @ApiOperation(value = "根据用户id获取用户菜单@20171023")
    @ApiImplicitParam(paramType = "path",name = "userId",value = "用户id",required = true)
    public ResponseEntity<ResultModel> queryUserMenuByuserId(@PathVariable Integer userId){
        if (userId==null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        User user = userService.findUserByUserId(userId);
        //判断用户是否存在
        if (user==null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_NOT_FOUND));
        }

        Role role = userRoleService.findRoleByuserId(userId);
        if (role == null ) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ROLE_NOT_FOUND));
        }
        List<SysMenu> userMenuList = sysMenuService.findSysMenusByuserId(userId);
        //f返回的菜单列表
        int size = userMenuList.size();
        List<Menu> menuList = new ArrayList<>();
        for (int i = 0; i<size; i++){
            if (userMenuList.get(i).getParentId() == null ){
                //说明是父菜单，父菜单构建子菜单
                List<SysMenu> childList = new ArrayList<>();
                //封装父菜单
                Menu<SysMenu> menu = new Menu<>();
                //将子菜单放入父菜单
                menu.setChildren(childList);
                menuList.add(menu);
                //将对应的子菜单装到父菜单里面
                for (SysMenu sysMenu:userMenuList){
                    if (userMenuList.get(i).getMenuId().equals(sysMenu.getParentId())){
                        menu.setMenuId(userMenuList.get(i).getMenuId());
                        menu.setName(userMenuList.get(i).getName());
                        menu.setOrderNum(userMenuList.get(i).getOrderNum());
                        menu.setUrl(userMenuList.get(i).getUrl());


                        childList.add(sysMenu);
                    }
                }
            }
        }
        return ResponseEntity.ok(ResultModel.ok(menuList));
    }


    @GetMapping(value = "/role/{roleId}")
    @ApiOperation(value = "根据角色id获取角色对应的菜单信息@20171103")
    @ApiImplicitParam(paramType = "path",name = "roleId",value = "角色ID",required = true)
    public ResponseEntity<ResultModel> listMenuByRoleId(@PathVariable Long roleId){
        if (roleId==null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ROLE_ID_NULL_NULL));
        }
        List<Menu<SysMenu>> menus = sysMenuService.listSysMenuByRoleId(roleId);
        return ResponseEntity.ok(ResultModel.ok(menus));
    }


    @GetMapping(value = "/list")
    @ApiOperation(value = "获取一级菜单@20171031")
    public ResponseEntity<ResultModel> list(){
        List<SysMenu> sysMenuPageInfo = sysMenuService.listSysMenuFirst();
        return ResponseEntity.ok(ResultModel.ok(sysMenuPageInfo));
    }


    @GetMapping(value = "/listAll")
    @ApiOperation(value = "获取一级和二级菜单@20171031")
    public ResponseEntity<ResultModel> listAll(){
        List<Menu<SysMenu>> menuPageInfo = sysMenuService.listMenuAll();
        return ResponseEntity.ok(ResultModel.ok(menuPageInfo));
    }

    @GetMapping(value = "/list/{menuId}")
    @ApiOperation(value = "获取二级菜单@20171031")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "menuId",value = "菜单ID",required = true),
    })
    public ResponseEntity<ResultModel> listSecondMenu(@PathVariable Long menuId){
        if (menuId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MENU_ID_NULL));
        }
        List<SysMenu> sysMenuPageInfo = sysMenuService.listSysMenuSecond(menuId);
        return ResponseEntity.ok(ResultModel.ok(sysMenuPageInfo));
    }


    @PostMapping(value = "/saveOrUpdate")
    @ApiOperation(value = "保存或添加菜单@20171031")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "menuId", value = "菜单id(添加不填，修改填写)", required = false),
            @ApiImplicitParam(paramType = "query", name = "parentId", value = "父菜单id（二级菜单必须带上，无论修改还是添加,一级菜单不填写）", required = false),
            @ApiImplicitParam(paramType = "query", name = "name", value = "菜单名称", required = true),
            @ApiImplicitParam(paramType = "query", name = "url", value = "菜单url", required = true),
            @ApiImplicitParam(paramType = "query", name = "perms", value = "菜单参数", required = false),
            @ApiImplicitParam(paramType = "query", name = "icon", value = "菜单icon", required = false),
            @ApiImplicitParam(paramType = "query", name = "orderNum", value = "菜单排序", required = false)
    })
    public ResponseEntity<ResultModel> addOrUpdate(@ModelAttribute SysMenu sysMenu){

        if (sysMenu == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MENU_NULL));
        }
        if (sysMenu.getUrl() == null || "".equals(sysMenu.getUrl())){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MENU_URL_NULL));
        }
        if (sysMenu.getName() == null || "".equals(sysMenu.getName())){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MENU_NAME_NULL));
        }
        if (sysMenu.getMenuId() == null){
            Integer i = sysMenuService.add(sysMenu);
            if (i>0){
                return ResponseEntity.ok(ResultModel.ok());
            }
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
        }

        Integer j = sysMenuService.update(sysMenu);
        if (j>0){
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));

    }

    @GetMapping(value = "/delete/{menuId}")
    @ApiOperation(value = "删除菜单@20171031")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "menuId",value = "菜单lid",required = true)
    })
    public ResponseEntity<ResultModel> delete(@PathVariable Long menuId){
        if (menuId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MENU_ID_NULL));
        }
        Integer i = sysMenuService.delete(menuId);
        if (i>0){
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
    }


}
