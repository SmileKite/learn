package com.design.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂方法
 * @author lizhenyu
 * @date 2021/6/14
 */
public class MethodFactoryDemo {

    static class Parent {}
    static class Children1 extends Parent{}
    static class Children2 extends Parent{}
    static class Children3 extends Parent{}

    interface IMethodFactory {
        Parent create();
    }
    static class Children1MethodFactory implements IMethodFactory {
        @Override
        public Parent create() {
            return new Children1();
        }
    }
    static class Children2MethodFactory implements IMethodFactory {
        @Override
        public Parent create() {
            return new Children2();
        }
    }
    static class Children3MethodFactory implements IMethodFactory {
        @Override
        public Parent create() {
            return new Children3();
        }
    }

    private static final Map<String, IMethodFactory> CACHED = new HashMap<>();
    static {
        CACHED.put("children1", new Children1MethodFactory());
        CACHED.put("children2", new Children2MethodFactory());
        CACHED.put("children3", new Children3MethodFactory());
    }
    public static IMethodFactory createFactory(String name) {
        if (name == null || !CACHED.containsKey(name)) {
            throw new IllegalArgumentException("参数错误，无法生产该工厂！");
        }
        return CACHED.get(name);
    }

}
