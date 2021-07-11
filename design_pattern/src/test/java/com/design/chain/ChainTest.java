package com.design.chain;

import org.junit.Test;

/**
 * 职责链模式测试类
 * @author lizhenyu
 * @date 2021/7/11
 */
public class ChainTest {

    /**
     * 链表形式的职责链测试
     */
    @Test
    public void testLinkedChain() {
        ChainLinkedDemo.Handler handlerA = new ChainLinkedDemo.HandlerA() {
            @Override
            protected boolean check() {
                return false;
            }
        };
        ChainLinkedDemo.Handler handlerB = new ChainLinkedDemo.HandlerB() {
            @Override
            protected boolean check() {
                return true;
            }
        };
        ChainLinkedDemo.Handler handlerC = new ChainLinkedDemo.HandlerC() {
            @Override
            protected boolean check() {
                return false;
            }
        };
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        handlerA.handle();
    }

    /**
     * 数组形式的职责链测试
     */
    @Test
    public void testArrayChain() {
        ChainArrayDemo.Handler handlerA = new ChainArrayDemo.HandlerA() {
            @Override
            protected boolean check() {
                return false;
            }
        };
        ChainArrayDemo.Handler handlerB = new ChainArrayDemo.HandlerB() {
            @Override
            protected boolean check() {
                return false;
            }
        };
        ChainArrayDemo.Handler handlerC = new ChainArrayDemo.HandlerC() {
            @Override
            protected boolean check() {
                return true;
            }
        };

        ChainArrayDemo.Chain chain = new ChainArrayDemo.Chain();
        chain.addHandler(handlerA);
        chain.addHandler(handlerB);
        chain.addHandler(handlerC);
        chain.handle();
    }
}
