package com.davi.pattern.factory.factorymethod;

import com.davi.pattern.factory.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Date 2021/5/9 20:57
 * @Created by hdw
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        HuaWeiPhoneFactory factory = new HuaWeiPhoneFactory();
        Phone phone = factory.create();
        phone.photo();

        // 举例 LoggerFactory#getILoggerFactory()
        Logger logger = LoggerFactory.getLogger(FactoryMethodTest.class);
    }
}
