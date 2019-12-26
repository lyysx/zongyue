package com.shiki.zongyue.mapper;

import com.shiki.zongyue.pojo.Author;
import com.shiki.zongyue.pojo.AuthorExample;
import java.util.List;

public interface AuthorMapper {
    int deleteByPrimaryKey(Integer author_id);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorExample example);

    Author selectByPrimaryKey(Integer author_id);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}