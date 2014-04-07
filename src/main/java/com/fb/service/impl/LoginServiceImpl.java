package com.fb.service.impl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fb.dao.UserDAO;
import com.fb.po.User;
import com.fb.service.LoginService;


/**
 * @author LGJ
 *
 * @date 2014年4月7日
 * @desc 登陆服务实现类
 */
@Service
public class LoginServiceImpl implements LoginService {
    
    @Autowired
    private UserDAO userDAO;

    @Override
    public User checkLogin() {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("loginflag")) {
                    String loginFalg = c.getValue();
                    String[] loginArr = loginFalg.split("_");
                    User user = userDAO.getUserByName(loginArr[0]);
                    if (user != null && loginArr[1].equals(user.getPassword())) {
                        return user;
                    }
                }
            }
        }
        
        return null;
    }
    
    @Override
    public String login(HttpServletRequest request, HttpServletResponse response, User user) {
        User dbUser = userDAO.getUserByName(user.getUserName());
        
        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
            String loginFalg = dbUser.getUserName() + "_" + dbUser.getPassword();
            Cookie cookie = new Cookie("loginflag", loginFalg);
            cookie.setPath("/");
            cookie.setMaxAge(86400);
            response.addCookie(cookie);
            
            return loginFalg;
        }
        return null;
    }

    @Override
    public String regist(HttpServletRequest request, HttpServletResponse response, User user) {
        userDAO.saveUser(user);
        String loginFalg = user.getUserName() + "_" + user.getPassword();
        Cookie cookie = new Cookie("loginflag", loginFalg);
        cookie.setPath("/");
        cookie.setMaxAge(86400);
        response.addCookie(cookie);
        return loginFalg;
    }

    @Override
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("loginflag", null);
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return null;
    }

}
