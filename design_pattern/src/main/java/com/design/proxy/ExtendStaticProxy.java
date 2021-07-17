package com.design.proxy;

import com.design.proxy.entity.Target;

/**
 * 静态代理--继承方式
 * @author lizhenyu
 * @date 2021/6/24
 */
public class ExtendStaticProxy extends Target {
    @Override
    public void actionA() {
        System.out.println("actionA方法执行前操作");
        super.actionA();
        System.out.println("actionA方法执行后操作");
    }
    @Override
    public void actionB() {
        System.out.println("actionB方法执行前操作");
        super.actionB();
        System.out.println("actionB方法执行后操作");
    }
}
