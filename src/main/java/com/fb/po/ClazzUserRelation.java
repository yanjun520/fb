package com.fb.po;

/**
 * @author LGJ
 * 
 * @date 2014年3月30日
 * @desc 班级、用户关系model
 */
public class ClazzUserRelation {

    private long relationId;
    
    private long clazzId;
    
    private long userId;
    
    private int identity;

    
    public long getRelationId() {
        return relationId;
    }

    
    public void setRelationId(long relationId) {
        this.relationId = relationId;
    }

    
    public long getClazzId() {
        return clazzId;
    }

    
    public void setClazzId(long clazzId) {
        this.clazzId = clazzId;
    }

    
    public long getUserId() {
        return userId;
    }

    
    public void setUserId(long userId) {
        this.userId = userId;
    }

    
    public int getIdentity() {
        return identity;
    }

    
    public void setIdentity(int identity) {
        this.identity = identity;
    }
    
}
