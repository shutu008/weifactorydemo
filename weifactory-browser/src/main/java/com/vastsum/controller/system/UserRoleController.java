package com.vastsum.controller.system;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.Role;
import com.vastsum.entity.UserRole;
import com.vastsum.entity.UserRoleExample;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.service.RoleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 用户权限管理
 * @author ssj
 * @create 2017-08-06 8:20
 */
@RestController
@RequestMapping("/userRole")
@Api(value = "/userRole",tags = {"用户权限管理"})
public class UserRoleController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(UserRoleController.class);

    @Autowired
    private UserRoleMapper userRoleMapper;
/*    @Autowired
    private UserRoleService userRoleService;*/
    @Autowired
    private RoleService roleService;

    //单权限，一个用户只有一种权限
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改用户权限")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户id",required = true),
            @ApiImplicitParam(paramType = "query",name = "roleId",value = "权限id",required = true)
    })
    public ResponseEntity<ResultModel> update(UserRole userRole){
        ResponseEntity<ResultModel> validate = this.userRoleValidate(userRole);
        if (validate.getBody().getCode() != ResultStatus.SUCCESS.getCode()) {
            return validate;
        }
        //根据用户id查询出user-role
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(userRole.getUserId());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles.isEmpty()) {
            return this.add(userRole);
        }
        UserRole userRoleResult = userRoles.get(0);
        userRoleResult.setRoleId(userRole.getRoleId());
        userRoleResult.setGmtModified(new Date());
        int i = userRoleMapper.updateByPrimaryKeySelective(userRoleResult);
        if (i>0) {
            return ResponseEntity.ok(ResultModel.ok(ResultStatus.ROLE_UPDATE_SUCCESS));
        }
        return ResponseEntity.ok(ResultModel.ok(ResultStatus.ROLE_UPDATE_FAILED));
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value = "为用户添加权限")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户id",required = true),
            @ApiImplicitParam(paramType = "query",name = "roleId",value = "权限id",required = true)
    })
    public ResponseEntity<ResultModel> add(UserRole userRole){
        ResponseEntity<ResultModel> validate = this.userRoleValidate(userRole);
        if ( validate.getBody().getCode()!= ResultStatus.SUCCESS.getCode()) {
            return validate;
        }
        userRole.setGmtCreate(new Date());
        userRole.setGmtModified(new Date());
        int i = userRoleMapper.insertSelective(userRole);
        if (i>0) {
            return ResponseEntity.ok(ResultModel.ok(ResultStatus.ROLE_ADD_SUCCESS));
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ROLE_ADD_FAILED));
    }

    //根据用户Id获取用户角色
    @RequestMapping(value = "/role/{userId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据用户Id获取用户角色@20170914")
    @ApiImplicitParam(paramType = "path",name = "userId",value = "用户id",required = true)
    public ResponseEntity<ResultModel> getRole(@PathVariable Integer userId){
        if (userId!=null && !"".equals(userId)){
            Role role = roleService.selectRoleByUserId(userId);
            if (role==null) {
                return ResponseEntity.ok(ResultModel.error(ResultStatus.ROLE_USER_NOT_FOUND));
            }
            return ResponseEntity.ok(ResultModel.ok( role));
        }else {
            logger.info("根据用户id,查询用户详细信息，userId为空");
            //如果请求出错给结果两个参数，自定义状态码和http状态码
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
    }


    //用户角色输入验证
    private ResponseEntity<ResultModel> userRoleValidate(UserRole userRole){
        if (userRole==null || "".equals(userRole)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.PARAM_NULL));
        }
        if (userRole.getUserId() == null || "".equals(userRole.getUserId())) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        if (userRole.getRoleId() == null || "".equals(userRole.getRoleId())) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ROLE_ID_NULL_NULL));
        }
        return ResponseEntity.ok(ResultModel.ok());
    }

}
