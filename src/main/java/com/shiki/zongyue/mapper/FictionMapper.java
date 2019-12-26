package com.shiki.zongyue.mapper;

import com.shiki.zongyue.pojo.Fiction;
import com.shiki.zongyue.pojo.FictionExample;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FictionMapper {
    int deleteByPrimaryKey(Integer fiction_id);

    int insert(Fiction record);

    int insertSelective(Fiction record);

    List<Fiction> selectByExample(FictionExample example);

    Fiction selectByPrimaryKey(Integer fiction_id);

    int updateByPrimaryKeySelective(Fiction record);

    int updateByPrimaryKey(Fiction record);

    @Select("select * from fiction where fiction_state = 1 or fiction_state = 2 order by fiction_recommend desc limit 10")
    List<Fiction> topTenFictions();
}