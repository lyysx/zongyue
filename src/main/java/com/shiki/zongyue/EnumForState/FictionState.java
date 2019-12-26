package com.shiki.zongyue.EnumForState;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/4
 **/
public enum FictionState {
    ALL(),NOT_SHELVES(0),ON_SHELVES(1),SIGNED(2);
    private int value;
    private FictionState() {

    }

    private FictionState(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
