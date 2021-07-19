package com.design.mediator.consumer;

import com.design.mediator.Mediator;

/**
 * @author lizhenyu
 * @date 2021/7/19
 */
public abstract class Consumer {
    protected Mediator mediator;
    public Consumer(Mediator mediator) {
        this.mediator = mediator;
    }
    /**
     * 根据传入message执行相关逻辑
     * @param message 相关信息
     */
    public abstract void handle(String message);
}
