package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.mapper.PromotionMapper;
import com.shiki.zongyue.mapper.PromotionsMapper;
import com.shiki.zongyue.pojo.Promotion;
import com.shiki.zongyue.pojo.Promotions;
import com.shiki.zongyue.pojo.PromotionsExample;
import com.shiki.zongyue.service.PromotionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/10
 **/

@Service
public class PromotionsServiceImpl implements PromotionsService {
    @Autowired
    private PromotionsMapper promotionsMapper;


    @Override
    public List<Promotions> list() {
        PromotionsExample promotionsExample = new PromotionsExample();
        promotionsExample.setOrderByClause("promotions_id asc");
        return promotionsMapper.selectByExample(promotionsExample);
    }

    @Override
    public void add(Promotions promotions) {
        promotionsMapper.insertSelective(promotions);
    }

    @Override
    public Promotions get(int promotions_id) {
        return promotionsMapper.selectByPrimaryKey(promotions_id);
    }


    @Override
    public Promotions getOnline() {
        PromotionsExample promotionsExample = new PromotionsExample();
        promotionsExample.createCriteria().andOnlineEqualTo((byte) 1);
        List<Promotions> promotionsList = promotionsMapper.selectByExample(promotionsExample);
        if (promotionsList.isEmpty()) {
            return null;
        }
        return promotionsList.get(0);
    }

    @Override
    public void update(Promotions promotions) {
        System.out.println(promotions);
        promotionsMapper.updateByPrimaryKeySelective(promotions);
    }
}
