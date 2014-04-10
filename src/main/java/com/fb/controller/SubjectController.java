package com.fb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fb.po.Subject;
import com.fb.po.User;
import com.fb.service.LoginService;
import com.fb.service.SubjectService;
import com.google.gson.Gson;

/**
 * @author LGJ
 *
 * @date 2014年4月10日
 * @desc 科目Controller
 */
@Controller
@RequestMapping("/subject")
public class SubjectController {
    
    @Autowired
    private LoginService loginService;
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/getallclazzsubjects")
    @ResponseBody
    public String getAllClassSubjects(Model model,
            @RequestParam("clazzid") long clazzId) {
        User user = loginService.checkLogin();
        List<Subject> subjectList = subjectService.getAllClazzSubjects(user, clazzId);
        Gson gson = new Gson();
        return "subjects: " + gson.toJson(subjectList);
    }
    
    @RequestMapping("/getsubject")
    @ResponseBody
    public String getSubject(Model model,
            @RequestParam("subjectid") long subjectId) {
        User user = loginService.checkLogin();
        Subject subject = subjectService.getSubjectBySubjectId(user, subjectId);
        Gson gson = new Gson();
        return "subject: " + gson.toJson(subject);
    }

}
