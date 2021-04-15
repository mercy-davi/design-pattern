package com.davi.pattern.singleton.hungry;

/**
 * @Description 饿汉式单例：在单例类首次加载时就创建实例
 * 缺点：没用到时也创建了，随着单例类越来越多，浪费内存空间
 * @Date 2021/2/15 10:22
 * @Created by hdw
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;// 加final防止被其他方式改掉，例如反射机制

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
