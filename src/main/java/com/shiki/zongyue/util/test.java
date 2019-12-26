package com.shiki.zongyue.util;

import com.shiki.zongyue.EnumForState.FictionState;
import com.shiki.zongyue.pojo.Fiction;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class test {
    public static void imageSetter() {

    }
    public static void main(String[] args) throws IOException {
        Map<String, FictionState> stateMap = FictionStateMap.getStateMap();
        System.out.println(stateMap.get("new"));
//        Date date = "1997-09-24";
        /*@Select("select min(chapter_id) from chapter where fiction_id= #{fid} and chapter_id> #{cid} and chapter_state=1")
        Integer getNextChapterID(@Param("fid") int fiction_id, @Param("cid") int chapter_id);

        @Select("select max(chapter_id) from chapter where fiction_id= #{fid} and chapter_id< #{cid} and chapter_state=1")
        Integer getPreviousChapterID(@Param("fid") int fiction_id, @Param("cid") int chapter_id);

        @Select("select chapter_id from bookshelf where fiction_id= #{fid} and user_id= #{uid}")
        Integer getStartChapterID(@Param("fid") int fiction_id, @Param("uid") Integer user_id);

        @Select("select * from fiction where fiction_state = 1 or fiction_state = 2 order by fiction_recommend desc limit 10")
        List<Fiction> topTenFictions();*/
//        System.out.println(MyStringUtil.trimEnd("asdasdad         "));
/*C:\Users\liuyangyang\Desktop\zongyue\target\zongyue\img\fictionImage*/
        /*C:\Users\liuyangyang\Desktop\zongyue\target\zongyue\img\fictionImage*/
        /*C:\Users\liuyangyang\Desktop\zongyue*/
//        File file = new File("");
//        String s = file.getCanonicalPath()+"\\target\\zongyue\\img\\fictionImage";
//        System.out.println(s);


    }
}
