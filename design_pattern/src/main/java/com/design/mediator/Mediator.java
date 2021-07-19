package com.design.mediator;

import com.design.mediator.consumer.Consumer;

/**
 * 抽象中介
 * @author lizhenyu
 * @date 2021/7/19
 */
public abstract class Mediator {
    /**
     * 将消息发送给消费方
     * @param message 消息
     * @param consumer 消费方
     */
    public abstract void send(String message, Consumer consumer);
}
