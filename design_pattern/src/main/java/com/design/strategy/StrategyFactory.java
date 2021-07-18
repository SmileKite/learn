package com.design.strategy;

import com.design.strategy.impl.StrategyA;
import com.design.strategy.impl.StrategyB;
import com.design.strategy.impl.StrategyC;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂类
 * @author lizhenyu
 * @date 2021/7/11
 */
public class StrategyFactory {
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
