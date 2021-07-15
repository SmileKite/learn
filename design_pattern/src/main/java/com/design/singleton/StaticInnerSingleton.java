package com.design.singleton;

/**
 * 静态内部类加载
 * @author lizhenyu
 * @date 2021/6/13
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {}
    public static StaticInnerSingleton getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }
}
