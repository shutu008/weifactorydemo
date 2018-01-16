package com.vastsum.controller.system;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Role;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ssj
 * @create 2017-10-31 22:50
 */
@RequestMapping("/role")
@RestController
@Api(value = "/role",tags = {"角色管理"})
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/list/{page}/{pageSize}")
    @ApiOperation(value = "角色列表@20171031")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> list(@PathVariable Integer page, @PathVariable Integer pageSize){
        PageInfo<Role> rolePageInfo = roleService.list(page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(rolePageInfo));
    }


    @PostMapping(value = "updateRoleMenus")
    @ApiOperation(value = "更新角色菜单权限@20171031")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "roleId",value = "角色id",required = true),
            @ApiImplicitParam(paramType = "query",name = "menuString",value = "菜单权限字符串",required = true)
    })
    public ResponseEntity<ResultModel> updateRoleMenus(Long roleId, String menuString){
        if (roleId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ROLE_ID_NULL_NULL));
        }
        if (menuString == null){
            return  ResponseEntity.ok(ResultModel.error(ResultStatus.MENU_ID_NULL));
        }
        Integer i = roleService.updateRoleMenus(roleId, menuString);
        if (i >0){
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
    }
}
