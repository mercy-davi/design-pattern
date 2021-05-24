package com.davi.pattern.proxy.dynamicproxy.customproxy;

import com.davi.pattern.proxy.Person;
import com.davi.pattern.proxy.dynamicproxy.jdkproxy.Girl;
import com.davi.pattern.proxy.dynamicproxy.jdkproxy.JDKMatchMaker;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * @Date 2021/5/19 23:58
 * @Created by hdw
 */
public class CustomProxyTest {
    public static void main(String[] args) {
        try {
            Object obj = new CustomMatchMaker().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove");
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
