package com.vastsum.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.JoinMapper;
import com.vastsum.dao.UserMapper;
import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.User;
import com.vastsum.entity.UserExample;
import com.vastsum.entity.UserRole;
import com.vastsum.entity.UserRoleExample;
import com.vastsum.entity.vo.UserInfo;
import com.vastsum.service.UserService;

/**
 * 用户管理
 * @author ssj
 * @create 2017-07-27 21:34
 * 用法：http://www.cnblogs.com/fengzheng/archive/2016/09/22/5889312.html
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JoinMapper joinMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Override
    public UserInfo findById(Integer id) {
       return joinMapper.selectUserInfoByPrimaryKey(id);
       // return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户id查询用户基本信息
     * @param userId
     * @return
     */
    @Override
    public User findUserByUserId(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }


    @Override
    @Deprecated
    public List<User> findByUserName(User user) {
       UserExample userExample = new UserExample();
        userExample.setOrderByClause("gmt_create desc");
        userExample.createCriteria().andUserNameEqualTo(user.getUserName());
        return userMapper.selectByExample(userExample);
    }

    @Override
    public UserInfo findUserByUsername(String username) {
        List<UserInfo> userInfos = joinMapper.selectUserInfoByUserName(username);
        if (userInfos.isEmpty()) {
            return null;
        }
        return userInfos.get(0);
    }

    //根据用户名获取用户信息
    @Override
    public User getUserByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users == null || users.isEmpty()){
            return null;
        }
        return users.get(0);
    }


    @Override
    public List<UserInfo> findUserInfoByUserName(UserInfo userInfo) {
        return joinMapper.selectUserInfoByUserName(userInfo.getUserName());
    }

    @Override
    public User findUserByPhone(String phone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(phone);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }

    @Override
    public List<User> findAll() {
        UserExample userExample = new UserExample();
        userExample.setOrderByClause("gmt_create desc");
        //先进行空对象查询
        return  userMapper.selectByExample(userExample);
    }


    //分页查询所有信息
    @Override
    public PageInfo<User> findAllByPage(int page,int pageSize) {
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<User> userList = this.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }


    @Override
    public int update(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i>0){
            return i;
        }
        return 0;
    }

    @Override
    public int add(User user) {
        int i = userMapper.insertSelective(user);
        if (i>0){
            return i;
        }
        return 0;
    }


    @Override
    public int deleteByUser(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(user.getUserId());
        int i = userMapper.deleteByExample(userExample);
        return i;
    }

    //待审核获取专家用户
    @Override
    public PageInfo<User> selectExpert(Integer page, Integer pageSize) {
        //查询出拥有专家身份的用户id
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andRoleIdEqualTo(4);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        List<Integer> listUserId = new ArrayList<>();
        if (userRoles == null || userRoles.isEmpty()){
            return new PageInfo<>();
        }
        for (UserRole userRole: userRoles) {
            listUserId.add(userRole.getUserId());
        }
        //查询出所有待审核专家
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdIn(listUserId);//查询出所有专家
        List<User> users = userMapper.selectByExample(userExample);
        return new PageInfo<>(users);
    }

    //查询所有专家
    @Override
    public List<User> listExperts() {
        //查询出拥有专家身份的用户id
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andRoleIdEqualTo(4);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        List<Integer> listUserId = new ArrayList<>();
        if (userRoles == null || userRoles.isEmpty()){
            return new ArrayList<>();
        }
        for (UserRole userRole: userRoles) {
            listUserId.add(userRole.getUserId());
        }
        //查询出所有专家
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdIn(listUserId);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
    
    //列出指定角色和登录状态的用户
    public List<User> listOnlineExperts(Integer roleId, String loginStatus){
    	 //查询出拥有专家身份的用户id
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andRoleIdEqualTo(roleId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        List<Integer> listUserId = new ArrayList<>();
        if (userRoles == null || userRoles.isEmpty()){
            return new ArrayList<>();
        }
        for (UserRole userRole: userRoles) {
            listUserId.add(userRole.getUserId());
        }
        //查询出所有专家
        UserExample userExample = new UserExample();
        userExample.createCriteria()
        .andUserIdIn(listUserId)
        .andLoginStatusEqualTo(loginStatus)
        .andStatusEqualTo("1");//可用专家用户
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public User selectUserByUsernameAndPassword(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username).andUserPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if (users !=null && !users.isEmpty()){
            return users.get(0);
        }
        return null;
    }

    //更新用户密码，参数为md5加密过的密码
    @Override
    public int updateUserPassword(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        User record = new User();
        record.setUserPassword(password);
       return userMapper.updateByExampleSelective(record,userExample);
    }

    //物理删除用户信息
    @Override
    public Integer deleteByUserId(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

	@Override
	public int updateLoginStatus(Integer userId,String loginStatus) {
		User user = new User();
		user.setUserId(userId);
		user.setLoginStatus(loginStatus);
		int i = userMapper.updateByPrimaryKeySelective(user);
		return i;
	}

	@Override
	public User getById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}


}
