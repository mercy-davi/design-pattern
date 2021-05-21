package com.davi.pattern.proxy.dynamicproxy.customproxy;

import java.lang.reflect.Method;

/**
 * @Date 2021/5/20 22:56
 * @Created by hdw
 */
public interface CustomInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
