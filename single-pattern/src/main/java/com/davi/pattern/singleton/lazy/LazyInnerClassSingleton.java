package com.davi.pattern.singleton.lazy;

/**
 * @Description 内部类单例
 * 全程没有使用synchronized
 * 性能最优的写法
 * @Date 2021/2/23 23:55
 * @Created by hdw
 */
public class LazyInnerClassSingleton {

    // 虽然构造方法私有了，但是，逃不过反射的法眼
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new IllegalStateException("不允许构建多个实例");
        }

    }

    // 懒汉式单例
    // LazyHolder里面的逻辑需要等到外部方法调用时才执行
    // 巧妙利用了内部类的特性
    // JVM底层执行逻辑，完美地避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
