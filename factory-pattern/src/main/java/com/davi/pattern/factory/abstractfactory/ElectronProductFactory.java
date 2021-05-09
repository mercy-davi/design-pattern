package com.davi.pattern.factory.abstractfactory;

import com.davi.pattern.factory.EarPhone;
import com.davi.pattern.factory.Pad;
import com.davi.pattern.factory.Phone;
import org.springframework.beans.factory.support.AbstractBeanFactory;

/**
 * @see AbstractBeanFactory
 * @Date 2021/5/9 21:53
 * @Created by hdw
 */
// 要求所有的子工厂都实现这个工厂
// (一个品牌的抽象)
// 抽象工厂不符合开闭原则
// 扩展性非常强
public interface ElectronProductFactory {

    Phone createPhone();

    EarPhone createEarPhone();

    Pad createPad();
}
