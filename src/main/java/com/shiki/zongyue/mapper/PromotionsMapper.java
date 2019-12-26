package com.shiki.zongyue.mapper;

import com.shiki.zongyue.pojo.Promotions;
import com.shiki.zongyue.pojo.PromotionsExample;
import java.util.List;

public interface PromotionsMapper {
    int deleteByPrimaryKey(Integer promotions_id);

    int insert(Promotions record);

    int insertSelective(Promotions record);

    List<Promotions> selectByExample(PromotionsExample example);

    Promotions selectByPrimaryKey(Integer promotions_id);

    int updateByPrimaryKeySelective(Promotions record);

    int updateByPrimaryKey(Promotions record);
}