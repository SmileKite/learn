package com.design.state;

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
        StateDemo.StateMachine machine = new StateDemo.StateMachine(new StateDemo.StateA());
        machine.triggerEventB();
        machine.triggerEventA();
        machine.triggerEventC();
        machine.triggerEventC();
    }
}
