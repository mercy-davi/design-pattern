package com.davi.pattern.factory;

/**
 * @Date 2021/5/10 0:35
 * @Created by hdw
 */
public class HuaWeiEarPhone implements EarPhone {

    @Override
    public void listenMusic() {
        System.out.println("我在用华为耳机听歌");
    }
}
