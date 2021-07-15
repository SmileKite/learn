package com.design.adapter;

/**
 * 基于类继承实现的适配器
 * @author lizhenyu
 * @date 2021/6/26
 */
public class ClassAdaptor extends Adaptee implements ITarget {
    @Override
    public void actionA() {
        this.functionA();
    }

    @Override
    public void actionB() {
        this.functionB();
    }

    @Override
    public void actionC() {
        this.functionC();
    }
}
