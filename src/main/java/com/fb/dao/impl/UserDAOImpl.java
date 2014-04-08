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
	public User getUserById(long userId) {
		try {
		    User result = sqlSession.selectOne("UserSQL.getUserById_sql", userId);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
    public User getUserByName(String userName) {
        try {
            User result = sqlSession.selectOne("UserSQL.getUserByName_sql", userName);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	@Override
    public void saveUser(User user) {
        try {
            int id = sqlSession.insert("UserSQL.saveUser_sql", user);
            System.out.println("@id: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
