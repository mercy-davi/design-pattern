package com.davi.pattern.proxy.dynamicproxy.jdkproxy;

import com.davi.pattern.proxy.Person;

/**
 * @Date 2021/5/19 23:50
 * @Created by hdw
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
