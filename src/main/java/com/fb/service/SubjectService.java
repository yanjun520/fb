package com.fb.service;

import java.util.List;

import com.fb.po.Subject;
import com.fb.po.User;


/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 科目的service
 */
public interface SubjectService {

    /**
     * 获取班级下的所有科目
     */
    public List<Subject> getAllClazzSubjects(User user, long clazzId);
    
    /**
     * 根据科目id获取科目
     */
    public Subject getSubjectBySubjectId(User user, long subjectId);
    
    /**
     * 新增一个科目
     */
    public void addSubject(User user, Subject subject);
    
}
