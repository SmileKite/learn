package com.design.singleton;

/**
 * 懒汉式加载
 * @author lizhenyu
 * @date 2021/6/9
 */
public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
