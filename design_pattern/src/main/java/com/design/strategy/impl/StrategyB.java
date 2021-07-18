package com.design.strategy.impl;

import com.design.strategy.IStrategy;

/**
 * 策略实现类B
 * @author lizhenyu
 * @date 2021/7/11
 */
public class StrategyB implements IStrategy {
    @Override
    public void action() {
        System.out.println("策略实现类B的具体策略实现");
    }
}
