package com.design.mediator;

import com.design.mediator.consumer.ConsumerA;
import com.design.mediator.consumer.ConsumerB;
import com.design.mediator.consumer.ConsumerC;
import org.junit.Test;

/**
 * 中介模式测试
 * @author lizhenyu
 * @date 2021/7/19
 */
public class MediatorTest {
    /**
     * 测试中介模式
     */
    @Test
    public void testMediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConsumerA consumerA = new ConsumerA(mediator);
        ConsumerB consumerB = new ConsumerB(mediator);
        ConsumerC consumerC = new ConsumerC(mediator);
        mediator.setConsumerA(consumerA);
        mediator.setConsumerB(consumerB);
        mediator.setConsumerC(consumerC);
        consumerA.handle("");
        System.out.println("=================================");
        consumerB.handle("");
    }
}
