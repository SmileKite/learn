package com.design.mediator;

import com.design.mediator.consumer.Consumer;
import com.design.mediator.consumer.ConsumerA;
import com.design.mediator.consumer.ConsumerB;
import com.design.mediator.consumer.ConsumerC;

/**
 * 中介实现类
 * @author lizhenyu
 * @date 2021/7/19
 */
public class ConcreteMediator extends Mediator {
    private ConsumerA consumerA;
    private ConsumerB consumerB;
    private ConsumerC consumerC;
    public void setConsumerA(ConsumerA consumerA) {
        this.consumerA = consumerA;
    }
    public void setConsumerB(ConsumerB consumerB) {
        this.consumerB = consumerB;
    }
    public void setConsumerC(ConsumerC consumerC) {
        this.consumerC = consumerC;
    }

    @Override
    public void send(String message, Consumer consumer) {
        if (consumer == consumerA) {
            consumerB.handle(message);
        } else if (consumer == consumerB) {
            consumerC.handle(message);
        } else if (consumer == consumerC) {
            consumerA.handle(message);
        }
    }
}
