package com.design.chain;

import com.design.chain.array.ChainArray;
import com.design.chain.array.ITarget;
import com.design.chain.array.impl.TargetA;
import com.design.chain.array.impl.TargetB;
import com.design.chain.array.impl.TargetC;
import com.design.chain.linked.ChainLinked;
import com.design.chain.linked.impl.ChainLinkedA;
import com.design.chain.linked.impl.ChainLinkedB;
import com.design.chain.linked.impl.ChainLinkedC;
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
        ChainLinked chainA = new ChainLinkedA(){
            @Override
            protected boolean result() {
                return false;
            }
        };
        ChainLinked chainB = new ChainLinkedB(){
            @Override
            protected boolean result() {
                return false;
            }
        };
        ChainLinked chainC = new ChainLinkedC(){
            @Override
            protected boolean result() {
                return false;
            }
        };
        chainA.setNext(chainB);
        chainB.setNext(chainC);
        chainA.handle();
    }

    /**
     * 数组形式的职责链测试
     */
    @Test
    public void testArrayChain() {
        ITarget targetA = new TargetA(){
            @Override
            protected boolean result() {
                return false;
            }
        };
        ITarget targetB = new TargetB(){
            @Override
            protected boolean result() {
                return true;
            }
        };
        ITarget targetC = new TargetC(){
            @Override
            protected boolean result() {
                return false;
            }
        };

        ChainArray array = new ChainArray();
        array.add(targetA);
        array.add(targetB);
        array.add(targetC);
        array.handle();
    }
}
