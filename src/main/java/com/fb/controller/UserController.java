package com.fb.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fb.po.User;
import com.fb.service.LoginService;
import com.fb.service.UserService;
import com.fb.utils.Md5Util;
import com.google.common.collect.Lists;
import com.google.gson.Gson;

/**
 * @author LGJ
 *
 * @date 2014年4月10日
 * @desc 用户Controller
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @RequestMapping("/info")
    @ResponseBody
    public String info(Model model, @RequestParam("username") String userName) {

        User loginUser = loginService.checkLogin();
        if (loginUser != null) {
            User user = userService.getUserByUserName(userName);
            Gson gson = new Gson();
            gson.toJson(user);
            return gson.toJson(user);
        } else {
            return "please login.";
        }
        
    }
    
    @RequestMapping("/batchget")
    @ResponseBody
    public String batchGet(Model model, @RequestParam("userids") String userIds) {
        User user = loginService.checkLogin();
        String[] userIdArr = userIds.split(",");
        List<Long> userIdList = Lists.newArrayList();
        for (String userIdStr : userIdArr) {
            userIdList.add(Long.parseLong(userIdStr));
        }
        List<User> userList = userService.getUserListByUserIds(userIdList);
        Gson gson = new Gson();
        return gson.toJson(userList);
    }

    /**
     * 用户注册并且登陆
     */
    @RequestMapping("/regist")
    @ResponseBody
    public String regist(Model model, HttpServletRequest request, HttpServletResponse response,
            @RequestParam("username") String userName, @RequestParam("password") String password) {
        User user = new User();
        user.setPassword(Md5Util.getMd5(String.valueOf(password)));
        user.setUserName(userName);
        loginService.regist(request, response, user);

        return "regist success.";
    }

    /**
     * 用户登陆
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(Model model, HttpServletRequest request, HttpServletResponse response,
            @RequestParam("username") String userName, @RequestParam("password") String password) {

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                System.out.println(c.getName());
                System.out.println(c.getValue());
            }
        }

        User user = new User();
        user.setPassword(Md5Util.getMd5(String.valueOf(password)));
        user.setUserName(userName);
        loginService.login(request, response, user);

        return "login success.";
    }

    /**
     * 用户登出
     */
    @RequestMapping("/logout")
    @ResponseBody
    public String logout(Model model, HttpServletRequest request, HttpServletResponse response) {
        loginService.logout(request, response);

        return "logout success.";
    }

}
