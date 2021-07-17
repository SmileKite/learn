package com.design.proxy.entity;

/**
 * 代理目标
 * @author lizhenyu
 * @date 2021/6/24
 */
public class Target implements ITarget {
    @Override
    public void actionA() {
        System.out.println("actionA的执行逻辑");
    }
    @Override
    public void actionB() {
        System.out.println("actionB的执行逻辑");
    }
}
