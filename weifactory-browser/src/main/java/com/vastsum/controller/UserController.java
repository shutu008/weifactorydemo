package com.vastsum.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.User;
import com.vastsum.entity.vo.UserInfo;
import com.vastsum.enums.LoginStatusEnum;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.pojo.PageCondition;
import com.vastsum.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author ssj
 * @create 2017-07-27 21:46
 */
@RestController
@RequestMapping("/user")
@Api(value="/user",tags = {"用户管理"})
public class UserController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    //获取所有用户列表
    @RequestMapping(value = "/userList/{page}/{pageSize}",
            method = RequestMethod.GET)
    @ApiOperation(value = "分页查询用户", notes = "分页查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name="page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数大小",required = true)
    })
    public ResponseEntity<ResultModel> userList(@PathVariable Integer page, @PathVariable Integer pageSize){
        PageInfo<User> users = userService.findAllByPage(page,pageSize);
        return  ResponseEntity.ok(ResultModel.ok(users));
    }
    
    
    //根据条件获取用户信息
    @PostMapping(value = "/search")
    @ApiOperation(value = "根据条件搜索用户信息@20180520")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="page",value = "页码",required = false),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "页数大小",required = false),
            @ApiImplicitParam(paramType = "query",name = "userName",value = "用户名",required = false),
            @ApiImplicitParam(paramType = "query",name = "userPhone",value = "手机号",required = false),
            @ApiImplicitParam(paramType = "query",name= "userEmail",value = "邮箱",required = false)
    })
    public ResponseEntity<ResultModel> search(User user, PageCondition pageCondition){
        return V.ok(userService.pageByUser(user, pageCondition));
    }


    //分页列出所有专家
    @RequestMapping(value = "/expertList/{page}/{pageSize}",
            method = RequestMethod.GET)
    @ApiOperation(value = "分页列出所有专家@20180103")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name="page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数大小",required = true)
    })
    public ResponseEntity<ResultModel> expertList(@PathVariable Integer page, @PathVariable Integer pageSize){
        PageInfo<User> users = userService.selectExpert(page,pageSize);
        return  ResponseEntity.ok(ResultModel.ok(users));
    }


    @GetMapping(value = "/detail/{userId}")
    @ApiOperation(value = "根据用户Id获取用户信息")
    @ApiImplicitParam(paramType = "path",name = "userId",value = "用户id",required = true)
    public ResponseEntity<ResultModel> getDetail(@PathVariable Integer userId){
        if (userId!=null && !"".equals(userId)){
            UserInfo userInfo = userService.findById(userId);
            if (userInfo==null) {
                return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_NOT_FOUND));
            }
            return ResponseEntity.ok(ResultModel.ok(userInfo));
        }else {
            logger.info("根据用户id,查询用户详细信息，userId为空");
            //如果请求出错给结果两个参数，自定义状态码和http状态码
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
    }


    @GetMapping(value = "/{userName}")
    @ApiOperation(value = "根据用户名获取用户信息，判断用户是否存在")
    @ApiImplicitParam(paramType = "path",name = "userName",value = "用户名",required = true)
    public ResponseEntity<ResultModel> getUserInfo(@PathVariable String userName){
        if (userName == null || "".equals(userName)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USERNAME_NULL));
        }
        User user = new User();
        user.setUserName(userName);
        List<User> users = userService.findByUserName(user);
        if (users.isEmpty()){
            return ResponseEntity.ok(ResultModel.ok());
        }else {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_EXIST));
        }
    }


    @GetMapping(value = "/delete/{id}")
    @ApiOperation(value = "根据id删除用户")
    @ApiImplicitParam(paramType = "path",name = "id",value = "用户id",required = true)
    public ResponseEntity<ResultModel> delete(@PathVariable Integer id){
       // Assert.notNull(id,"用户id不能为空");
        if (id==null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        User user = new User();
        user.setUserId(id);
        int i = userService.deleteByUser(user);
        if (i>0){
           return ResponseEntity.ok(ResultModel.ok());
        }else {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_DELETE_FAILED));
        }
    }


    @PostMapping(value = "/add")
    @ApiOperation(value = "后台添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userName",value = "用户名",required = true),
            @ApiImplicitParam(paramType = "query",name = "userPassword",value = "密码",required = true),
            @ApiImplicitParam(paramType = "query",name = "userPhone",value = "手机号",required = false),
            @ApiImplicitParam(paramType = "query",name= "userEmail",value = "邮箱",required = false),
            @ApiImplicitParam(paramType = "query",name = "userWeixinId",value = "微信id",required = false),
            @ApiImplicitParam(paramType = "query",name ="userWeixinNickname",value = "微信名称",required = false),
            @ApiImplicitParam(paramType = "query",name = "personalIntroduction",value = "用户描述",required = false)

    })
    public ResponseEntity<ResultModel> add(@RequestParam(name = "userName",required = true) String userName,
                   @RequestParam(value = "userPassword",required = true) String password,
                   @RequestParam(value = "userPhone", required = false) String userPhone,
                   @RequestParam(value = "userEmail",required = false) String userEmail,
                   @RequestParam(value = "userWeixinId",required = false) String userWeixinId,
                   @RequestParam(value = "userWeixinNickname",required = false) String userWeixinNickname,
                   @RequestParam(value = "personalIntroduction",required = false) String personalIntroduction){
        if (userName==null || "".equals(userName)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USERNAME_NULL));
        }
        if (password==null || "".equals(password)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.PASSWORD_ERROR));
        }
        User u = new User();
        u.setUserName(userName);
        List<User> users = userService.findByUserName(u);
        if (!users.isEmpty()) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USERNAME_EXIST));
        }
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(DigestUtils.md5Hex(password));
        if (userPhone!=null && !"".equals(userPhone)){
            user.setUserPhone(userPhone);
            user.setIsBindPhone(true);
        }
        user.setUserEmail(userEmail);
        user.setUserWeixinId(userWeixinId);
        user.setUserWeixinNickname(userWeixinNickname);
        user.setPersonalIntroduction(personalIntroduction);
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());
        user.setStatus("1");
        //保存appid和appseret
        user.setAppId(DigestUtils.md5Hex(userName));
        user.setAppSecret(DigestUtils.md5Hex(password));

        //调用添加程序
        int i = userService.add(user);
        if (i>0){
           return ResponseEntity.ok(ResultModel.ok());
        }else {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ADD_FAILED));
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value ="修改用户信息" )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",value = "用户id",required = true),
            @ApiImplicitParam(paramType = "query",name = "userPassword",value = "密码",required = false),
            @ApiImplicitParam(paramType = "query",name = "userPhone",value = "手机号",required = false),
            @ApiImplicitParam(paramType = "query",name= "userEmail",value = "邮箱",required = false),
            @ApiImplicitParam(paramType = "query",name = "userWeixinId",value = "微信id",required = false),
            @ApiImplicitParam(paramType = "query",name ="userWeixinNickname",value = "微信名称",required = false),
            @ApiImplicitParam(paramType = "query",name = "personalIntroduction",value = "用户描述",required = false)

    })
    public ResponseEntity<ResultModel> update(Integer id,
                  String userPassword,
                  String userPhone,
                  String userEmail,
                  String userWeixinId,
                  String userWeixinNickname,
                  String personalIntroduction){
        if (id==null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        User user = new User();
        //修改用户必须要有userId;
        user.setUserId(id);
        if (userPassword!=null && !"".equals(userPassword)) {
            user.setUserPassword(DigestUtils.md5Hex(userPassword));
        }
        if (userPhone!=null && !"".equals(userPhone)){
            user.setUserPhone(userPhone);
            user.setIsBindPhone(true);
        }
        user.setUserEmail(userEmail);
        user.setUserWeixinId(userWeixinId);
        user.setUserWeixinNickname(userWeixinNickname);
        user.setPersonalIntroduction(personalIntroduction);
        user.setGmtModified(new Date());
        user.setStatus("1");
        if(StringUtils.isNotBlank(userPassword)){
        	user.setAppSecret(DigestUtils.md5Hex(userPassword));
        }

        //调用添加程序
        int i = userService.update(user);
        if (i>0){
            return ResponseEntity.ok(ResultModel.ok());
        }else {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_UPDATE_FAILED));
        }
    }

    @RequestMapping(value = "/changePassword",method = RequestMethod.POST)
    @ApiOperation(value ="修改用户密码@20170916" )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "username",value = "用户名",required = true),
            @ApiImplicitParam(paramType = "query",name = "oldPassword",value = "旧密码",required = true),
            @ApiImplicitParam(paramType = "query",name = "newPassword",value = "新密码",required = true)
    })
    public ResponseEntity<ResultModel> changePassowrd(String username,String oldPassword,String newPassword){
        if (username == null || username == ""){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USERNAME_NULL));
        }
        if (oldPassword == null || oldPassword == "" ) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_PASSWORD_NULL));
        }
        if (newPassword == null || newPassword == "" ) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_NEW_PASSWORD_NULL));
        }
        UserInfo userInfo = userService.findUserByUsername(username);
        if (userInfo == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_NOT_FOUND));
        }
        User user = userService.selectUserByUsernameAndPassword(username, DigestUtils.md5Hex(oldPassword));
        if (user ==null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_PASSWORD_ERROR));
        }

        int i = userService.updateUserPassword(username, DigestUtils.md5Hex(newPassword));
        if (i>0) {
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.FAILED));
    }
    
    
    
    

    //审批专家操作
    @PostMapping(value = "/changeExport")
    @ApiOperation(value = "审批专家操作@20171022")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", value = "用户ID", required = true),
            @ApiImplicitParam(paramType = "query", name = "status", value = "状态", required = true)
    })
    public ResponseEntity<ResultModel> changeExport(Integer userId, String status){

        if (userId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        if (StringUtils.isEmpty(status)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
        }
        if (status.equals("0")){
            //如果拒绝直接删除用户
            userService.deleteByUserId(userId);
            return V.ok();
        }
        User user = new User();
        user.setStatus("1");
        user.setUserId(userId);
       userService.update(user);
       return V.ok();
    }
    
    //列出所有在线专家
    @PostMapping(value = "/onlineExpert")
    @ApiOperation(value = "列出在线专家@20180326")
    public ResponseEntity<ResultModel> getOnlineExpert(){
    	List<User> experts = userService.listOnlineExperts(4, LoginStatusEnum.ONLINE.getLoginStatus());
    	return V.ok(experts);
    }
}
