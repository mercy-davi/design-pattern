package com.davi.pattern.factory.abstractfactory;

import com.davi.pattern.factory.EarPhone;
import com.davi.pattern.factory.Pad;
import com.davi.pattern.factory.Phone;

/**
 * @Date 2021/5/10 0:38
 * @Created by hdw
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        HuaWeiElectronProductFactory factory = new HuaWeiElectronProductFactory();
        Phone phone = factory.createPhone();
        phone.photo();
        EarPhone earPhone = factory.createEarPhone();
        earPhone.listenMusic();
        Pad pad = factory.createPad();
        pad.watchTV();
    }
}
