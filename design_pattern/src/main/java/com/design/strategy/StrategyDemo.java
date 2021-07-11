package com.design.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式
 * @author lizhenyu
 * @date 2021/7/11
 */
public class StrategyDemo {

    /**
     * 策略接口
     */
    interface IStrategy {
        /**
         * 策略方法执行
         */
        void run();
    }
    static class StrategyA implements IStrategy {
        @Override
        public void run() {
            System.out.println("策略A的实现");
        }
    }
    static class StrategyB implements IStrategy {
        @Override
        public void run() {
            System.out.println("策略B的实现");
        }
    }
    static class StrategyC implements IStrategy {
        @Override
        public void run() {
            System.out.println("策略C的实现");
        }
    }

    /**
     * 策略工厂类
     */
    static class StrategyFactory {
        private static final Map<String, IStrategy> STRATEGY = new HashMap<>();
        static {
            STRATEGY.put("A", new StrategyA());
            STRATEGY.put("B", new StrategyB());
            STRATEGY.put("C", new StrategyC());
        }
        public IStrategy getStrategy(String type) {
            if (type == null || type.isEmpty()) {
                throw new IllegalArgumentException("type should not be empty.");
            }
            return STRATEGY.get(type);
        }
    }

}
