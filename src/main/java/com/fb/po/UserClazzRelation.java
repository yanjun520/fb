package com.fb.po;


/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 用户、班级关系model
 */
public class UserClazzRelation {

    private long relationId;
    
    private long userId;
    
    private long clazzId;
    
    private int identity;

    
    public long getRelationId() {
        return relationId;
    }

    
    public void setRelationId(long relationId) {
        this.relationId = relationId;
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

    
    public int getIdentity() {
        return identity;
    }

    
    public void setIdentity(int identity) {
        this.identity = identity;
    }
    
    
    
}
