package com.davi.pattern.singleton.lazy;

/**
 * @Description 双重检查锁单例
 * @Date 2021/2/15 11:19
 * @Created by hdw
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {// 1.若无此判断，其他线程进不来 // 2.考虑到效率问题
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {// 若无此判断会看到假象，是同一个对象，但实际被new了两次
                    // 线程1和2同时进入第一层if，此时假设线程1先拿到锁并执行完同步代码块释放锁，
                    // 此时线程2拿到执行权获取锁，若无判空，则会再次new一个实例
                    lazy = new LazyDoubleCheckSingleton();
                    // 存在指令重排序问题【使用关键字volatile,在申明的静态对象lazy前加上volatile】
                    // CPU执行时会转换成JVM指令执行
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.将初始化好的对象和内存地址建立关联并赋值
                    // 4.用户初次访问
                }
            }
        }
        return lazy;
    }
}
