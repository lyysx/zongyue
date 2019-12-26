package com.shiki.zongyue.mapper;

import com.shiki.zongyue.pojo.Chapter;
import com.shiki.zongyue.pojo.ChapterExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChapterMapper {
    int deleteByPrimaryKey(Integer chapter_id);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    List<Chapter> selectByExampleWithBLOBs(ChapterExample example);

    List<Chapter> selectByExample(ChapterExample example);

    Chapter selectByPrimaryKey(Integer chapter_id);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKeyWithBLOBs(Chapter record);

    int updateByPrimaryKey(Chapter record);

    @Select("select min(chapter_id) from chapter where fiction_id= #{fid} and chapter_id> #{cid} and chapter_state=1")
    Integer getNextChapterID(@Param("fid") int fiction_id, @Param("cid") int chapter_id);

    @Select("select max(chapter_id) from chapter where fiction_id= #{fid} and chapter_id< #{cid} and chapter_state=1")
    Integer getPreviousChapterID(@Param("fid") int fiction_id, @Param("cid") int chapter_id);

    @Select("select chapter_id from bookshelf where fiction_id= #{fid} and user_id= #{uid}")
    Integer getStartChapterID(@Param("fid") int fiction_id, @Param("uid") Integer user_id);
}