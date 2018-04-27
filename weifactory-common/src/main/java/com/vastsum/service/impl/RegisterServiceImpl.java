package com.vastsum.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.vastsum.dao.UserMapper;
import com.vastsum.entity.User;
import com.vastsum.entity.UserExample;
import com.vastsum.service.RegisterService;

/**
 * @author ssj
 * @create 2017-06-30 21:03
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private UserMapper userMapper;


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

