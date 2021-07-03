package com.design.singleton;

/**
 * 双检锁加载
 * @author lizhenyu
 * @date 2021/6/13
 */
public class DoubleCheckSingletonDemo {

    private static DoubleCheckSingletonDemo instance;
    private DoubleCheckSingletonDemo(){}
    public static DoubleCheckSingletonDemo getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingletonDemo.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingletonDemo();
                }
            }
        }
        return instance;
    }
}
