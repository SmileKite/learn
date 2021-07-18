package com.design.decorator;

import com.design.decorator.target.Decorator;
import com.design.decorator.target.OriginalDecorator;

/**
 * 装饰器类（实现重复打印功能）
 * @author lizhenyu
 * @date 2021/6/26
 */
public class RepeatDecorator extends OriginalDecorator {
    public RepeatDecorator(Decorator decorator) {
        super(decorator);
    }
    @Override
    public void console(String message) {
        decorator.console(message);
        decorator.console(message);
    }
}
