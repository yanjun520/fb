package com.fb.po;

/**
 * @author LGJ
 * 
 * @date 2014年3月30日
 * @desc 班级model
 */
public class Clazz {

    /**
     * 班级id
     */
    private long clazzId;

    /**
     * 班级名称
     */
    private String clazzName;

    /**
     * 学校id
     */
    private long schoolId;

    /**
     * 班级描述
     */
    private String description;

    /**
     * 班级的年级类别，1：初中，2：高中
     */
    private int gradeType;

    /**
     * 班级是哪届的，即哪年入学
     */
    private int gradeYear;

    /**
     * 删除标记字段，0表示有效，1表示删除
     */
    private int isDeleted;

    /**
     * 创建时间
     */
    private int createTime;

    /**
     * 最近更新时间
     */
    private int updateTime;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

}
