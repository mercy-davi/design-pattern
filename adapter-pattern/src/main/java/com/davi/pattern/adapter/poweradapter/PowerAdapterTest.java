package com.davi.pattern.adapter.poweradapter;

/**
 * @Date 2021/6/1 22:57
 * @Created by hdw
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
