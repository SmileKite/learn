package com.design.adapter;

/**
 * 实际实现类
 * @author lizhenyu
 * @date 2021/6/26
 */
public class Adaptee {
    /**
     * 方法A--功能对应ITarget中的actionA
     */
    public void functionA() {
        System.out.println("方法A逻辑执行");
    }
    /**
     * 方法B--功能对应ITarget中的actionB
     */
    public void functionB() {
        System.out.println("方法B逻辑执行");
    }
    /**
     * 方法C--功能对应ITarget中的actionC
     */
    public void functionC() {
        System.out.println("方法C逻辑执行");
    }
}
