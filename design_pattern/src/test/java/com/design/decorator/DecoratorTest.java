package com.design.decorator;

import org.junit.Test;

/**
 * 装饰器模式测试
 * @author lizhenyu
 * @date 2021/6/26
 */
public class DecoratorTest {

    /**
     * 测试装饰器模式
     */
    @Test
    public void testDecorator() {
        DecoratorDemo.Decorator decorator = new DecoratorDemo.RichDecorator(null);
        DecoratorDemo.Decorator repeatDecorator = new DecoratorDemo.RepeatDecorator(decorator);
        DecoratorDemo.Decorator surroundDecorator = new DecoratorDemo.SurroundDecorator(repeatDecorator);
        surroundDecorator.say("hello world");
    }
}
