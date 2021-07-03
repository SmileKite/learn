package com.design.observer;

import org.junit.Test;

/**
 * 观察者模式测试
 * @author lizhenyu
 * @date 2021/6/28
 */
public class ObserverTest {

    /**
     * 测试观察者模式
     */
    @Test
    public void testObserver() {
        ObserverDemo.ISubject subject = new ObserverDemo.SubjectImpl();
        subject.registerObserver(new ObserverDemo.Observer1());
        subject.removeObserver(new ObserverDemo.Observer1());
        subject.registerObserver(new ObserverDemo.Observer2());
        subject.notifyObservers();
    }
}
