package com.davi.pattern.singleton.lazy;

/**
 * @Description 懒汉式单例
 * @Date 2021/2/15 10:24
 * @Created by hdw
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {

    }

    // 解决线程安全问题方式一：同步方法
    // 尽管jdk1.6之后对synchronized性能优化了不少，
    // 但不可避免地还是存在一定的性能问题（synchronized加在静态方法上，可能导致整个类都被锁）
    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
