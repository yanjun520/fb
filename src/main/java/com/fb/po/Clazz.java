package com.fb.po;


/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 班级model
 */
public class Clazz {

    private long clazzId;
    
    private String clazzName;
    
    private long schoolId;
    
    private int entranceYear;

    
    public long getClazzId() {
        return clazzId;
    }

    
    public void setClazzId(long clazzId) {
        this.clazzId = clazzId;
    }

    
    public String getClazzName() {
        return clazzName;
    }

    
    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    
    public long getSchoolId() {
        return schoolId;
    }

    
    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    
    public int getEntranceYear() {
        return entranceYear;
    }

    
    public void setEntranceYear(int entranceYear) {
        this.entranceYear = entranceYear;
    }
    
    
    
}
