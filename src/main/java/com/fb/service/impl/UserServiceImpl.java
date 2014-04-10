package com.fb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fb.dao.UserDAO;
import com.fb.po.User;
import com.fb.service.UserService;

/**
 * @author LGJ
 *
 * @date 2014年4月10日
 * @desc 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    
    @Override
    public User getUserByUserName(String userName) {
        User user = userDAO.getUserByUserName(userName);
        return user;
    }

    @Override
    public User getUserByUserId(long userId) {
        User user = userDAO.getUserByUserId(userId);
        return user;
    }
    
    @Override
    public List<User> getUserListByUserIds(List<Long> userIds) {
        List<User> userList = userDAO.getUserListByUserIds(userIds);
        return userList;
    }

}
