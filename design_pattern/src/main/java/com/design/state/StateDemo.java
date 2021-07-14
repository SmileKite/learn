package com.design.state;

/**
 * 状态模式
 * @author lizhenyu
 * @date 2021/7/14
 */
public class StateDemo {

    interface IState {
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

    static class StateA implements IState {
        @Override
        public void triggerEventA(StateMachine machine) {
            System.out.println("执行A状态触发事件A的相关逻辑");
        }
        @Override
        public void triggerEventB(StateMachine machine) {
            System.out.println("执行A状态触发事件C的相关逻辑");
            machine.setState(new StateB());
        }
        @Override
        public void triggerEventC(StateMachine machine) {
            System.out.println("执行A状态触发事件C的相关逻辑");
            machine.setState(new StateC());
        }
    }

    static class StateB implements IState {
        @Override
        public void triggerEventA(StateMachine machine) {
            System.out.println("执行B状态下触发事件A的相关逻辑");
            machine.setState(new StateA());
        }
        @Override
        public void triggerEventB(StateMachine machine) {
            System.out.println("执行B状态下触发事件B的相关逻辑");
        }
        @Override
        public void triggerEventC(StateMachine machine) {
            System.out.println("执行B状态下触发事件C的相关逻辑");
            machine.setState(new StateC());
        }
    }

    static class StateC implements IState {
        @Override
        public void triggerEventA(StateMachine machine) {
            System.out.println("执行C状态下触发事件A的相关逻辑");
            machine.setState(new StateA());
        }
        @Override
        public void triggerEventB(StateMachine machine) {
            System.out.println("执行C状态下触发事件B的相关逻辑");
            machine.setState(new StateB());
        }
        @Override
        public void triggerEventC(StateMachine machine) {
            System.out.println("执行C状态下触发事件C的相关逻辑");
        }
    }

    static class StateMachine {
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
}
