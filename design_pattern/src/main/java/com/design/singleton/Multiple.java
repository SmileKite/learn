package com.design.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 多例
 * @author lizhenyu
 * @date 2021/6/19
 */
public class Multiple {
    private static final Map<Long, Multiple> instances = new HashMap<>();
    static {
        instances.put(1L, new Multiple());
        instances.put(2L, new Multiple());
        instances.put(3L, new Multiple());
    }
    private Multiple(){}
    public Multiple getInstance(Long no) {
        return instances.get(no);
    }
}
