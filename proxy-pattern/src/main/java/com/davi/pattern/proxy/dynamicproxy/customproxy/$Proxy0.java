package com.davi.pattern.proxy.dynamicproxy.customproxy;

import com.davi.pattern.proxy.Person;

import java.lang.reflect.*;

public class $Proxy0 implements com.davi.pattern.proxy.Person {
    CustomInvocationHandler h;

    public $Proxy0(CustomInvocationHandler h) {
        this.h = h;
    }

    public void findLove() {
        try {
            Method m = com.davi.pattern.proxy.Person.class.getMethod("findLove", new Class[]{});
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
