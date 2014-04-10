package com.fb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.fb.dao.FamilyDAO;
import com.fb.po.Family;

@Service
public class FamilyDAOImpl implements FamilyDAO {

    @Resource
    private SqlSessionTemplate sqlSession;
    
    @Override
    public Family getFamilyByUserIdAndClazzId(Family family) {
        try {
            Family result = sqlSession.selectOne("FamilySQL.getFamilyByUserIdAndClazzId_sql", family);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Family> getFamiliesByClazzId(long clazzId) {
        try {
            List<Family> result = sqlSession.selectList("FamilySQL.getFamiliesByClazzId_sql", clazzId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addFamily(Family family) {
        try {
            sqlSession.insert("FamilySQL.addFamily_sql", family);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
