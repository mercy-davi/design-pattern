package com.davi.pattern.factory.factorymethod;

import com.davi.pattern.factory.Phone;

/**
 * @Date 2021/5/9 21:07
 * @Created by hdw
 */
public abstract class AbstractPhoneFactory {

    /**
     * 创建前的复杂准备工作
     */
    public void preCreate() {
    }

    abstract Phone create();
}
