package com.fb.dao;

import java.util.List;

import com.fb.po.Subject;


/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 科目dao
 */
public interface SubjectDAO {

    public List<Subject> getAllClazzSubjects(long clazzId);
    
    public Subject getSubjectBySubjectId(long subjectId);
    
    public void addSubject(Subject subject);
    
}
