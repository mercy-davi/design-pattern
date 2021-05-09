package com.davi.pattern.factory;

/**
 * @Date 2021/5/9 19:52
 * @Created by hdw
 */
public class HuaWeiPhone implements Phone {

    @Override
    public void photo() {
        System.out.println("我在用华为手机拍照");
    }
}
