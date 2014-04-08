package com.fb.po;

/**
 * @author LGJ
 * 
 * @date 2014年3月30日
 * @desc 科目model
 */
public class Subject {

    /**
     * 科目id
     */
    private long subjectId;

    /**
     * 科目名称
     */
    private String subjectName;

    /**
     * 科目描述
     */
    private String description;

    /**
     * 创建时间
     */
    private int createTime;

    /**
     * 最近更新时间
     */
    private int updateTime;

    /**
     * 科目所属班级id
     */
    private long clazzId;

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getClazzId() {
        return clazzId;
    }

    public void setClazzId(long clazzId) {
        this.clazzId = clazzId;
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
