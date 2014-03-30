package com.fb.po;


/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 家庭model，学生、家长一对多的关系
 */
public class Family {

    private long familyId;
    
    private long studentId;
    
    private long[] parentId;
    
    private long familyName;

    
    public long getFamilyId() {
        return familyId;
    }

    
    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    
    public long getStudentId() {
        return studentId;
    }

    
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    
    public long[] getParentId() {
        return parentId;
    }

    
    public void setParentId(long[] parentId) {
        this.parentId = parentId;
    }

    
    public long getFamilyName() {
        return familyName;
    }

    
    public void setFamilyName(long familyName) {
        this.familyName = familyName;
    }
    
    
    
}
