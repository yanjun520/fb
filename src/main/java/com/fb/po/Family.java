package com.fb.po;


/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 学生家庭model
 */
public class Family {

    /**
     * 自增id
     */
    private long id;

    /**
     * 学生id
     */
    private long studentId;

    /**
     * 班级id
     */
    private long clazzId;

    /**
     * 家长id
     */
    private long parentId;

    /**
     * 创建时间
     */
    private int createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getClazzId() {
        return clazzId;
    }

    public void setClazzId(long clazzId) {
        this.clazzId = clazzId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }
    
}
