package com.design.chain;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;

/**
 * 职责链模式（数组实现）
 * @author lizhenyu
 * @date 2021/7/11
 */
public class ChainArrayDemo {

    interface Handler {
        boolean handle();
    }
    static class HandlerA implements Handler {
        @Override
        public boolean handle() {
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
    static class HandlerB implements Handler {
        @Override
        public boolean handle() {
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
    static class HandlerC implements Handler {
        @Override
        public boolean handle() {
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

    static class Chain {
        private List<Handler> handlers = new ArrayList<>();
        public void addHandler(Handler handler) {
            handlers.add(handler);
        }
        public void handle() {
            for (Handler handler : handlers) {
                boolean handled = handler.handle();
                if (handled) {
                    break;
                }
            }
        }
    }
}
