package com.davi.pattern.decorator.battercake.v1;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class BatterCakeTest {
    public static void main(String[] args) {

        BatterCake battercake = new BatterCake();
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() + ",总价格：" + batterCakeWithEgg.getPrice());

        BatterCake batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg() + ",总价格：" + batterCakeWithEggAndSausage.getPrice());

    }

}
