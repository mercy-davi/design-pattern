package com.davi.pattern.proxy.dynamicproxy.customproxy;

import com.davi.pattern.proxy.Person;

import java.lang.reflect.Method;

/**
 * @Date 2021/5/20 23:13
 * @Created by hdw
 */
public class CustomMatchMaker implements CustomInvocationHandler {
    private Person target;

    public Object getInstance(Person person) throws Exception {
        this.target = person;
        Class<?> clazz = target.getClass();
        return CustomProxy.newProxyInstance(new CustomClassLoader(), clazz.getInterfaces(), this);
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
