package com.fb.utils;

import java.security.MessageDigest;

/**
 * @author LGJ
 * 
 * @date 2014年3月30日
 * @desc md5工具类
 */
public class Md5Util {
    
    public static String getMd5(String str) {
        String md5Ret = null;

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5Ret = byteArrayToHex(md5.digest(str.getBytes("utf-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return md5Ret;
    }

    public static String byteArrayToHex(byte[] byteArray) {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char[] resultCharArray = new char[byteArray.length * 2];
        int index = 0;
        for (byte b : byteArray) {
            resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        
        return new String(resultCharArray);
    }

    public static void main(String[] args) {
        String md5Ret = Md5Util.getMd5("testmd5");
        System.out.println(md5Ret);
    }

}
