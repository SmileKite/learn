package com.design.template;

/**
 * 模板模式
 * @author lizhenyu
 * @date 2021/7/3
 */
public class TemplateDemo {

    static abstract class AbstractTemplate {
        final public void run() {
            System.out.println("执行逻辑1");
            action1();
            System.out.println("执行逻辑2");
            action2();
            System.out.println("执行逻辑3");
        }

        protected abstract void action1();
        protected abstract void action2();
    }

    static class Template1 extends AbstractTemplate {

        @Override
        protected void action1() {
            System.out.println("模板1的action1方法执行");
        }

        @Override
        protected void action2() {
            System.out.println("模板1的action2方法执行");
        }
    }

    static class Template2 extends AbstractTemplate {

        @Override
        protected void action1() {
            System.out.println("模板2的action1方法执行");
        }

        @Override
        protected void action2() {
            System.out.println("模板2的action2方法执行");
        }
    }

}
