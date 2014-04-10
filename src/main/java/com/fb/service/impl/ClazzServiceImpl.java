package com.fb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fb.dao.ClazzDAO;
import com.fb.dao.UserClazzRelationDAO;
import com.fb.dao.UserDAO;
import com.fb.po.Clazz;
import com.fb.po.User;
import com.fb.po.UserClazzRelation;
import com.fb.po.enums.UserIdentityEnum;
import com.fb.service.ClazzService;
import com.google.common.collect.Lists;

/**
 * @author LGJ
 *
 * @date 2014年4月10日
 * @desc 班级服务实现类
 */
@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzDAO clazzDAO;
    @Autowired
    private UserClazzRelationDAO userClazzRelationDAO;
    @Autowired
    private UserDAO userDAO;
    
    @Override
    public Clazz getClazzByClazzId(User user, long clazzId) {
        Clazz clazz = clazzDAO.getClazzByClazzId(clazzId);
        return clazz;
    }

    @Override
    public List<User> getAllClazzMembers(User user, long clazzId) {
        List<UserClazzRelation> memberList = userClazzRelationDAO.getAllClazzMembers(clazzId);
        List<Long> userIds = Lists.newArrayList();
        if (memberList != null && memberList.size() > 0) {
            for (UserClazzRelation userClazzRelation : memberList) {
                userIds.add(userClazzRelation.getUserId());
            }
        }
        List<User> userList = userDAO.getUserListByUserIds(userIds);
        
        return userList;
    }

    @Override
    public List<User> getAllClazzMembersWithParents(User user, long clazzId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Clazz> getUserAllClazzes(User user, long userId) {
        List<UserClazzRelation> tmpClazzList = userClazzRelationDAO.getUserAllClazzes(userId);
        List<Long> clazzIds = Lists.newArrayList();
        if (tmpClazzList != null && tmpClazzList.size() > 0) {
            for (UserClazzRelation userClazzRelation : tmpClazzList) {
                clazzIds.add(userClazzRelation.getClazzId());
            }
        }
        List<Clazz> clazzList = clazzDAO.getClazzListByClazzIds(clazzIds);
        
        return clazzList;
    }

    @Override
    public void addClazz(User user, Clazz clazz) {
        clazzDAO.addClazz(clazz);
    }

    @Override
    public void addClazzMember(User user, long userId, long clazzId, UserIdentityEnum userIdentity) {
        UserClazzRelation userClazzRelation = new UserClazzRelation();
        userClazzRelation.setUserId(userId);
        userClazzRelation.setClazzId(clazzId);
        userClazzRelation.setUserType(userIdentity.getIntValue());
        userClazzRelationDAO.addUserClazzRelation(userClazzRelation);
    }

}
