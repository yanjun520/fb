package com.fb.po;

/**
 * @author LGJ
 * 
 * @date 2014年4月8日
 * @desc 用户、学校关系model
 */
public class UserSchoolRelation {

    /**
     * 自增id
     */
    private long id;

    /**
     * 用户id
     */
    private long userId;

    /**
     * 学校id
     */
    private long schoolId;

    /**
     * 用户权限，1超管，2普通管理员
     */
    private int userAuth;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    public int getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(int userAuth) {
        this.userAuth = userAuth;
    }

}
