package com.design.factory.method.impl;

import com.design.factory.method.IFactory;
import com.design.factory.target.ParentA;
import com.design.factory.target.extend.ChildrenBa;

/**
 * 工厂类B
 * @author lizhenyu
 * @date 2021/6/14
 */
public class FactoryB implements IFactory {
    @Override
    public ParentA create() {
        System.out.println("子类B的一大堆创建逻辑");
        return new ChildrenBa();
    }
}
