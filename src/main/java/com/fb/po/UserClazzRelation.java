package com.fb.po;

/**
 * @author LGJ
 * 
 * @date 2014年3月30日
 * @desc 用户、班级关系model
 */
public class UserClazzRelation {

    /**
     * 自增id，
     */
    private long id;

    /**
     * 用户id
     */
    private long userId;

    /**
     * 班级id
     */
    private long clazzId;

    /**
     * 用户类别，1学生，2老师
     */
    private int userType;

    /**
     * db扩展字段，用来标识用户在班级的一些权限，如某科的任课老师，代课老师，课代表等
     */
    // TODO 之后该类会另增一个属性用来存解析该字段后的结果 
    private String userAuthExtended;

    /**
     * 用户在班级中的昵称
     */
    private String userNickName;

    /**
     * 创建时间
     */
    private int createTime;

    /**
     * 最近更新时间
     */
    private int updateTime;

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

    public long getClazzId() {
        return clazzId;
    }

    public void setClazzId(long clazzId) {
        this.clazzId = clazzId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserAuthExtended() {
        return userAuthExtended;
    }

    public void setUserAuthExtended(String userAuthExtended) {
        this.userAuthExtended = userAuthExtended;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
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
