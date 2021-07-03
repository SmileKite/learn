package com.design.eventbus;

import com.design.eventbus.example.Controller1;
import com.design.eventbus.example.Controller2;
import com.design.eventbus.example.observer.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * EventBus测试
 * @author lizhenyu
 * @date 2021/6/30
 */
public class EventBusTest {

    /**
     * 测试参数为空的情况
     */
    @Test
    public void testObserver1() {
        List<Object> observers = new ArrayList<>();
        observers.add(new ObserverOne());
        Controller1 controller1 = new Controller1();
        controller1.setObservers(observers);
        controller1.action1();
        controller1.action2();
        controller1.action3();
    }

    /**
     * 测试参数为多个的情况
     */
    @Test
    public void testObserver2() {
        List<Object> observers = new ArrayList<>();
        observers.add(new ObserverTwo());
        Controller1 controller1 = new Controller1();
        controller1.setObservers(observers);
        controller1.action1();
        controller1.action2();
        controller1.action3();
    }

    /**
     * 测试无注解的情况
     */
    @Test
    public void testObserver3() {
        List<Object> observers = new ArrayList<>();
        observers.add(new ObserverThree());
        Controller1 controller1 = new Controller1();
        controller1.setObservers(observers);
        controller1.action1();
        controller1.action2();
        controller1.action3();
    }

    /**
     * 测试单个观察者
     */
    @Test
    public void testObserver4() {
        List<Object> observers = new ArrayList<>();
        observers.add(new ObserverFour());
        Controller1 controller1 = new Controller1();
        controller1.setObservers(observers);
        controller1.action1();
        controller1.action2();
        controller1.action3();
    }

    /**
     * 测试多个观察者
     */
    @Test
    public void testObserver5() {
        List<Object> observers = new ArrayList<>();
        observers.add(new ObserverFour());
        observers.add(new ObserverFive());
        Controller1 controller1 = new Controller1();
        controller1.setObservers(observers);
        controller1.action1();
        controller1.action2();
        controller1.action3();
    }

    /**
     * 测试同步、异步观察者
     */
    @Test
    public void testObserver6() {
        List<Object> observers = new ArrayList<>();
        observers.add(new ObserverFour());
        Controller1 controller1 = new Controller1();
        controller1.setObservers(observers);
        controller1.action1();
        Controller2 controller2 = new Controller2();
        controller2.setObservers(observers);
        controller2.action();
    }
}
