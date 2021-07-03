package com.design.adapter;

/**
 * 基于组合的适配器模式
 * @author lizhenyu
 * @date 2021/6/26
 */
public class CombinedAdapterDemo {
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
    static class Adaptor implements ITarget {
        private Adaptee adaptee;
        public Adaptor(Adaptee adaptee) {
            this.adaptee = adaptee;
        }
        @Override
        public int add(int a, int b) {
            return adaptee.addition(a, b);
        }
        @Override
        public int subtract(int a, int b) {
            return adaptee.subtract(a, b);
        }
        @Override
        public int multiply(int a, int b) {
            return adaptee.multiply(a, b);
        }
        @Override
        public int divide(int a, int b) {
            return adaptee.division(a, b);
        }
    }
}
