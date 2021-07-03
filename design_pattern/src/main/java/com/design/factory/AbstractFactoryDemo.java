package com.design.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 抽象工厂
 * @author lizhenyu
 * @date 2021/6/14
 */
public class AbstractFactoryDemo {

    static abstract class Parent1{}
    static abstract class Parent2{}
    static class Children11 extends Parent1{}
    static class Children12 extends Parent1{}
    static class Children13 extends Parent1{}
    static class Children21 extends Parent2{}
    static class Children22 extends Parent2{}
    static class Children23 extends Parent2{}

    interface IAbstractFactory {
        Parent1 create1();
        Parent2 create2();
    }
    static class Children1Factory implements IAbstractFactory {
        @Override
        public Parent1 create1() {
            return new Children11();
        }
        @Override
        public Parent2 create2() {
            return new Children21();
        }
    }
    static class Children2Factory implements IAbstractFactory {
        @Override
        public Parent1 create1() {
            return new Children12();
        }
        @Override
        public Parent2 create2() {
            return new Children22();
        }
    }
    static class Children3Factory implements IAbstractFactory {
        @Override
        public Parent1 create1() {
            return new Children13();
        }
        @Override
        public Parent2 create2() {
            return new Children23();
        }
    }

    private static final Map<String, IAbstractFactory> CACHED = new HashMap<>();
    static {
        CACHED.put("children1", new Children1Factory());
        CACHED.put("children2", new Children2Factory());
        CACHED.put("children3", new Children3Factory());
    }
    public static IAbstractFactory createFactory(String name) {
        if (name == null || !CACHED.containsKey(name)) {
            throw new IllegalArgumentException("无法生产该工厂类！");
        }
        return CACHED.get(name);
    }
}
