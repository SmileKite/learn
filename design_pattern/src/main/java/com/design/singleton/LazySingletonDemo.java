package com.design.singleton;

/**
 * 懒汉式加载
 * @author lizhenyu
 * @date 2021/6/9
 */
public class LazySingletonDemo {

    private static LazySingletonDemo instance;
    private LazySingletonDemo(){}
    public static synchronized LazySingletonDemo getInstance() {
        if (instance == null) {
            instance = new LazySingletonDemo();
        }
        return instance;
    }

}
