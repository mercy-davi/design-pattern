package com.davi.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * @Date 2021/4/18 23:31
 * @Created by hdw
 */
// 反序列化时导致单例破坏
public class SerializableSingleton implements Serializable {
    // 序列化就是把内存中的状态通过转换成字节码的形式
    // 从而转换一个IO流，写入到其他地方（可以是磁盘、网络IO）
    // 内存中的状态给永久保存下来了

    // 反序列化
    // 将已经持久化的字节码内容，转换为IO流
    // 通过IO流的读取，进而将读取的内容转换为Java对象
    // 在转换过程中会重新创建对象（相当于new）

    public final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    // 通过添加readResolve方法解决序列化中单例被破坏的情况，覆盖了反序列化出来的对象
    // 还是创建了两次，发生在JVM层面，相对来说比较安全，之前反序列化出来的对象会被GC回收
    // 在反序列化时，调用readObject方法，底层会判断该类有无构造方法，有则new Instance
    // 创建完后会判断有无readResolve方法，有则调用此方法，覆盖之前创建的对象并返回（JDK后面增加的保护单例不被破坏的机制）
    private Object readResolve() {
        return INSTANCE;
    }
}
