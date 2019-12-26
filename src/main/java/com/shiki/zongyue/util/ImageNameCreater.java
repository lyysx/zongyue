package com.shiki.zongyue.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;


public class ImageNameCreater {
    public static String imageNameGetter(int author_id) {
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
//         0 代表前面补充0     
//         4 代表长度为4     
//         d 代表参数为正数型
        return machineId + String.format("%015d", hashCodeV);

    }

    public static String encoderByMd5(String string) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定加密方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //加密
        String result = base64Encoder.encode(md5.digest(string.getBytes("utf-8")));
        return result;
    }

}
