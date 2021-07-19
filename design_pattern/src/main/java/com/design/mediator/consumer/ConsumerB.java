package com.design.mediator.consumer;

import com.design.mediator.Mediator;

/**
 * @author lizhenyu
 * @date 2021/7/19
 */
public class ConsumerB extends Consumer {
    public ConsumerB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void handle(String message) {
        System.out.println("ConsumerB执行【"+message+"】相关逻辑");
        mediator.send("ConsumerB请求ConsumerC", this);
    }
}
