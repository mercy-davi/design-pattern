package com.davi.pattern.decorator.battercake.v2;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class BaseBatterCake extends BatterCake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
