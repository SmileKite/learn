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
        StrategyDemo.StrategyFactory factory = new StrategyDemo.StrategyFactory();
        StrategyDemo.IStrategy strategy = factory.getStrategy(null);
        strategy.run();
    }

    /**
     * 参数为empty的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArgument() {
        StrategyDemo.StrategyFactory factory = new StrategyDemo.StrategyFactory();
        StrategyDemo.IStrategy strategy = factory.getStrategy("");
        strategy.run();
    }

    /**
     * 静态编译时确定（动态运行时确定则是使用了配置文件进行确认）
     */
    @Test
    public void testStaticStrategy() {
        StrategyDemo.StrategyFactory factory = new StrategyDemo.StrategyFactory();
        StrategyDemo.IStrategy strategy = factory.getStrategy("A");
        strategy.run();
    }

}
