package com.design.factory.abs.impl;

import com.design.factory.abs.IFactory;
import com.design.factory.target.ParentA;
import com.design.factory.target.ParentB;
import com.design.factory.target.extend.ChildrenCa;
import com.design.factory.target.extend.ChildrenCb;

/**
 * 工厂类C
 * @author lizhenyu
 * @date 2021/6/14
 */
public class FactoryC implements IFactory {
    @Override
    public ParentA createA() {
        System.out.println("子类Ca的一大堆创建逻辑");
        return new ChildrenCa();
    }

    @Override
    public ParentB createB() {
        System.out.println("子类Cb的一大堆创建逻辑");
        return new ChildrenCb();
    }
}
