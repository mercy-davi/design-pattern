package com.davi.pattern.proxy.dynamicproxy.jdkproxy;

import com.davi.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * @Date 2021/5/19 23:58
 * @Created by hdw
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Object obj = new JDKMatchMaker().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove");
            method.invoke(obj);

            // 动态代理原理：动态生成字节码、字节码重组（代理类）
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
