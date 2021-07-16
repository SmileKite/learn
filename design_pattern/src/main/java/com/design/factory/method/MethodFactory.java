package com.design.factory.method;

import com.design.factory.method.impl.FactoryA;
import com.design.factory.method.impl.FactoryB;
import com.design.factory.method.impl.FactoryC;
import com.design.factory.target.ParentA;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂方法类
 * @author lizhenyu
 * @date 2021/6/14
 */
public class MethodFactory {
    private static final Map<String, IFactory> CACHE = new HashMap<>();
    static {
        CACHE.putIfAbsent("childrenA", new FactoryA());
        CACHE.putIfAbsent("childrenB", new FactoryB());
        CACHE.putIfAbsent("childrenC", new FactoryC());
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
        return CACHE.get(type).create();
    }
}
