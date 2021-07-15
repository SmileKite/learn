package com.design.template;

/**
 * 模板类
 * @author lizhenyu
 * @date 2021/7/3
 */
public abstract class AbstractTemplate {
    /**
     * 入口方法--final，不允许继承
     */
    final public void run() {
        System.out.println("action1执行前逻辑");
        action1();
        System.out.println("action1执行后逻辑");
        System.out.println("action2执行前逻辑");
        action2();
        System.out.println("action2执行后逻辑");
    }

    /**
     * 步骤1
     */
    abstract protected void action1();

    /**
     * 步骤2
     */
    abstract protected void action2();
}
