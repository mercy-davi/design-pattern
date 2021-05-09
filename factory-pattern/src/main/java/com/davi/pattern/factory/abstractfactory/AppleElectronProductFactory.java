package com.davi.pattern.factory.abstractfactory;

import com.davi.pattern.factory.AppleEarPhone;
import com.davi.pattern.factory.ApplePad;
import com.davi.pattern.factory.ApplePhone;
import com.davi.pattern.factory.EarPhone;
import com.davi.pattern.factory.Pad;
import com.davi.pattern.factory.Phone;

/**
 * @Date 2021/5/10 0:32
 * @Created by hdw
 */
public class AppleElectronProductFactory implements ElectronProductFactory {

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public EarPhone createEarPhone() {
        return new AppleEarPhone();
    }

    @Override
    public Pad createPad() {
        return new ApplePad();
    }
}
