package com.fb.po;

/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 用户model
 */
public class User {

    /**
     * 用户id
     */
    private long userId;
    
    /**
     * 用户名称，即登陆名
     */
    private String userName;
    
    /**
     * 用户密码，存的是md5后的结果
     */
    private String password;
    
    /**
     * 昵称
     */
    private String nickName;
    
    /**
     * 电话号码
     */
    private int phone;
    
    /**
     * 邮箱
     */
    private String email;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 创建时间
     */
    private int createTime;
    
    /**
     * 最近更新时间
     */
    private int updateTime;
    
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
    
    public String getNickName() {
        return nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public int getPhone() {
        return phone;
    }
    
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }
    
    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

}
