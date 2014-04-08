package com.fb.po;

/**
 * @author LGJ
 * 
 * @date 2014年3月30日
 * @desc 学校model
 */
public class School {

    /**
     * 学校id
     */
    private long schoolId;

    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 学校所在省id
     */
    private int provinceId;

    /**
     * 学校所在城市id
     */
    private int cityId;

    /**
     * 学校描述
     */
    private String description;

    /**
     * 班级每年自动升级的时间，4位，如901(9月1日),1002(10月2日)
     */
    private int upgradeTime;

    /**
     * 是否开启班级每年自动升级功能
     */
    private int isAutoUpgrade;

    /**
     * 创建时间
     */
    private int createTime;

    /**
     * 最近更新时间
     */
    private int updateTime;

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

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(int upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    public int getIsAutoUpgrade() {
        return isAutoUpgrade;
    }

    public void setIsAutoUpgrade(int isAutoUpgrade) {
        this.isAutoUpgrade = isAutoUpgrade;
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
