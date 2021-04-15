package com.davi.pattern.singleton.test;

import com.davi.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @Description 懒汉式单例测试类
 * @Date 2021/2/15 10:31
 * @Created by hdw
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End...");
    }
}
