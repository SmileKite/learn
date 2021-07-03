package com.design.flyweight;

import org.junit.Test;

/**
 * 享元模式测试
 * @author lizhenyu
 * @date 2021/6/27
 */
public class FlyweightTest {

    /**
     * 测试享元模式
     */
    @Test
    public void test() {
        FlyweightDemo.FlyweightFactory factory = new FlyweightDemo.FlyweightFactory();
        FlyweightDemo.Flyweight chess1 = new FlyweightDemo.Flyweight(factory.getUnit(1), 0, 1);
        FlyweightDemo.Flyweight chess2 = new FlyweightDemo.Flyweight(factory.getUnit(2), 1, 1);
        FlyweightDemo.Flyweight chess3 = new FlyweightDemo.Flyweight(factory.getUnit(3), 2, 1);
        FlyweightDemo.Flyweight chess4 = new FlyweightDemo.Flyweight(factory.getUnit(4), 3, 1);
    }
}
