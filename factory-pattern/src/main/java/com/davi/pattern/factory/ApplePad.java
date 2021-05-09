package com.davi.pattern.factory;

/**
 * @Date 2021/5/10 0:36
 * @Created by hdw
 */
public class ApplePad implements Pad {
    @Override
    public void watchTV() {
        System.out.println("我在用苹果pad看电视");
    }
}
