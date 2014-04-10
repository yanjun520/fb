package com.fb.dao;

import java.util.List;

import com.fb.po.Clazz;

/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 班级dao
 */
public interface ClazzDAO {

    public Clazz getClazzByClazzId(long clazzId);
    
    public List<Clazz> getClazzListByClazzIds(List<Long> clazzIds);
    
    public void addClazz(Clazz clazz);
    
}
