package com.fb.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fb.po.Query;
import com.fb.po.User;
import com.fb.service.LoginService;
import com.fb.service.QueryService;

@Controller
public class IndexController {
    
    @Resource
    private QueryService queryService;
    @Autowired
    private LoginService loginService;
    
	@RequestMapping()
	@ResponseBody
    public String index(Model model) {
        return "Welcome";
    }
	
	@RequestMapping("/hello")
    @ResponseBody
    public String hello(Model model,
            HttpServletRequest request,
            HttpServletResponse response) {
	    
	    User user = loginService.checkLogin();
	    
	    if (user == null) {
	        return "Please login.";
	    } else {
	        return "Hello " + user.getUserName();
	    }
    }
	
	@RequestMapping("/query")
    @ResponseBody
    public String query(String input) {
		List<Query> queryList = queryService.getQueryList(input);
        return "result is : " + queryList.toString();
    }
}
