package com.fb.service;

import com.fb.po.User;

public interface UserService {
    
    public User getUserByUserName(String userName);
    
    public User getUserByUserId(long uesrId);
    
}
