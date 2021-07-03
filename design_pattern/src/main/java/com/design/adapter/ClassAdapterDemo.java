package com.design.adapter;

/**
 * 基于继承的适配器模式
 * @author lizhenyu
 * @date 2021/6/26
 */
public class ClassAdapterDemo {

    /**
     * 目标接口
     */
    interface ITarget {
        int add(int a, int b);
        int subtract(int a, int b);
        int multiply(int a, int b);
        int divide(int a, int b);
    }

    /**
     * 实际实现类
     */
    static class Adaptee {
        public int addition(int a, int b) {
            return a+b;
        }
        public int subtract(int a, int b) {
            return a-b;
        }
        public int multiply(int a, int b) {
            return a*b;
        }
        public int division(int a, int b) {
            return a/b;
        }
    }

    /**
     * 适配器，用于适配接口
     */
    static class Adaptor extends Adaptee implements ITarget {
        @Override
        public int add(int a, int b) {
            return addition(a, b);
        }
        @Override
        public int divide(int a, int b) {
            return division(a, b);
        }
    }

}
