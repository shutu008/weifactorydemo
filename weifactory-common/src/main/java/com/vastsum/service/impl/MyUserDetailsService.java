package com.vastsum.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vastsum.dao.RoleMapper;
import com.vastsum.dao.UserMapper;
import com.vastsum.dao.UserRoleMapper;
import com.vastsum.entity.Role;
import com.vastsum.entity.RoleExample;
import com.vastsum.entity.User;
import com.vastsum.entity.UserExample;
import com.vastsum.entity.UserRole;
import com.vastsum.entity.UserRoleExample;
import com.vastsum.entity.pojo.MyUserDetails;

/**
 *  作为MyUserDetail 实体类的DAO层 进行登录名认证的规则定义
 * 自定义查询数据库规则 并返回相应的实体类
 * @author ssj
 * @create 2017-07-08 17:36
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
    private static Logger logger= LoggerFactory.getLogger(MyUserDetailsService.class);
    public static final String AUTHORITIES_BY_USERNAME_QUERY = "select r.role_name,r.gmt_modified from role as r left join user_role as ur on r.role_id = ur.role_id\n" +
            "left join `user` as u on ur.user_id = u.user_id where u.user_name = ?";
    public static final String GROUP_AUTHORITIES_BY_USERNAME_QUERY = "";
    protected final MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();


    private String rolePrefix = "";//角色前缀
    private boolean usernameBasedPrimaryKey = true;//如果为真 则使用query语句查询出来的用户名作为用户实体的username 否则 则使用你用于登录认证时上传的用户名作为实体的username
    private boolean enableAuthorities = true;//是否支持权限验证
    private boolean enableGroups;//是否支持组

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User u = this.loadUsersByUsername(s);
        Set<GrantedAuthority> dbAuthsSet = new HashSet<>();
        if(this.enableAuthorities) {
            dbAuthsSet.addAll(this.loadUserAuthorities(u.getUserName()));
        }
        List<GrantedAuthority> dbAuths = new ArrayList<>(dbAuthsSet);
        if(dbAuths.size() == 0) {
            logger.info("User \'" + s + "\' has no authorities and will be treated as \'not found\'");
            throw new UsernameNotFoundException(this.messages.getMessage("MyUserDetailsService.noAuthority", new Object[]{s}, "User {0} has no GrantedAuthority"));
        } else {
            return this.createUserDetail(u.getUserName(),u.getUserPassword(),dbAuths);
        }

    }

    /**
     * 根据用户名查询出用户的相应信息
     *
     * @param username 登录时的用户名
     * @return 查询出的用户实体类
     */
    protected User loadUsersByUsername(String username) throws UsernameNotFoundException{
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0){
            logger.debug("no user or username error");
            throw new UsernameNotFoundException("no user or username error");
        }
        return users.get(0);
    }

    /**
     * 根据用户名加载用户的相应权限
     * @param username 用户名
     * @return
     */
    protected List<GrantedAuthority> loadUserAuthorities(String username) {
        //---查询用户id
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users==null || users.size()==0 )
            return null;
        //--通过用户id查询所有权限id
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(users.get(0).getUserId());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles == null || userRoles.size() == 0)
            return null;
        //-- 通过权限id在权限表里面查询权限
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andRoleIdEqualTo(userRoles.get(0).getRoleId());
        List<Role> roleList = roleMapper.selectByExample(roleExample);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        for (Role role:roleList){
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleName());
            grantedAuthorities.add(grantedAuthority);
        }
        return grantedAuthorities;
    }

    public UserDetails createUserDetail(String username,String password,List<GrantedAuthority> combinedAuthorities){
        return new MyUserDetails(username,password,combinedAuthorities);
    }

    public boolean isEnableGroups() {
        return enableGroups;
    }

    public void setEnableGroups(boolean enableGroups) {
        this.enableGroups = enableGroups;
    }

    public String getRolePrefix() {
        return rolePrefix;
    }

    public void setRolePrefix(String rolePrefix) {
        this.rolePrefix = rolePrefix;
    }

    public void setUsernameBasedPrimaryKey(boolean usernameBasedPrimaryKey) {
        this.usernameBasedPrimaryKey = usernameBasedPrimaryKey;
    }

    protected boolean isUsernameBasedPrimaryKey() {
        return this.usernameBasedPrimaryKey;
    }
}
