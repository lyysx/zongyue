package com.shiki.zongyue.pojo;

public class Promotions {
    private Integer promotions_id;

    private String promotions_title;

    private String promotions_description;

    private Byte online;

    public Integer getPromotions_id() {
        return promotions_id;
    }

    public void setPromotions_id(Integer promotions_id) {
        this.promotions_id = promotions_id;
    }

    public String getPromotions_title() {
        return promotions_title;
    }

    public void setPromotions_title(String promotions_title) {
        this.promotions_title = promotions_title == null ? null : promotions_title.trim();
    }

    public String getPromotions_description() {
        return promotions_description;
    }

    public void setPromotions_description(String promotions_description) {
        this.promotions_description = promotions_description == null ? null : promotions_description.trim();
    }

    public Byte getOnline() {
        return online;
    }

    public void setOnline(Byte online) {
        this.online = online;
    }
}