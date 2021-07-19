package com.design.mediator.consumer;

import com.design.mediator.Mediator;

/**
 * @author lizhenyu
 * @date 2021/7/19
 */
public class ConsumerC extends Consumer {
    public ConsumerC(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void handle(String message) {
        System.out.println("ConsumerC执行【"+message+"】相关逻辑");
    }
}
