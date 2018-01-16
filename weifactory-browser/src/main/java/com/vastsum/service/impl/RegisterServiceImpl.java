package com.vastsum.service.impl;

import com.vastsum.dao.UserMapper;
import com.vastsum.service.RegisterService;
import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.User;
import com.vastsum.entity.UserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ssj
 * @create 2017-06-30 21:03
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    private static Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);
    @Resource
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;


    /**
     * 注册用户
     * @param user
     * @return
     */
    @Override
    public int add(User user) {

        //获取用户名，用于判断用户名是否注册
        String username = user.getUserName();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        //执行用户注册
        if (users == null || users.isEmpty()) {
            return userMapper.insert(user);
        }
        return 0;
    }
}

