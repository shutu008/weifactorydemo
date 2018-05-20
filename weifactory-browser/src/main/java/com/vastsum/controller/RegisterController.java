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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.User;
import com.vastsum.entity.UserRole;
import com.vastsum.entity.dto.RecoverPassword;
import com.vastsum.entity.vo.RegisterUser;
import com.vastsum.entity.vo.UserInfo;
import com.vastsum.enums.LoginStatusEnum;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.pojo.MD5PasswordEncoder;
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
    private static final String A = "a";//短信验证手机号前缀
    @Autowired
    private WeifactoryProperties weifactoryProperties;
    

    private static final Integer EXPORT_ROLE_ID = 4;

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;
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
          Object obj = request.getSession().getAttribute(A+registerUser.getUserPhone());
          if (obj == null) {
			return V.error("该手机号对应的短信验证码不存在!");
		}
        String codeParam = obj.toString();

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
        session.setAttribute(A+cell,codeParam);
//        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
//        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
//        req.setExtend(extend);
//        req.setSmsType(type);
//        req.setSmsFreeSignName(signname);
//        req.setSmsParamString("{\"code\":\""+codeParam+"\"}");
//        req.setRecNum(cell.trim());
//        req.setSmsTemplateCode(templateCode);
//        AlibabaAliqinFcSmsNumSendResponse rsp = null;
//        try {
//             rsp = client.execute(req);
//             if (rsp.getErrorCode()!=null){
//                 return V.error(rsp.getSubMsg());
//             }
//            return ResponseEntity.ok(ResultModel.ok(rsp));
//        }catch (Exception e){
//            logger.error("短信验证失败，失败原因："+e);
//            return ResponseEntity.ok(ResultModel.error(ResultStatus.MSG_CODE_ERROR));
//        }finally {
//            //清空字符
//            codeParam = "";
//        }
        
        
        //请求失败这里会抛ClientException异常
        SendSmsResponse sendSmsResponse = null;
        try {
      //设置超时时间-可自行调整
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        //初始化ascClient需要的几个参数
        final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
        final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
        //替换成你的AK
        final String accessKeyId = appkey;//你的accessKeyId,参考本文档步骤2
        final String accessKeySecret = secret;//你的accessKeySecret，参考本文档步骤2
        //初始化ascClient,暂时不支持多region（请勿修改）
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
        accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);
         //组装请求对象
         SendSmsRequest req = new SendSmsRequest();
         //使用post提交
         req.setMethod(MethodType.POST);
         //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
         req.setPhoneNumbers(cell);
         //必填:短信签名-可在短信控制台中找到
         req.setSignName(signname);
         //必填:短信模板-可在短信控制台中找到
         req.setTemplateCode(templateCode);
         //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
         //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
         req.setTemplateParam("{\"code\":\""+codeParam+"\"}");
         //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
         //request.setSmsUpExtendCode("90997");
         //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
         req.setOutId(extend);
		
			sendSmsResponse = acsClient.getAcsResponse(req);
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
        return V.ok(sendSmsResponse);
        }
        return V.error("短信验证码获取异常");
    }

    //登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "用户登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "username",value = "用户名",required = true),
            @ApiImplicitParam(paramType = "query",name = "phoneNumber",value = "手机号",required = true)
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
        
        MD5PasswordEncoder md5Password = new MD5PasswordEncoder();
        String currPassword = md5Password.encode(password);
        String dbPassword = user.getUserPassword();
        if (!currPassword.equals(dbPassword)) {
			return V.error("用户名或密码错误！");
		}
        //登陆成功后的处理
        //根据登陆成功的用户名获取具体的用户信息
        UserInfo userInfo = userService.findUserByUsername(username);
        //更新用户登录状态信息
        userService.updateLoginStatus(user.getUserId(), LoginStatusEnum.ONLINE.getLoginStatus());
        return ResponseEntity.ok(ResultModel.ok(userInfo));

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
    
    
    
    //修改密码
    @PostMapping(value = "/updatePw")
    @ApiOperation(value = "找回密码@20180520")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "phoneNumber",value = "手机号",required = true),
            @ApiImplicitParam(paramType = "query",name = "password", value = "密码", required = true),
            @ApiImplicitParam(paramType = "query",name = "enpassword",value = "确认密码",required = true),
            @ApiImplicitParam(paramType = "query",name = "validateCode",value = "验证码",required = true)
    })
    public ResponseEntity<ResultModel> updatePw(RecoverPassword recoverPassword,HttpServletRequest request){
    	if (recoverPassword == null) {
			V.error("请传入正确参数");
		}
        if (StringUtils.isNotBlank(recoverPassword.getPhoneNumber())) {
			User user = userService.findUserByPhone(recoverPassword.getPhoneNumber());
			if (user == null) {
				return V.error("手机号对应的用户不存在，请直接进行用户注册！");
			}
		}
        
        if (!StringUtils.equals(recoverPassword.getEnpassword(), recoverPassword.getPassword())) {
			return V.error("密码与确认密码不相同，请重新输入！");
		}
		 Object obj = request.getSession().getAttribute(A+recoverPassword.getPhoneNumber());
		 if (obj == null) {
				return V.error("该手机号对应的短信验证码不存在!");
			}
        String codeParam = obj.toString();
        
        if (!codeParam.equals(recoverPassword.getValidateCode())) {
			return V.error("验证码不正确！");
		}
        
        User user = userService.findUserByPhone(recoverPassword.getPhoneNumber());
        MD5PasswordEncoder md5PasswordEncoder = new MD5PasswordEncoder();
        user.setUserPassword(md5PasswordEncoder.encode(recoverPassword.getPassword()));
        userService.update(user);
        return V.ok();

    }
    
    


}
