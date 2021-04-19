package com.davi.pattern.singleton.test;

import com.davi.pattern.singleton.register.ContainerSingleton;

/**
 * @Date 2021/4/19 23:43
 * @Created by hdw
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object obj = ContainerSingleton.getBean("com.davi.pattern.singleton.bean.Person");
        System.out.println(obj);
    }
}
