package com.shiki.zongyue.EnumForState;

public enum ChapterOrderBy {
    TIME_DESC("chapter_edit_time desc"), CHAPTER_ASC("chapter_id asc");
    private String order;
    private ChapterOrderBy(String order){
        this.order = order;
    }

    public String  getOrderBy() {
        return order;
    }
}
