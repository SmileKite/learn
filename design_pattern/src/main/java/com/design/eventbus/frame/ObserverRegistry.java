package com.design.eventbus.frame;

import com.google.common.base.Preconditions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 观察者注册表
 * @author lizhenyu
 * @date 2021/6/30
 */
public class ObserverRegistry {
    /** 注册表 */
    private Map<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();

    /**
     * 注册观察者
     * @param observer 观察者
     */
    public void registry(Object observer) {
        Map<Class<?>, CopyOnWriteArraySet<ObserverAction>> observerActions = findAllObserverActions(observer);
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : observerActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            CopyOnWriteArraySet<ObserverAction> eventObserverAction = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> observerAction = registry.get(eventType);
            if (observerAction == null) {
                observerAction = new CopyOnWriteArraySet<>();
                registry.put(eventType, observerAction);
            }
            observerAction.addAll(eventObserverAction);
        }
    }

    /**
     * 获取匹配的观察者集合
     * @param event 事件
     * @return 观察者集合
     */
    public List<ObserverAction> getMatchedObserverActions(Object event) {
        List<ObserverAction> matchedObservers = new ArrayList<>();
        Class<?> postedType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registry.entrySet()) {
            Class<?> eventType = entry.getKey();
            if (eventType.isAssignableFrom(postedType)) {
                matchedObservers.addAll(entry.getValue());
            }
        }
        return matchedObservers;
    }

    /**
     * 获取指定观察者类的ObserverAction
     * @param observer 观察者类对象
     * @return 观察者注册表
     */
    private Map<Class<?>, CopyOnWriteArraySet<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, CopyOnWriteArraySet<ObserverAction>> map = new ConcurrentHashMap<>();
        Class<?> eventType = observer.getClass();
        for (Method method : getAnnotatedMethods(eventType)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> parameterType = parameterTypes[0];
            if (!map.containsKey(parameterType)) {
                map.putIfAbsent(parameterType, new CopyOnWriteArraySet<>());
            }
            map.get(parameterType).add(new ObserverAction(observer, method));
        }
        return map;
    }

    /**
     * 获取观察者类中符合条件的方法
     * @param clazz 观察者类的Class对象
     * @return 观察者对象
     */
    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> annotatedMethods = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] types = method.getParameterTypes();
                String message = "方法%s有Subscribe注解，存在%s个参数，但是Subscribe标注的方法只允许一个参数！";
                Preconditions.checkArgument(types.length == 1, message, method.getName(), types.length);
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }
}
