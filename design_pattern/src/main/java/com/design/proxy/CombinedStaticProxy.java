package com.design.proxy;

import com.design.proxy.entity.ITarget;

/**
 * 静态代理--组合方式
 * @author lizhenyu
 * @date 2021/6/24
 */
public class CombinedStaticProxy {
    private ITarget target;
    public CombinedStaticProxy(ITarget target) {
        this.target = target;
    }
    public void actionA() {
        System.out.println("actionA方法执行前操作");
        target.actionA();
        System.out.println("actionA方法执行后操作");
    }
    public void actionB() {
        System.out.println("actionB方法执行前操作");
        target.actionB();
        System.out.println("actionB方法执行后操作");
    }
}
