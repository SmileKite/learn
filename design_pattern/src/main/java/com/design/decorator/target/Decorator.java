package com.design.decorator.target;

/**
 * 装饰器原始抽象类
 * @author lizhenyu
 * @date 2021/6/26
 */
public abstract class Decorator {
    /**
     * 打印方法
     * @param message 打印内容
     */
    public abstract void console(String message);
}
