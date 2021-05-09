package com.davi.pattern.factory.factorymethod;

import com.davi.pattern.factory.ApplePhone;
import com.davi.pattern.factory.Phone;

/**
 * @Date 2021/5/9 20:55
 * @Created by hdw
 */
public class ApplePhoneFactory implements PhoneFactory {

    @Override
    public Phone create() {
        return new ApplePhone();
    }
}
