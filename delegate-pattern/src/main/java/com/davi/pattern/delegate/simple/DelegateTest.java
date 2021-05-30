package com.davi.pattern.delegate.simple;

/**
 * @Date 2021/5/30 20:11
 * @Created by hdw
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("加密", new Leader());
//        new Boss().command("架构", new Leader());
    }
}
