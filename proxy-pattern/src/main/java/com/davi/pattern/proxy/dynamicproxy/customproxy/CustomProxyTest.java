package com.davi.pattern.proxy.dynamicproxy.customproxy;

import com.davi.pattern.proxy.Person;
import com.davi.pattern.proxy.dynamicproxy.jdkproxy.Girl;
import com.davi.pattern.proxy.dynamicproxy.jdkproxy.JDKMatchMaker;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Date 2021/5/19 23:58
 * @Created by hdw
 */
public class CustomProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new CustomMatchMaker().getInstance(new Girl());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
