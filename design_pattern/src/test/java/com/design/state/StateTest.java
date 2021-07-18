package com.design.state;

import com.design.state.impl.StateA;
import org.junit.Test;

/**
 * 状态模式测试
 * @author lizhenyu
 * @date 2021/7/14
 */
public class StateTest {

    /**
     * 状态模式测试
     */
    @Test
    public void testState() {
        // 创建状态机，初始化为A状态
        StateMachine machine = new StateMachine(new StateA());
        System.out.println(machine.getState());
        machine.triggerEventB();
        System.out.println(machine.getState());
        machine.triggerEventA();
        System.out.println(machine.getState());
        machine.triggerEventC();
        System.out.println(machine.getState());
        machine.triggerEventC();
        System.out.println(machine.getState());
    }
}
