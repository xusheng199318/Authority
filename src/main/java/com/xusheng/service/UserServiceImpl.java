package com.xusheng.service;

import com.xusheng.dao.CsUserMapper;
import com.xusheng.model.CsUser;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xusheng on 2017/11/2.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private CsUserMapper userMapper;

    @Override
    public CsUser getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }
}
