package com.davi.pattern.adapter.loginadapter.v2;

/**
 * @Date 2021/6/2 0:30
 * @Created by hdw
 */
public class PassportTest {

    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");


    }

}
