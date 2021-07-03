package com.design.singleton;

/**
 * 静态内部类加载
 * @author lizhenyu
 * @date 2021/6/13
 */
public class StaticInnerSingletonDemo {

    private StaticInnerSingletonDemo() {}
    public static StaticInnerSingletonDemo getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder {
        private static StaticInnerSingletonDemo instance = new StaticInnerSingletonDemo();
    }
}
