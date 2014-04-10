package com.fb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fb.po.Clazz;
import com.fb.po.User;
import com.fb.po.enums.UserIdentityEnum;
import com.fb.service.ClazzService;
import com.fb.service.LoginService;
import com.google.gson.Gson;

/**
 * @author LGJ
 *
 * @date 2014年4月10日
 * @desc 班级Controller
 */
@Controller
@RequestMapping("/clazz")
public class ClazzController {
    
    @Autowired
    private LoginService loginService;
    @Autowired
    private ClazzService clazzService;

    @RequestMapping("/addclazz")
    @ResponseBody
    public String addClazz(Model model,
            @RequestParam("clazzname") String clazzName,
            @RequestParam("description") String description) {
        User user = loginService.checkLogin();
        Clazz clazz = new Clazz();
        clazz.setClazzName(clazzName);
        clazz.setDescription(description);
        clazzService.addClazz(user, clazz);
        return "add class success.";
    }
    
    @RequestMapping("/getclazz")
    @ResponseBody
    public String getClazz(Model model,
            @RequestParam("clazzid") long clazzId) {
        User user = loginService.checkLogin();
        Clazz clazz = clazzService.getClazzByClazzId(user, clazzId);
        Gson gson = new Gson();
        return "class: " + gson.toJson(clazz);
    }
    
    @RequestMapping("/getallclazzmembers")
    @ResponseBody
    public String getAllClazzMembers(Model model,
            @RequestParam("clazzid") long clazzId) {
        User user = loginService.checkLogin();
        List<User> memberList = clazzService.getAllClazzMembers(user, clazzId);
        Gson gson = new Gson();
        return "members: " + gson.toJson(memberList);
    }
    
    @RequestMapping("/getallclazzes")
    @ResponseBody
    public String getAllClazzes(Model model,
            @RequestParam("userid") long userId) {
        User user = loginService.checkLogin();
        List<Clazz> clazzList = clazzService.getUserAllClazzes(user, userId);
        Gson gson = new Gson();
        return "classes: " + gson.toJson(clazzList);
    }
    
    @RequestMapping("/addclazzmember")
    @ResponseBody
    public String addClazzMember(Model model,
            @RequestParam("userid") long userId,
            @RequestParam("clazzid") long clazzId,
            @RequestParam("useridentity") int userIdentity) {
        User user = loginService.checkLogin();
        clazzService.addClazzMember(user, userId, clazzId, UserIdentityEnum.getEnumValue(userIdentity));
        return "add class member success";
    }

}
