package com.design.singleton;

/**
 * 双检锁加载
 * @author lizhenyu
 * @date 2021/6/13
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
