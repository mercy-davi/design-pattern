package com.davi.pattern.factory;

/**
 * @Date 2021/5/10 0:35
 * @Created by hdw
 */
public class AppleEarPhone implements EarPhone {

    @Override
    public void listenMusic() {
        System.out.println("我在用苹果耳机听歌");
    }
}
