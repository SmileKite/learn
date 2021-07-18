package com.design.strategy;

import org.junit.Test;

/**
 * 策略模式测试类
 * @author lizhenyu
 * @date 2021/7/11
 */
public class StrategyTest {

    /**
     * 参数为null的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNullArgument() {
        StrategyFactory factory = new StrategyFactory();
        IStrategy strategy = factory.getStrategy(null);
        strategy.action();
    }

    /**
     * 参数为empty的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArgument() {
        StrategyFactory factory = new StrategyFactory();
        IStrategy strategy = factory.getStrategy("");
        strategy.action();
    }

    /**
     * 静态编译时确定（动态运行时确定则是使用了配置文件进行确认）
     */
    @Test
    public void testStaticStrategy() {
        StrategyFactory factory = new StrategyFactory();
        IStrategy strategy = factory.getStrategy("A");
        strategy.action();
    }

}
