package com.design.template;

/**
 * 模板B
 * @author lizhenyu
 * @date 2021/7/3
 */
public class TemplateB extends AbstractTemplate {
    @Override
    protected void action1() {
        System.out.println("模板B执行action1逻辑");
    }

    @Override
    protected void action2() {
        System.out.println("模板B执行action2逻辑");
    }
}
