package com.design.eventbus.frame;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * 同步阻塞的观察者模式
 * @author lizhenyu
 * @date 2021/6/30
 */
public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();
    public EventBus() {
        // google guava API，该方法会返回一个DirectExecutor类型的实例，调用execute方法并不会另起一个线程，而是当前线程执行
        // 这里使用execute线程的原因是为了兼容异步非阻塞的观察者模式
        this.executor = MoreExecutors.directExecutor();
    }
    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    /**
     * 注册观察者
     * @param observer 观察者
     */
    public void registry(Object observer) {
        registry.registry(observer);
    }

    /**
     * 取消注册的观察者
     * @param observer 要取消的观察者
     */
    public void unRegistry(Object observer) {

    }

    /**
     * 事件发布（通知观察者执行动作）
     * @param event 事件
     */
    public void post(Object event) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<ObserverAction> matchedObserverActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : matchedObserverActions) {
            executor.execute(()->{
                observerAction.invoke(event);
            });
        }
    }

}
