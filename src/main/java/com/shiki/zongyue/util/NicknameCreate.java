package com.shiki.zongyue.util;

import java.util.UUID;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/7
 **/
public class NicknameCreate {
    private static final String prefix = "书客";
    public static String nickname() {
        int machineID = 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {
            hashCodeV = -hashCodeV;
        }
        return prefix + machineID + String.format("%011d", hashCodeV);
    }
}
