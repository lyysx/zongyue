package com.shiki.zongyue.mapper;

import com.shiki.zongyue.pojo.Promotion;
import com.shiki.zongyue.pojo.PromotionExample;
import java.util.List;

public interface PromotionMapper {
    int deleteByPrimaryKey(Integer promotion_id);

    int insert(Promotion record);

    int insertSelective(Promotion record);

    List<Promotion> selectByExample(PromotionExample example);

    Promotion selectByPrimaryKey(Integer promotion_id);

    int updateByPrimaryKeySelective(Promotion record);

    int updateByPrimaryKey(Promotion record);
}