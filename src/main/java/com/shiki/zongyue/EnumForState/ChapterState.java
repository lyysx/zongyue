package com.shiki.zongyue.EnumForState;

public enum ChapterState {
    DRAFT(0), PUBLISHED(1), RECYCLE(2),
    ;
    private int value;
    private ChapterState(int value) {
        this.value = value;
    }

    public int getStatus() {
        return this.value;
    }

}
