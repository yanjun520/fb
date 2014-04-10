package com.fb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fb.dao.SubjectDAO;
import com.fb.po.Subject;
import com.fb.po.User;
import com.fb.service.SubjectService;

/**
 * @author LGJ
 *
 * @date 2014年4月10日
 * @desc 科目服务实现类
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    
    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    public List<Subject> getAllClazzSubjects(User user, long clazzId) {
        List<Subject> subjectList = subjectDAO.getAllClazzSubjects(clazzId);
        return subjectList;
    }

    @Override
    public Subject getSubjectBySubjectId(User user, long subjectId) {
        Subject subject = subjectDAO.getSubjectBySubjectId(subjectId);
        return subject;
    }

    @Override
    public void addSubject(User user, Subject subject) {
        // TODO Auto-generated method stub
        
    }

}
