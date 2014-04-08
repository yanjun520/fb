package com.fb.service;

import com.fb.po.School;


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
    public School getSchoolBySchoolId(int schoolId);
    
}
