package com.design.decorator;

import com.design.decorator.target.Decorator;
import com.design.decorator.target.OriginalDecorator;
import org.junit.Test;

/**
 * 装饰器模式测试
 * @author lizhenyu
 * @date 2021/6/26
 */
public class DecoratorTest {

    /**
     * 测试重复打印
     */
    @Test
    public void testRepeat() {
        Decorator decorator = new RepeatDecorator(new OriginalDecorator());
        decorator.console("hello world");
    }

    /**
     * 测试打印逻辑增强
     */
    @Test
    public void testSurround() {
        Decorator decorator = new SurroundDecorator(new OriginalDecorator());
        decorator.console("hello world");
    }

    /**
     * 测试组合打印
     */
    @Test
    public void testComposite() {
        Decorator decorator1 = new SurroundDecorator(new RepeatDecorator(new OriginalDecorator()));
        decorator1.console("hello world");
        System.out.println("==============================================");
        Decorator decorator2 = new RepeatDecorator(new SurroundDecorator(new OriginalDecorator()));
        decorator2.console("hello world");
    }
}
