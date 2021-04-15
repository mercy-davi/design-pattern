package com.davi.pattern.singleton.test;

import com.davi.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @Description TODO
 * @Date 2021/4/15 0:10
 * @Created by hdw
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            // 调用者装13，不走寻常路，显然破坏了单例
//            Class<?> clazz = LazyInnerClassSingleton.class;
//            Constructor constructor = clazz.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            Object o1 = constructor.newInstance();

            // 乖乖走正常渠道
            Object o2 = LazyInnerClassSingleton.getInstance();

//            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
