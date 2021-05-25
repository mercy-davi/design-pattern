package com.davi.pattern.proxy.dynamicproxy.customproxy;

import com.davi.pattern.proxy.dynamicproxy.jdkproxy.Girl;

import java.lang.reflect.Method;

/**
 * @Date 2021/5/19 23:58
 * @Created by hdw
 */
public class CustomProxyTest {
    public static void main(String[] args) {
        try {
            // 代理对象：$Proxy0
            Object obj = new CustomMatchMaker().getInstance(new Girl());
            System.out.println(obj);
            Method method = obj.getClass().getMethod("findLove");
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
