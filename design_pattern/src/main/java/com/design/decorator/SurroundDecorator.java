package com.design.decorator;

import com.design.decorator.target.Decorator;
import com.design.decorator.target.OriginalDecorator;

/**
 * 装饰器类（实现打印前后操作功能）
 * @author lizhenyu
 * @date 2021/6/26
 */
public class SurroundDecorator extends OriginalDecorator {
    public SurroundDecorator(Decorator decorator) {
        super(decorator);
    }
    @Override
    public void console(String message) {
        System.out.println("打印执行前操作");
        decorator.console(message);
        System.out.println("打印执后前操作");
    }
}
