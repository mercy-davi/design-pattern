package com.davi.pattern.factory.abstractfactory;

import com.davi.pattern.factory.EarPhone;
import com.davi.pattern.factory.HuaWeiEarPhone;
import com.davi.pattern.factory.HuaWeiPad;
import com.davi.pattern.factory.HuaWeiPhone;
import com.davi.pattern.factory.Pad;
import com.davi.pattern.factory.Phone;

/**
 * @Date 2021/5/10 0:34
 * @Created by hdw
 */
public class HuaWeiElectronProductFactory implements ElectronProductFactory {

    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public EarPhone createEarPhone() {
        return new HuaWeiEarPhone();
    }

    @Override
    public Pad createPad() {
        return new HuaWeiPad();
    }
}
