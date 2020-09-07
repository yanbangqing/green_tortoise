package com.lemmon.hunter.service;

/**
 * @author yanbangqing
 * @version V1.0
 * @Description 自定义map，思路大概是实现map的基本功能，放数据，取数据，key检查
 * @date 2020/9/7 10:39 下午
 */
public interface TorMap {

    /**
     * 存值
     * @param key
     * @param val
     */
    void put(String key,Object val);

    /**
     * 取值
     * @param key
     * @return
     */
    Object get(String key);

    /**
     * 检查key是否存在
     * @param key
     * @return
     */
    boolean contains(String key);

}
