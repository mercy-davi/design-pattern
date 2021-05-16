package com.davi.pattern.proxy.staticproxy;

import com.davi.pattern.proxy.Person;

/**
 * @Date 2021/5/16 23:36
 * @Created by hdw
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿！");
    }
}
