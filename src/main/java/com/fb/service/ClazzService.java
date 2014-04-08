package com.fb.service;

import java.util.List;

import com.fb.po.Clazz;
import com.fb.po.Subject;
import com.fb.po.User;


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
    public List<Clazz> getClazzesBySchoolId(User user, int schoolId);
    
    /**
     * 获取班级信息
     */
    public Clazz getClazzByClazzId(User user, int clazzId);
    
    /**
     * 获取班级所有成员
     */
    public List<User> getClazzMembers(User user, int clazzId);
    
    /**
     * 获取班级的所有学生
     */
    public List<User> getClazzStudents(User user, int clazzId);
    
    /**
     * 获取班级的所有科目
     */
    public List<Subject> getClazzSubjects(User user, int clazzId);
    
    
}
