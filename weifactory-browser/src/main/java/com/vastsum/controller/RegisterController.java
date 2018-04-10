package com.vastsum.controller;

import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.User;
import com.vastsum.entity.UserRole;
import com.vastsum.entity.vo.RegisterUser;
import com.vastsum.entity.vo.UserInfo;
import com.vastsum.enums.LoginStatusEnum;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.properties.WeifactoryProperties;
import com.vastsum.service.RegisterService;
import com.vastsum.service.UserRoleService;
import com.vastsum.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * ctrl+shift+f9
 * @author ssj
 * @create 2017-06-30 21:09
 */
@RestController
@RequestMapping("/register")
@Api(value = "/register",tags = {"登陆注册管理"})
public class RegisterController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(RegisterController.class);
    @Autowired
    private WeifactoryProperties weifactoryProperties;
    

    private static final Integer EXPORT_ROLE_ID = 4;

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private AuthenticationManager myAuthenticationManager;  // 这样就可以自动注入？oh ，mygod ,how can it do so?


    //执行用户注册
    @RequestMapping(value = "/doRegister",method = RequestMethod.POST)
    @ApiOperation(value = "用户注册@20171015")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userName", value = "用户名", required = true, dataType = "string"),
            @ApiImplicitParam(paramType = "query",name = "userPassword", value = "密码", required = true, dataType = "string"),
            @ApiImplicitParam(paramType = "query",name = "enpassword",value = "确认密码",required = true),
            @ApiImplicitParam(paramType = "query",name = "userEmail",value = "用户邮箱",required = false),
            @ApiImplicitParam(paramType = "query",name = "userPhone",value = "用户手机",required = true),
            @ApiImplicitParam(paramType = "query", name = "roleId", value = "角色", required = false),
            @ApiImplicitParam(paramType = "query",name = "codeNum",value = "验证码",required = true)
    })
    public ResponseEntity<ResultModel> doRegister(RegisterUser registerUser, HttpServletRequest request){
        if (registerUser == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.FAILED));
        }
        if (registerUser.getUserName() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USERNAME_NULL));
        }
        if (registerUser.getUserPassword() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_PASSWORD_NULL));
        }
        if (registerUser.getEnpassword()== null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ENPASSWORD_NULL));
        }
        if (registerUser.getCodeNum()== null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.CODE_NULL));
        }
        if (registerUser.getUserPhone() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.PHONE_NULL));
        }
        User userByPhone = userService.findUserByPhone(registerUser.getUserPhone());
        if (userByPhone !=null ) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.PHONE_EXIST));
        }
        User user = new User();
        if (registerUser!=null){
            //封装数据
            user.setGmtCreate(new Date());
            user.setGmtModified(new Date());
            user.setStatus("1");
            user.setUserName(registerUser.getUserName());
            user.setUserPassword(DigestUtils.md5Hex(registerUser.getUserPassword()));
            user.setUserEmail(registerUser.getUserEmail());
            user.setUserPhone(registerUser.getUserPhone());
            //保存appid和appseret
            user.setAppId(DigestUtils.md5Hex(registerUser.getUserName()));
            user.setAppSecret(DigestUtils.md5Hex(registerUser.getUserPassword()));
            //获取验证码，判断验证码是否正确
            String codeNum = registerUser.getCodeNum();
            //获取session中的验证码
          String codeParam = request.getSession().getAttribute("codeParam").toString();

          //保存用户状态,专家注册不能直接使用，需要管理员认证
            if (EXPORT_ROLE_ID.equals(registerUser.getRoleId())){
                user.setStatus("0");
                user.setRole("4");
            }else {
                user.setStatus("1");
                user.setRole("2");
            }
            if (!codeNum.equals(codeParam)){
                logger.info("验证码不正确！，验证手机号为："+registerUser.getUserPhone());
                return ResponseEntity.ok(ResultModel.error(ResultStatus.CODE_ERROR));
            }
            int i = registerService.add(user);
            if (i==1){
                logger.info("用户注册成功");
                //给用户赋权限
                //获取注册成功的用户信息
                UserInfo userInfo = userService.findUserByUsername(user.getUserName());
                //创建权限对象并保存
                UserRole userRole = new UserRole();
                userRole.setUserId(userInfo.getUserId());
                //用户默认角色是普通用户
                if (registerUser.getRoleId() == null || "".equals(registerUser.getRoleId())){
                    userRole.setRoleId(2);
                }else {
                    userRole.setRoleId(registerUser.getRoleId());
                }
                int userRoleStatus = userRoleService.add(userRole);
                logger.info("userRole注册状态："+userRoleStatus);
                //删除session中的验证码，如果不删除可能会被不法分子利用
                request.getSession().removeAttribute("codeParam");
                return ResponseEntity.ok(ResultModel.ok(ResultStatus.USER_REGISTER_SUCCESS));
            }else if (i == 2){
                logger.info("用户已存在");
                return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_EXIST));
            }
        }else {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_REGISTER_FAILED));
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_REGISTER_FAILED));
    }

    /**
     * 短信验证
     * @param cell
     * @return 短信验证结果
     */
    @RequestMapping(value = "/smsCode",method = RequestMethod.POST)
    @ApiOperation(value = "短信验证")
    @ApiImplicitParam(paramType = "query",name = "cell",value = "手机号",required = true)
    public ResponseEntity<ResultModel> smsCode(@RequestParam String cell,HttpServletRequest request){
    	
        String url = weifactoryProperties.getSms().getUrl();
        String appkey = weifactoryProperties.getSms().getAppkey();
        String secret = weifactoryProperties.getSms().getSecret();
        String type = weifactoryProperties.getAlisms().getType();
        String extend = weifactoryProperties.getAlisms().getExtend();
        String signname = weifactoryProperties.getAlisms().getSignname();
        String templateCode = weifactoryProperties.getAlisms().getTemplateCode();
        Integer num = weifactoryProperties.getSms().getNumLength();
        
        
        Random r = new Random(System.currentTimeMillis());
        String codeParam = "";
        for(int i=0;i<num;i++){
            codeParam = codeParam+r.nextInt(10);
        }
        HttpSession session = request.getSession();
        session.setAttribute("codeParam",codeParam);
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend(extend);
        req.setSmsType(type);
        req.setSmsFreeSignName("微植物工厂");
        req.setSmsParamString("{\"code\":\""+codeParam+"\"}");
        req.setRecNum(cell.trim());
        req.setSmsTemplateCode(templateCode);
        AlibabaAliqinFcSmsNumSendResponse rsp = null;
        try {
             rsp = client.execute(req);
             if (rsp.getErrorCode()!=null){
                 return V.error(rsp.getSubMsg());
             }
            return ResponseEntity.ok(ResultModel.ok(rsp));
        }catch (Exception e){
            logger.error("短信验证失败，失败原因："+e);
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MSG_CODE_ERROR));
        }finally {
            //清空字符
            codeParam = "";
        }
    }

    //登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "用户登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "username",value = "用户名",required = true),
            @ApiImplicitParam(paramType = "query",name = "password",value = "密码",required = true)
    })
    public ResponseEntity<ResultModel> login(@RequestParam String username,
                                             @RequestParam(defaultValue="") String password,
                                             HttpServletRequest request){
        if (StringUtils.isBlank(username)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USERNAME_NULL));
        }
        if (StringUtils.isBlank(password)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_PASSWORD_NULL));
        }
        username = username.trim();
        //根据用户名获取用户信息，如果enable为0,用户没权限登陆
        User user = userService.getUserByUsername(username);
        if (user == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_NOT_FOUND));
        }
        if("0".equals(user.getStatus())){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_CANCLE));
        }
        if(LoginStatusEnum.AUDIT.getLoginStatus().equals(user.getLoginStatus())){
        	return V.error("此账号为专家账号，账号正在审核中!");
        }
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
        try {
            Authentication authentication = myAuthenticationManager.authenticate(authRequest); //调用loadUserByUsername
            SecurityContextHolder.getContext().setAuthentication(authentication);
            HttpSession session = request.getSession();
            session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext()); // 这个非常重要，否则验证后将无法登陆
            //登陆成功后的处理
            //根据登陆成功的用户名获取具体的用户信息
            UserInfo userInfo = userService.findUserByUsername(authentication.getName());
            //更新用户登录状态信息
            userService.updateLoginStatus(user.getUserId(), LoginStatusEnum.ONLINE.getLoginStatus());
            return ResponseEntity.ok(ResultModel.ok(userInfo));

        } catch (AuthenticationException ex) {
            //用户登陆失败
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_LOGIN_FAILED));
        }

    }

    //退出登录
    @PostMapping(value = "/loginOut")
    @ApiOperation(value = "用户退出@20180326")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户id",required = true)
    })
    public ResponseEntity<ResultModel> loginOut(@RequestParam Integer userId){
       if(userId == null){
    	   return V.error("用户id不能为空");
       }
       userService.updateLoginStatus(userId, LoginStatusEnum.LOGOUT.getLoginStatus());
       return V.ok();
    }


}
