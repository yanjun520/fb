/**
 *  Copyright (c)  2011-2020 Panguso, Inc.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of Panguso, 
 *  Inc. ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into with Panguso.
 */
package com.fb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.fb.dao.UserDAO;
import com.fb.po.User;

@Service
public class UserDAOImpl implements UserDAO {

	@Resource
	private SqlSessionTemplate sqlSession;

	@Override
	public User getUserByUserId(long userId) {
		try {
		    User result = sqlSession.selectOne("UserSQL.getUserByUserId_sql", userId);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
    public User getUserByUserName(String userName) {
        try {
            User result = sqlSession.selectOne("UserSQL.getUserByUserName_sql", userName);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	@Override
    public void addUser(User user) {
        try {
            sqlSession.insert("UserSQL.addUser_sql", user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getUserListByUserIds(List<Long> userIds) {
        try {
            List<User> result = sqlSession.selectList("UserSQL.getUserListByUserIds_sql", userIds);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
