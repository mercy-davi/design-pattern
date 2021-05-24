package com.davi.pattern.proxy.dynamicproxy.jdkproxy;

import com.davi.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Date 2021/5/19 23:52
 * @Created by hdw
 */
public class JDKMatchMaker implements InvocationHandler {
    private Object target;

    public Object getInstance(Person person) throws Exception {
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("OK的话，准备办事");
    }
}
