package com.design.chain;

import com.google.common.annotations.VisibleForTesting;

/**
 * 职责链模式（链表实现）
 * @author lizhenyu
 * @date 2021/7/11
 */
public class ChainLinkedDemo {

    static abstract class Handler {
        protected Handler next = null;
        public void setNext(Handler handler) {
            this.next = handler;
        }
        public void handle() {
            boolean handled = doHandle();
            if (!handled && next != null) {
                next.handle();
            }
        }
        protected abstract boolean doHandle();
    }
    static class HandlerA extends Handler {
        @Override
        protected boolean doHandle() {
            System.out.println("执行HandlerA的逻辑");
            return check();
        }
        /**
         * 为了测试将执行是否成功提取到一个方法中，以便mock
         * @return 职责链当前环执行是否成功
         */
        @VisibleForTesting
        protected boolean check() {
            return Math.random() == 0;
        }
    }
    static class HandlerB extends Handler {
        @Override
        protected boolean doHandle() {
            System.out.println("执行HandlerB的逻辑");
            return check();
        }
        /**
         * 为了测试将执行是否成功提取到一个方法中，以便mock
         * @return 职责链当前环执行是否成功
         */
        @VisibleForTesting
        protected boolean check() {
            return Math.random() == 0;
        }
    }
    static class HandlerC extends Handler {
        @Override
        protected boolean doHandle() {
            System.out.println("执行HandlerC的逻辑");
            return check();
        }
        /**
         * 为了测试将执行是否成功提取到一个方法中，以便mock
         * @return 职责链当前环执行是否成功
         */
        @VisibleForTesting
        protected boolean check() {
            return Math.random() == 0;
        }
    }

}
