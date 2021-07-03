package com.design.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂
 * @author lizhenyu
 * @date 2021/6/14
 */
public class SimpleFactoryDemo {

    static class Parent {}
    static class Children1 extends Parent{}
    static class Children2 extends Parent{}
    static class Children3 extends Parent{}

    private static final Map<String, Parent> CACHED = new HashMap<>();
    static {
        // 与单例模式结合，不需要每次生产新的对象
        CACHED.put("children1", new Children1());
        CACHED.put("children2", new Children2());
        CACHED.put("children3", new Children3());
    }
    public static Parent createChildren(String name) {
        if (name == null || !CACHED.containsKey(name)) {
            throw new IllegalArgumentException("参数错误，无法生产该类！");
        }
        return CACHED.get(name);
    }

}
