package com.design.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 多例
 * @author lizhenyu
 * @date 2021/6/19
 */
public class MultipleDemo {
    private static final Map<Long, MultipleDemo> instances = new HashMap<>();
    static {
        instances.put(1L, new MultipleDemo());
        instances.put(2L, new MultipleDemo());
        instances.put(3L, new MultipleDemo());
    }
    private MultipleDemo(){}
    public MultipleDemo getInstance(Long no) {
        return instances.get(no);
    }
}
