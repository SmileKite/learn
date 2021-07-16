package com.design.factory.simple;

import com.design.factory.target.ParentA;
import com.design.factory.target.extend.ChildrenAa;
import com.design.factory.target.extend.ChildrenBa;
import com.design.factory.target.extend.ChildrenCa;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂类
 * @author lizhenyu
 * @date 2021/6/14
 */
public class SimpleFactory {
    private static final Map<String, ParentA> CACHE = new HashMap<>();
    static {
        // 使用单例模式，不用每次创建对应对象
        CACHE.putIfAbsent("childrenA", new ChildrenAa());
        CACHE.putIfAbsent("childrenB", new ChildrenBa());
        CACHE.putIfAbsent("childrenC", new ChildrenCa());
    }

    /**
     * 创建对象
     * @param type 要创建的对象key
     * @return 要创建的对象
     */
    public static ParentA createChildren(String type) {
        if (type == null || !CACHE.containsKey(type)) {
            throw new IllegalArgumentException("type is null or not exist!");
        }
        return CACHE.get(type);
    }
}
