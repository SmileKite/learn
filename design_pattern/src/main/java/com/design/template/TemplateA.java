package com.design.template;

/**
 * 模板A
 * @author lizhenyu
 * @date 2021/7/3
 */
public class TemplateA extends AbstractTemplate {
    @Override
    protected void action1() {
        System.out.println("模板A执行action1逻辑");
    }

    @Override
    protected void action2() {
        System.out.println("模板A执行action2逻辑");
    }
}
