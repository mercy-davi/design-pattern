package com.davi.pattern.decorator.battercake.v1;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    //加一个鸡蛋加1块钱
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
