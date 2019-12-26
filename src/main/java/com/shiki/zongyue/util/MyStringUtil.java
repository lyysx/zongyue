package com.shiki.zongyue.util;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/15
 **/
public class MyStringUtil {

    public static String trimEnd(String string) {
        char[] cs = string.toCharArray();
        int len = cs.length;
        int left = 0;
        while (left < len && cs[len-1] <= ' ') {
            len--;
        }
        return len < string.length() ? new String(cs).substring(left, len): string;
    }
}
