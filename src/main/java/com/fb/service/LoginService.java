package com.fb.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fb.po.User;


/**
 * @author LGJ
 *
 * @date 2014年4月7日
 * @desc 登陆服务
 */
public interface LoginService {

    /**
     * 检查登陆，从cookie中读取loginflag属性
     */
    public User checkLogin();
    
    /**
     * 登陆，设置cookie的loginflag字段
     */
    public String login(HttpServletRequest request, HttpServletResponse response, User user);
    
    /**
     * 登出，清除loginflag字段
     */
    public String logout(HttpServletRequest request, HttpServletResponse response);
    
    /**
     * 注册
     */
    public String regist(HttpServletRequest request, HttpServletResponse response, User user);
    
}
