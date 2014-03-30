package com.fb.po.enums;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 省份枚举
 */
public enum ProvinceEnum {

    BEIJING(1, "北京"),
    SHANGHAI(2, "上海"),
    SHENZHEN(3, "深圳"),
    GUANGZHOU(4, "广州"),
    HAERBIN(5, "哈尔滨");
    
    private static final Map<Integer, ProvinceEnum> intValueMap = Maps.newHashMap();
    private static final Map<String, ProvinceEnum> strValueMap = Maps.newHashMap();
    static {
        for (ProvinceEnum enumValue : ProvinceEnum.values()) {
            intValueMap.put(enumValue.getIntValue(), enumValue);
            strValueMap.put(enumValue.getStrValue(), enumValue);
        }
    }
    
    private int intValue;
    private String strValue;
    
    private ProvinceEnum(int intValue, String strValue) {
        this.intValue = intValue;
        this.strValue = strValue;
    }
    
    public int getIntValue() {
        return intValue;
    }
    
    public String getStrValue() {
        return strValue;
    }
    
    public static ProvinceEnum getEnumValue(int intValue) {
        return intValueMap.get(intValue);
    }
    
    public static ProvinceEnum getEnumValue(String strValue) {
        return strValueMap.get(strValue);
    }
    
}
