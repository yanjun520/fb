package com.fb.service;

import java.util.List;

import com.fb.po.User;

/**
 * @author LGJ
 *
 * @date 2014年4月10日
 * @desc 用户service
 */
public interface UserService {
    
    /**
     * 按姓名获取用户
     */
    public User getUserByUserName(String userName);
    
    /**
     * 按用户id获取用户
     */
    public User getUserByUserId(long userId);
    
    /**
     * 按用户id列表获取用户
     */
    public List<User> getUserListByUserIds(List<Long> userIds);
    
}
