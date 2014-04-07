package com.fb.po;

/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 用户model
 */
public class User {

    private long userId;
    
    private String userName;
    
    private String password;
    
//    private int userType;
//    
//    private String realName;
//    
//    private int phone;
//    
//    private String email;
//    
//    private int registTime;
//    
//    private int lastLoginTime;

    
    public long getUserId() {
        return userId;
    }

    
    public void setUserId(long userId) {
        this.userId = userId;
    }

    
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

}
