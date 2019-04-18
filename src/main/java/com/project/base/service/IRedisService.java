package com.project.base.service;

import java.util.List;
import java.util.Set;

public interface IRedisService {

    String set(String key, String value);

    String set(String key, String value, long seconds);

    String get(String key);

    String expire(String key, long seconds);

    /**
     * 获取所有的key
     * @return string
     */
    Set<String> keys();

    /**
     * 查看某个key的剩余生存时间,单位【秒】.永久生存或者不存在的都返回-1
     * @param key key值
     * @return string
     */
    Long ttl(String key);

    /**
     * 移除某个key的生存时间
     * @param key key值
     * @return string
     */
    Long persist(String key);

    /**
     * 查看key所储存的值的类型
     * @param key key值
     * @return string
     */
    String type(String key);

    /*******************************************list操作********************************/

    /**
     * list中添加数据
     * @param key key值
     * @param value value
     * @return string
     */
    Long lpush(String key, String value);

    /**
     * 列举list中所有元素
     * @param key key值
     * @return string
     */
    List<String> lrange(String key);

    /**
     * 列举指定区间元素
     * @param key 存储list的key
     * @param start 元素下标
     * @param end 元素下标；-1代表倒数一个元素，-2代表倒数第二个元素
     * @return
     */
    List<String> lrange(String key, long start, long end);

    /**
     * 删除列表指定的值 ，后add进去的值先被删，类似于出栈
     * @param key 存储list的key
     * @param count 删除的个数（有重复时）
     * @param value 要删除的value
     * @return 成功删除指定元素个数
     */
    Long lrem(String key, long count, String value);

    /**
     * 删除区间以外的数据
     * @param key 存储list的key
     * @param start 下标起始
     * @param end 下标结束
     * @return
     */
    String ltrim(String key, long start, long end);

    /**
     * 列表元素出栈，先进后出，后进先出
     * @param key 存储list的key
     * @return
     */
    String lpop(String key);

    /**
     * 列表长度
     * @param key 存储list的key
     * @return
     */
    Long llen(String key);

    /**
     * 获取指定下标的值
     * @param key 存储list的key
     * @param index 下标
     * @return
     */
    String lindex(String key, long index);


    /*******************************************set操作********************************/
}
