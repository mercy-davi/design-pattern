package com.davi.pattern.singleton.test;

import com.davi.pattern.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @Date 2021/4/19 23:08
 * @Created by hdw
 */
public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton s1;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//        s2.setData(new Object());
//
//        FileOutputStream fos;
//        try {
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            // JDK底层通过Class对象和类名进项查找并返回的，JVM只能找到唯一一个
//            // Enum<?> en = Enum.valueOf((Class)cl, name);
//            s1 = (EnumSingleton) ois.readObject();
//            ois.close();
//
//            System.out.println(s1.getData());
//            System.out.println(s2.getData());
//            System.out.println(s1.getData() == s2.getData());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            Class<EnumSingleton> clazz = EnumSingleton.class;
            Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            // Cannot reflectively create enum objects
            // 从JDK层面就为枚举不被序列化和反射破坏来保护护航
            EnumSingleton obj = constructor.newInstance("davi", 666);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
