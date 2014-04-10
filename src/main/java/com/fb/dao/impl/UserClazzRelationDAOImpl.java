package com.fb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.fb.dao.UserClazzRelationDAO;
import com.fb.po.UserClazzRelation;

@Service
public class UserClazzRelationDAOImpl implements UserClazzRelationDAO {
    
    @Resource
    private SqlSessionTemplate sqlSession;

    @Override
    public List<UserClazzRelation> getAllClazzMembers(long clazzId) {
        try {
            List<UserClazzRelation> result = sqlSession.selectList("UserClazzRelationSQL.getAllClazzMembers_sql", clazzId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UserClazzRelation> getClazzMembersByClazzIdAndUserType(UserClazzRelation userClazzRelation) {
        try {
            List<UserClazzRelation> result = sqlSession.selectList("UserClazzRelationSQL.getClazzMembersByClazzIdAndUserType_sql", userClazzRelation);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UserClazzRelation> getUserAllClazzes(long userId) {
        try {
            List<UserClazzRelation> result = sqlSession.selectList("UserClazzRelationSQL.getUserAllClazzes_sql", userId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addUserClazzRelation(UserClazzRelation userClazzRelation) {
        try {
            sqlSession.insert("UserClazzRelationSQL.addUserClazzRelation_sql", userClazzRelation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
