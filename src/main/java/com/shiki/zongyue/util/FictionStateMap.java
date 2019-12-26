package com.shiki.zongyue.util;

import com.shiki.zongyue.EnumForState.FictionState;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/18
 **/
public class FictionStateMap {

    public static Map<String,FictionState> getStateMap() {
        Map<String, FictionState> stateMap = new HashMap<>();
        stateMap.put("new", FictionState.NOT_SHELVES);
        stateMap.put("sign", FictionState.ON_SHELVES);
        return stateMap;
    }
}
