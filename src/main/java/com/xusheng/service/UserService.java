package com.xusheng.service;

import com.xusheng.model.CsUser;

/**
 * Created by xusheng on 2017/11/2.
 */
public interface UserService {
    CsUser getUserByUsername(String username);
}
