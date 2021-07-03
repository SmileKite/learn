package com.design.bridge;

/**
 * 桥接模式
 * @author lizhenyu
 * @date 2021/6/27
 */
public class BridgeDemo {

    /**
     * 抽象角色
     */
    static abstract class Abstraction {
        private Implementor implementor;
        public Abstraction(Implementor implementor) {
            this.implementor = implementor;
        }
        public Implementor getImplementor() {
            return this.implementor;
        }
        abstract void deal();
    }

    static class Abstract1 extends Abstraction {
        public Abstract1(Implementor implementor) {
            super(implementor);
        }
        @Override
        void deal() {
            this.getImplementor().say();
            this.getImplementor().read();
        }
    }

    static class Abstract2 extends Abstraction {
        public Abstract2(Implementor implementor) {
            super(implementor);
        }
        @Override
        void deal() {
            this.getImplementor().say();
            this.getImplementor().write();
        }
    }

    /**
     * 实现角色
     */
    static abstract class Implementor {
        abstract void say();
        abstract void read();
        abstract void write();
    }

    static class Implementor1 extends Implementor {
        @Override
        void say() {
            System.out.println("执行Implementor1的say方法");
        }
        @Override
        void read() {
            System.out.println("执行Implementor1的read方法");
        }
        @Override
        void write() {
            System.out.println("执行Implementor1的write方法");
        }
    }

    static class Implementor2 extends Implementor {
        @Override
        void say() {
            System.out.println("执行Implementor2的say方法");
        }
        @Override
        void read() {
            System.out.println("执行Implementor2的read方法");
        }
        @Override
        void write() {
            System.out.println("执行Implementor2的write方法");
        }
    }

}
