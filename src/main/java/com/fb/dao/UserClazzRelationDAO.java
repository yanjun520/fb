package com.fb.dao;

import java.util.List;

import com.fb.po.UserClazzRelation;

/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 用户、班级关系dao
 */
public interface UserClazzRelationDAO {

    public List<UserClazzRelation> getAllClazzMembers(long clazzId);
    
    public List<UserClazzRelation> getClazzMembersByClazzIdAndUserType(UserClazzRelation userClazzRelation);
    
    public List<UserClazzRelation> getUserAllClazzes(long userId);
    
    public void addUserClazzRelation(UserClazzRelation userClazzRelation);
    
}
