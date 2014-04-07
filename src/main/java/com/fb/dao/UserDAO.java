package com.fb.dao;

import com.fb.po.User;


public interface UserDAO {

    User getUserById(long userId);
    
    User getUserByName(String userName);
    
    void saveUser(User user);
    
}
