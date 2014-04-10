package com.fb.dao;

import java.util.List;

import com.fb.po.User;


/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 用户dao
 */
public interface UserDAO {

    User getUserByUserId(long userId);
    
    List<User> getUserListByUserIds(List<Long> userIds);
    
    User getUserByUserName(String userName);
    
    void addUser(User user);
    
}
