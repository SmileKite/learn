package com.design.facade.impl;

import com.design.facade.IFacadeB;

/**
 * 接口B的实现类
 * @author lizhenyu
 * @date 2021/6/27
 */
public class FacadeB implements IFacadeB {
    @Override
    public void actionA() {
        System.out.println("执行FacadeB的方法actionA");
    }

    @Override
    public void actionB() {
        System.out.println("执行FacadeB的方法actionB");
    }
}
