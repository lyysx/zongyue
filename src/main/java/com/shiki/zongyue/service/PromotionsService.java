package com.shiki.zongyue.service;

import com.shiki.zongyue.pojo.Promotions;

import java.util.List;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/10
 **/
public interface PromotionsService {

    List<Promotions> list();

    void add(Promotions promotions);

    Promotions get(int promotions_id);

    Promotions getOnline();

    void update(Promotions promotions);
}
