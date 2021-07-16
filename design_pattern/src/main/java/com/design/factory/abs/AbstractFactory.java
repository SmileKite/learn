package com.design.factory.abs;

import com.design.factory.abs.impl.FactoryA;
import com.design.factory.abs.impl.FactoryB;
import com.design.factory.abs.impl.FactoryC;

import java.util.HashMap;
import java.util.Map;

/**
 * 抽象工厂
 * @author lizhenyu
 * @date 2021/6/14
 */
public class AbstractFactory {
    private static final Map<String, IFactory> CACHE = new HashMap<>();
    static {
        CACHE.putIfAbsent("childrenA", new FactoryA());
        CACHE.putIfAbsent("childrenB", new FactoryB());
        CACHE.putIfAbsent("childrenC", new FactoryC());
    }

    /**
     * 创建工厂对象
     * @param type 要创建的工厂对象key
     * @return 要创建的工厂对象
     */
    public static IFactory createChildren(String type) {
        if (type == null || !CACHE.containsKey(type)) {
            throw new IllegalArgumentException("type is null or not exist!");
        }
        return CACHE.get(type);
    }
}
