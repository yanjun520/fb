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
    
    private int userType;
    
    private String displayName;

    
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

    
    public int getUserType() {
        return userType;
    }

    
    public void setUserType(int userType) {
        this.userType = userType;
    }

    
    public String getDisplayName() {
        return displayName;
    }

    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    
    
}
