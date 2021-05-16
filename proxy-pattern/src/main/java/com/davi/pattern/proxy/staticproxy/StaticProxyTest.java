package com.davi.pattern.proxy.staticproxy;

/**
 * @Date 2021/5/16 23:38
 * @Created by hdw
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
