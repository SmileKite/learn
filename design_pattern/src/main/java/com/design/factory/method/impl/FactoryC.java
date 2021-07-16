package com.design.factory.method.impl;

import com.design.factory.method.IFactory;
import com.design.factory.target.ParentA;
import com.design.factory.target.extend.ChildrenCa;

/**
 * 工厂类C
 * @author lizhenyu
 * @date 2021/6/14
 */
public class FactoryC implements IFactory {
    @Override
    public ParentA create() {
        System.out.println("子类C的一大堆创建逻辑");
        return new ChildrenCa();
    }
}
