package com.lemmon.hunter.service.impl;

import com.lemmon.hunter.service.TorMap;

/**
 * @author yanbangqing
 * @version V1.0
 * @Description 无序hashmap
 * @date 2020/9/7 10:40 下午
 */
public class TorHashMap implements TorMap {
    private final int initSize = 16;

    Object[] obj = new Object[initSize];


    public void put(String key, Object val) {
        for (Object o : obj) {
            if (o == null){
                o = key;
            }
        }
    }

    public Object get(String key) {
        return null;
    }

    public boolean contains(String key) {
        return false;
    }
}
