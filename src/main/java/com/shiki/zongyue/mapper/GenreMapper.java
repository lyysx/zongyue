package com.shiki.zongyue.mapper;

import com.shiki.zongyue.pojo.Genre;
import com.shiki.zongyue.pojo.GenreExample;
import java.util.List;

public interface GenreMapper {
    int deleteByPrimaryKey(Integer genre_id);

    int insert(Genre record);

    int insertSelective(Genre record);

    List<Genre> selectByExample(GenreExample example);

    Genre selectByPrimaryKey(Integer genre_id);

    int updateByPrimaryKeySelective(Genre record);

    int updateByPrimaryKey(Genre record);
}