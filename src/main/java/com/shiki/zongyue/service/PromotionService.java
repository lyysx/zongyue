package com.shiki.zongyue.service;

import com.shiki.zongyue.pojo.Promotion;

import java.util.List;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/10
 **/
public interface PromotionService {

    void add(Promotion promotion);

    List<Promotion> list(int promotions_id);

    Promotion get(int promotions_id);

    void update(Promotion promotion);
}
