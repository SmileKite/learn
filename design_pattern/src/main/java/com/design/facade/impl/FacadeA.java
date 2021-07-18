package com.design.facade.impl;

import com.design.facade.IFacadeA;

/**
 * 接口A的实现类
 * @author lizhenyu
 * @date 2021/6/27
 */
public class FacadeA implements IFacadeA {
    @Override
    public void actionA() {
        System.out.println("执行FacadeA的方法actionA");
    }

    @Override
    public void actionB() {
        System.out.println("执行FacadeA的方法actionB");
    }
}
