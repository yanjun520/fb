package com.fb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fb.dao.UserDAO;
import com.fb.po.User;
import com.fb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    
    @Override
    public User getUserByName(String userName) {
        User user = userDAO.getUserByName(userName);
        return user;
    }

    @Override
    public User getUserById(long id) {
        User user = userDAO.getUserById(id);
        return user;
    }

}
