package com.shiki.zongyue.pojo;

public class Promotion {
    private Integer promotion_id;

    private String promotion_image;

    private String promotion_url;

    private String promotion_description;

    private String promotion_title;

    private Integer promotions_id;

    public Integer getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(Integer promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getPromotion_image() {
        return promotion_image;
    }

    public void setPromotion_image(String promotion_image) {
        this.promotion_image = promotion_image == null ? null : promotion_image.trim();
    }

    public String getPromotion_url() {
        return promotion_url;
    }

    public void setPromotion_url(String promotion_url) {
        this.promotion_url = promotion_url == null ? null : promotion_url.trim();
    }

    public String getPromotion_description() {
        return promotion_description;
    }

    public void setPromotion_description(String promotion_description) {
        this.promotion_description = promotion_description == null ? null : promotion_description.trim();
    }

    public String getPromotion_title() {
        return promotion_title;
    }

    public void setPromotion_title(String promotion_title) {
        this.promotion_title = promotion_title == null ? null : promotion_title.trim();
    }

    public Integer getPromotions_id() {
        return promotions_id;
    }

    public void setPromotions_id(Integer promotions_id) {
        this.promotions_id = promotions_id;
    }
}