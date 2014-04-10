package com.fb.po.enums;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * @author LGJ
 *
 * @date 2014年3月30日
 * @desc 用户身份枚举
 */
public enum UserIdentityEnum {

    STUDENT(1),
    PARENT(2),
    TEACHER(3);
    
    private static final Map<Integer, UserIdentityEnum> intValueMap = Maps.newHashMap();
    static {
        for (UserIdentityEnum enumValue : UserIdentityEnum.values()) {
            intValueMap.put(enumValue.getIntValue(), enumValue);
        }
    }
    
    private int intValue;
    
    private UserIdentityEnum(int intValue) {
        this.intValue = intValue;
    }
    
    public int getIntValue() {
        return intValue;
    }
    
    public static UserIdentityEnum getEnumValue(int intValue) {
        return intValueMap.get(intValue);
    }
    
}