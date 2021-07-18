package com.design.observer;

import com.design.observer.observable.IObservable;
import com.design.observer.observable.impl.Observable;
import com.design.observer.observer.impl.ObserverA;
import com.design.observer.observer.impl.ObserverB;
import com.design.observer.observer.impl.ObserverC;
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
        IObservable observable = new Observable();
        observable.registerObserver(new ObserverA());
        observable.registerObserver(new ObserverB());
        observable.registerObserver(new ObserverC());
        observable.notifyObserver("测试一哈子");
    }
}
