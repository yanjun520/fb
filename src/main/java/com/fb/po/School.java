package com.fb.po;


/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 学校model
 */
public class School {

    private long schoolId;
    
    private String schoolName;
    
    private long adminId;
    
    private long provinceId;

    
    public long getSchoolId() {
        return schoolId;
    }

    
    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    
    public String getSchoolName() {
        return schoolName;
    }

    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    
    public long getAdminId() {
        return adminId;
    }

    
    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    
    public long getProvinceId() {
        return provinceId;
    }

    
    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }
    
}
