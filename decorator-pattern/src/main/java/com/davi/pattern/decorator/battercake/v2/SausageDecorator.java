package com.davi.pattern.decorator.battercake.v2;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
