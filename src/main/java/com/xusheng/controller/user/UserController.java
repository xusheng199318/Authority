package com.xusheng.controller.user;

import com.xusheng.model.CsUser;
import com.xusheng.service.UserService;
import com.xusheng.util.MD5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by xusheng on 2017/10/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(CsUser csUser, HttpSession session, HttpServletResponse response) {

        Subject subject = SecurityUtils.getSubject();
        String md5Pwd = MD5Util.encoderByMd5(csUser.getPassword());
        UsernamePasswordToken token = new UsernamePasswordToken(csUser.getUsername(), md5Pwd);

        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            try {
                response.sendRedirect("../login.jsp");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

        CsUser user = (CsUser) subject.getPrincipal();
        session.setAttribute("loginUser", user);
        return "main";
    }
}
