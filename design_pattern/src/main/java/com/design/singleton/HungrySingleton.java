package com.design.singleton;

/**
 * 饿汉式加载
 * @author lizhenyu
 * @date 2021/6/9
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance() {
        return instance;
    }

}