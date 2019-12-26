package com.shiki.zongyue.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/11
 **/
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        String pattern = s.length() == 10 ? "yyyy-MM-dd" : "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            return format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
