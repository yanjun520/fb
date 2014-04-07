package com.fb.service;

import com.fb.po.User;

public interface UserService {
    
    public User getUserByName(String userName);
    
    public User getUserById(long uesrId);
    
}
