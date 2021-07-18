package com.design.state;

/**
 * 状态接口
 * @author lizhenyu
 * @date 2021/7/14
 */
public interface IState {
    /**
     * 触发事件A
     * @param machine 状态机
     */
    public void triggerEventA(StateMachine machine);
    /**
     * 触发事件B
     * @param machine 状态机
     */
    public void triggerEventB(StateMachine machine);
    /**
     * 触发事件C
     * @param machine 状态机
     */
    public void triggerEventC(StateMachine machine);
}
