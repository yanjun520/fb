package com.fb.utils;


/**
 * @author LGJ
 *
 * @date 2014年4月8日
 * @desc 登陆验证工具类
 */
public class LoginUtil {

    /**
     * 解码loginFlag
     * 
     * @return
     * string[0] 用户名
     * string[1] 用户密码
     */
    // TODO 解密算法待完善
    public static String[] decodeLoginFlag(String loginFlag) {
        String[] loginArr = loginFlag.split("_");
        return loginArr;
    }
    
    /**
     * 编码loginFlag
     */
    // TODO 加密算法待完善
    public static String encodeLoginFlag(String userName, String password) {
        String loginFalg = userName + "_" + password;
        return loginFalg;
    }
    
}
