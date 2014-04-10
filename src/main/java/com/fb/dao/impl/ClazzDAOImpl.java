package com.fb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.fb.dao.ClazzDAO;
import com.fb.po.Clazz;

@Service
public class ClazzDAOImpl implements ClazzDAO {
    
    @Resource
    private SqlSessionTemplate sqlSession;
    
    @Override
    public Clazz getClazzByClazzId(long clazzId) {
        try {
            Clazz result = sqlSession.selectOne("ClazzSQL.getClazzByClazzId_sql", clazzId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<Clazz> getClazzListByClazzIds(List<Long> clazzIds) {
        try {
            List<Clazz> result = sqlSession.selectList("ClazzSQL.getClazzListByClazzIds_sql", clazzIds);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addClazz(Clazz clazz) {
        try {
            sqlSession.insert("ClazzSQL.addClazz_sql", clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
