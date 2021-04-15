package com.davi.pattern.singleton.test;

import com.davi.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.davi.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @Description 线程类
 * 用两个线程来模拟多线程
 * @Date 2021/2/15 10:35
 * @Created by hdw
 */
public class ExecutorThread implements Runnable {

    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
