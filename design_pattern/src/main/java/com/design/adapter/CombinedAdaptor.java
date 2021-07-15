package com.design.adapter;

/**
 * 基于类组合实现的适配器
 * @author lizhenyu
 * @date 2021/6/26
 */
public class CombinedAdaptor implements ITarget {
    private Adaptee adaptee;
    public CombinedAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void actionA() {
        adaptee.functionA();
    }

    @Override
    public void actionB() {
        adaptee.functionB();
    }

    @Override
    public void actionC() {
        adaptee.functionC();
    }
}
