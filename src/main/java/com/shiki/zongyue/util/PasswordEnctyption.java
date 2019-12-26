package com.shiki.zongyue.util;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/20
 **/
public class PasswordEnctyption {
    private static int time = 2;
    private static String algorithmName = "md5";
    public static Map<String,String> getPassword(String password) {
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        String encodePassword = new SimpleHash(algorithmName, password, salt, time).toString();
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("password", encodePassword);
        resultMap.put("salt", salt);
        return resultMap;
    }
}
