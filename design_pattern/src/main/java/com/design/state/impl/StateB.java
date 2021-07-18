package com.design.state.impl;

import com.design.state.IState;
import com.design.state.StateMachine;

/**
 * 状态B
 * @author lizhenyu
 * @date 2021/7/14
 */
public class StateB implements IState {
    @Override
    public void triggerEventA(StateMachine machine) {
        System.out.println("触发事件A的执行逻辑");
        machine.setState(new StateA());
    }

    @Override
    public void triggerEventB(StateMachine machine) {
        System.out.println("触发事件B的执行逻辑");
    }

    @Override
    public void triggerEventC(StateMachine machine) {
        System.out.println("触发事件C的执行逻辑");
        machine.setState(new StateC());
    }
}
