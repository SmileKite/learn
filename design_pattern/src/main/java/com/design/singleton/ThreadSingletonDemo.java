package com.design.singleton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 线程间唯一（非进程唯一）单例
 * @author lizhenyu
 * @date 2021/6/14
 */
public class ThreadSingletonDemo {

    private static final ConcurrentHashMap<Long, ThreadSingletonDemo> instances = new ConcurrentHashMap<>();
    private ThreadSingletonDemo(){}
    public static ThreadSingletonDemo getInstance() {
        long id = Thread.currentThread().getId();
        instances.putIfAbsent(id, new ThreadSingletonDemo());
        return instances.get(id);
    }

}
