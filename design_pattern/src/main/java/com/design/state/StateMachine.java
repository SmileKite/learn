package com.design.state;

/**
 * 状态模式
 * @author lizhenyu
 * @date 2021/7/14
 */
public class StateMachine {
    /** 状态 */
    private IState state;

    public StateMachine(IState state) {
        // 初始状态
        this.state = state;
    }

    public IState getState() {
        return state;
    }
    public void setState(IState state) {
        this.state = state;
    }

    public void triggerEventA() {
        state.triggerEventA(this);
    }
    public void triggerEventB() {
        state.triggerEventB(this);
    }
    public void triggerEventC() {
        state.triggerEventC(this);
    }
}
