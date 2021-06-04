package com.davi.pattern.decorator.battercake.v2;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public abstract class BatterCakeDecorator extends BatterCake {

    // 静态代理，委派
    private final BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
