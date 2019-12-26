package com.shiki.zongyue.EnumForState;

public enum FictionOrderBy {
    ID_DESC("fiction_id desc"),RECOMMEND_DESC("fiction_recommend desc"),ID_ASC("fiction_id asc");

    private String orderBy;

    private FictionOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return orderBy;
    }


}
