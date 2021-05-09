package com.davi.pattern.factory.factorymethod;

import com.davi.pattern.factory.HuaWeiPhone;
import com.davi.pattern.factory.Phone;

/**
 * @Date 2021/5/9 20:56
 * @Created by hdw
 */
public class HuaWeiPhoneFactory implements PhoneFactory {

    @Override
    public Phone create() {
        return new HuaWeiPhone();
    }
}
