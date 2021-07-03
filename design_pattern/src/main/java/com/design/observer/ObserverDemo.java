package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * @author lizhenyu
 * @date 2021/6/28
 */
public class ObserverDemo {

    /**
     * 观察者接口
     */
    interface IObserver {
        /** 观察动作 */
        void action();
    }
    static class Observer1 implements IObserver {
        @Override
        public void action() {
            System.out.println("Observer1执行了action方法");
        }
    }
    static class Observer2 implements IObserver {
        @Override
        public void action() {
            System.out.println("Observer2执行了action方法");
        }
    }

    /**
     * 被观察者
     */
    interface ISubject {
        void registerObserver(IObserver observer);
        void removeObserver(IObserver observer);
        void notifyObservers();
    }
    static class SubjectImpl implements ISubject {
        private List<IObserver> observerList = new ArrayList<>();
        @Override
        public void registerObserver(IObserver observer) {
            observerList.add(observer);
        }
        @Override
        public void removeObserver(IObserver observer) {
            observerList.remove(observer);
        }
        @Override
        public void notifyObservers() {
            for (IObserver observer : observerList) {
                observer.action();
            }
        }
    }

}
