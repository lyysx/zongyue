package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.mapper.PromotionMapper;
import com.shiki.zongyue.pojo.Promotion;
import com.shiki.zongyue.pojo.PromotionExample;
import com.shiki.zongyue.pojo.PromotionsExample;
import com.shiki.zongyue.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/12
 **/

@Service
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    private PromotionMapper promotionMapper;

    @Override
    public void add(Promotion promotion) {
        promotionMapper.insertSelective(promotion);
    }

    @Override
    public List<Promotion> list(int promotions_id) {
        PromotionExample promotionExample = new PromotionExample();
        promotionExample.createCriteria().andPromotions_idEqualTo(promotions_id);
        promotionExample.setOrderByClause("promotion_id asc");
        List<Promotion> promotionList = promotionMapper.selectByExample(promotionExample);
        return promotionList;
    }

    @Override
    public Promotion get(int promotions_id) {
        return promotionMapper.selectByPrimaryKey(promotions_id);
    }

    @Override
    public void update(Promotion promotion) {
        promotionMapper.updateByPrimaryKeySelective(promotion);
    }
}
