package com.design.factory.abs.impl;

import com.design.factory.abs.IFactory;
import com.design.factory.target.ParentA;
import com.design.factory.target.ParentB;
import com.design.factory.target.extend.ChildrenAa;
import com.design.factory.target.extend.ChildrenAb;

/**
 * 工厂类A
 * @author lizhenyu
 * @date 2021/6/14
 */
public class FactoryA implements IFactory {
    @Override
    public ParentA createA() {
        System.out.println("子类Aa的一大堆创建逻辑");
        return new ChildrenAa();
    }

    @Override
    public ParentB createB() {
        System.out.println("子类Ab的一大堆创建逻辑");
        return new ChildrenAb();
    }
}
