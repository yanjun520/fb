package com.fb.service;

import java.util.List;

import com.fb.po.Clazz;
import com.fb.po.User;
import com.fb.po.enums.UserIdentityEnum;


/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 班级的service
 */
public interface ClazzService {

    /**
     * 获取一个学校下的所有班级
     */
//    public List<Clazz> getClazzesBySchoolId(User user, int schoolId);
    
    /**
     * 获取班级信息
     */
    public Clazz getClazzByClazzId(User user, long clazzId);
    
    /**
     * 获取班级所有成员（老师，学生）
     */
    public List<User> getAllClazzMembers(User user, long clazzId);
    
    /**
     * 获取班级所有成员（老师，学生，家长）
     */
    public List<User> getAllClazzMembersWithParents(User user, long clazzId);
    
    /**
     * 获取用户的所有班级
     */
    public List<Clazz> getUserAllClazzes(User user, long userId);
    
    /**
     * 添加班级
     */
    public void addClazz(User user, Clazz clazz);
    
    /**
     * 添加班级成员
     */
    public void addClazzMember(User user, long userId, long clazzId, UserIdentityEnum userType);
    
}
