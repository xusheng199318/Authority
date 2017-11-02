package com.xusheng.realm;

import com.xusheng.dao.CsUserMapper;
import com.xusheng.model.CsUser;
import com.xusheng.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * Created by xusheng on 2017/10/31.
 */
public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private CsUserMapper userMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        CsUser user = userMapper.getUserByUsername(token.getUsername());

        if (user == null) {
            return null;
        }

        AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());

        return info;
    }
}
