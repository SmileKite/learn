package com.design.singleton;

/**
 * 饿汉式加载
 * @author lizhenyu
 * @date 2021/6/9
 */
public class HungrySingletonDemo {

    private static HungrySingletonDemo instance = new HungrySingletonDemo();
    private HungrySingletonDemo(){}
    public static HungrySingletonDemo getInstance() {
        return instance;
    }

}