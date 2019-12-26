package com.shiki.zongyue.mapper;

import com.shiki.zongyue.pojo.Bookshelf;
import com.shiki.zongyue.pojo.BookshelfExample;
import com.shiki.zongyue.pojo.BookshelfKey;
import java.util.List;

public interface BookshelfMapper {
    int deleteByPrimaryKey(BookshelfKey key);

    int insert(Bookshelf record);

    int insertSelective(Bookshelf record);

    List<Bookshelf> selectByExample(BookshelfExample example);

    Bookshelf selectByPrimaryKey(BookshelfKey key);

    int updateByPrimaryKeySelective(Bookshelf record);

    int updateByPrimaryKey(Bookshelf record);
}