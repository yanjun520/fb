package com.fb.dao;

import java.util.List;

import com.fb.po.Family;

/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 家庭dao
 */
public interface FamilyDAO {

    public Family getFamilyByUserIdAndClazzId(Family family);
    
    public List<Family> getFamiliesByClazzId(long clazzId);
    
    public void addFamily(Family family);
    
}
