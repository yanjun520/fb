package com.fb.service;

import com.fb.po.School;
import com.fb.po.User;


/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 学校的service
 */
public interface SchoolService {

    /**
     * 返回学校信息
     */
    public School getSchoolBySchoolId(User user, int schoolId);
    
    /**
     * 新增学校
     */
    public void addSchool(User user, School school);
    
}
