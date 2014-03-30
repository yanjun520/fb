package com.fb.po.enums;

import java.util.Map;

import com.google.common.collect.Maps;


public enum SubjectEnum {

    YUWEN(1, "语文"),
    SHUXUE(2, "数学"),
    YINGYU(3, "英语");
    
    private static final Map<Integer, SubjectEnum> intValueMap = Maps.newHashMap();
    private static final Map<String, SubjectEnum> strValueMap = Maps.newHashMap();
    static {
        for (SubjectEnum enumValue : SubjectEnum.values()) {
            intValueMap.put(enumValue.getIntValue(), enumValue);
            strValueMap.put(enumValue.getStrValue(), enumValue);
        }
    }
    
    private int intValue;
    private String strValue;
    
    private SubjectEnum(int intValue, String strValue) {
        this.intValue = intValue;
        this.strValue = strValue;
    }
    
    public int getIntValue() {
        return intValue;
    }
    
    public String getStrValue() {
        return strValue;
    }
    
    public static SubjectEnum getEnumValue(int intValue) {
        return intValueMap.get(intValue);
    }
    
    public static SubjectEnum getEnumValue(String strValue) {
        return strValueMap.get(strValue);
    }
    
}
