package com.design.eventbus.frame;

import java.util.concurrent.Executor;

/**
 * 异步非阻塞的观察者模式
 * @author lizhenyu
 * @date 2021/6/30
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }

}
