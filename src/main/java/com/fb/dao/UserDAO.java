package com.fb.dao;

import com.fb.po.User;


/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 用户dao
 */
public interface UserDAO {

    User getUserByUserId(long userId);
    
    User getUserByUserName(String userName);
    
    void addUser(User user);
    
}
