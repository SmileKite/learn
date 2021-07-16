package com.design.factory.abs.impl;

import com.design.factory.abs.IFactory;
import com.design.factory.target.ParentA;
import com.design.factory.target.ParentB;
import com.design.factory.target.extend.ChildrenBa;
import com.design.factory.target.extend.ChildrenBb;

/**
 * 工厂类B
 * @author lizhenyu
 * @date 2021/6/14
 */
public class FactoryB implements IFactory {
    @Override
    public ParentA createA() {
        System.out.println("子类Ba的一大堆创建逻辑");
        return new ChildrenBa();
    }

    @Override
    public ParentB createB() {
        System.out.println("子类Bb的一大堆创建逻辑");
        return new ChildrenBb();
    }
}
