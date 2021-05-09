package com.davi.pattern.factory;

/**
 * @Date 2021/5/9 20:49
 * @Created by hdw
 */
public class ApplePhone implements Phone {

    @Override
    public void photo() {
        System.out.println("我在用苹果手机拍照");
    }
}
