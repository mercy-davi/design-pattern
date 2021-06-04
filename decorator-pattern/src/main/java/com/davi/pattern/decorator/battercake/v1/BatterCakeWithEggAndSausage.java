package com.davi.pattern.decorator.battercake.v1;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    //加一个香肠加2块钱
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
