package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.vo.UserInfo;
import com.vastsum.entity.User;

import java.util.List;

/**
 * @author ssj
 * @create 2017-07-27 21:30
 */
public interface UserService {

    /**
     * 根据id查询用户
     * @param id
     * @return 返回用户对象
     */
    @Deprecated
    public UserInfo findById(Integer id);
    
    /**
     * 根据用户ID获取用户信息
     * @param userId
     * @return User
     */
    User getById(Integer userId);

    /**
     * 根据用户id查询用户基本信息
     * @param userId
     * @return 用户基本信息
     */
    public User findUserByUserId(Integer userId);
    /**
     * 根据用户名查询用户
     * @param user
     * @return 返回用户列表
     */
    public List<User> findByUserName(User user);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return 用户详细信息
     */
    public UserInfo findUserByUsername(String username);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return User
     */
    User getUserByUsername(String username);

    /**
     * 根据用户名查询用户信息
     * @param userInfo
     * @return List<UserInfo>
     */
    public List<UserInfo> findUserInfoByUserName(UserInfo userInfo);

    /**
     * 根据手机号查询用户信息
     * @param phone
     * @return 用户信息
     */
    public User findUserByPhone(String phone);
    /**
     * 无条件查询所有用户
     * @return 返回用户列表
     */
    public List<User> findAll();

    /**
     * 分页查询所有用户
     * @param pageSize
     * @param page
     * @return 分页封装的用户
     */
    public PageInfo<User> findAllByPage(int page, int pageSize);

    /**
     * 更新符合条件的用户
     * @param user
     * @return 更新结束状态1：成功，0失败
     */
    public int update(User user);

    /**
     * 添加用户
     * @param user
     * @return 添加成功是否值，1表示成功，2表示失败
     */
    public int add(User user);

    /**
     * 根据条件删除用户
     * @param user
     * @return 返回删除用户结果状态，成功1，失败0
     */
    public int deleteByUser(User user);


    /**
     * 查询所有专家用户
     * @param page
     * @param pageSize
     * @return PageInfo<User>
     */
    public PageInfo<User> selectExpert(Integer page, Integer pageSize);

    /**
     * 查询所有专家
     * @return List<User>
     */
     List<User> listExperts();
     
     /**
      * 列出对应角色和登录状态的用户
      * @param roleId
      * @param loginStatus
      */
     List<User> listOnlineExperts(Integer roleId, String loginStatus);

    /**
     * 根据用户名密码获取用户信息
     * @param username
     * @param password
     * @return User
     */
    public User selectUserByUsernameAndPassword(String username, String password);

    /**
     * 根据用户名和新密码更新用户密码
     * @param username
     * @param password
     * @return int
     */
    public int updateUserPassword(String username, String password);

    /**
     * 物理删除用户
     * @param userId
     * @return Integer
     */
    Integer deleteByUserId(Integer userId);
    
    /**
     * 更新登录状态
     * @param loginStatus
     * @return int
     */
    int updateLoginStatus(Integer userId, String loginStatus);

}
