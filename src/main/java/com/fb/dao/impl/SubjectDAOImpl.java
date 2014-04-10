package com.fb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.fb.dao.SubjectDAO;
import com.fb.po.Subject;

@Service
public class SubjectDAOImpl implements SubjectDAO {

    @Resource
    private SqlSessionTemplate sqlSession;

    @Override
    public List<Subject> getAllClazzSubjects(long clazzId) {
        try {
            List<Subject> result = sqlSession.selectList("SubjectSQL.getAllClazzSubjects_sql", clazzId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Subject getSubjectBySubjectId(long subjectId) {
        try {
            Subject result = sqlSession.selectOne("SubjectSQL.getSubjectBySubjectId_sql", subjectId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addSubject(Subject subject) {
        try {
            sqlSession.insert("SubjectSQL.addSubject_sql", subject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
