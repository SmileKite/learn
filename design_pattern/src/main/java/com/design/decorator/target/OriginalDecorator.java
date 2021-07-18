package com.design.decorator.target;

/**
 * 装饰器原始类
 * @author lizhenyu
 * @date 2021/6/26
 */
public class OriginalDecorator extends Decorator {
    protected Decorator decorator;
    public OriginalDecorator() {

    }
    protected OriginalDecorator(Decorator decorator) {
        this.decorator = decorator;
    }
    @Override
    public void console(String message) {
        System.out.println(message);
    }
}
