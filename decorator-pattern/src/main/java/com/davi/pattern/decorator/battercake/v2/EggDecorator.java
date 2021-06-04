package com.davi.pattern.decorator.battercake.v2;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class EggDecorator extends BatterCakeDecorator {
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
