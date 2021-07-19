package com.design.mediator.consumer;

import com.design.mediator.Mediator;

/**
 * @author lizhenyu
 * @date 2021/7/19
 */
public class ConsumerA extends Consumer {
    public ConsumerA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void handle(String message) {
        System.out.println("ConsumerA执行【"+message+"】相关逻辑");
        mediator.send("ConsumerA请求ConsumerB", this);
    }
}
