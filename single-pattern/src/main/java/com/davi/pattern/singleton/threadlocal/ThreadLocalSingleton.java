package com.davi.pattern.singleton.threadlocal;

/**
 * @Date 2021/4/19 23:56
 * @Created by hdw
 */
// 伪线程安全，只在线程间安全
// 注册式单例(容器式,底层用ThreadLocalMap存储,key为currentThread本身，值为initialValue方法中的值)
// 使用ThreadLocal来实现多数据源动态切换
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {

    }

//    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE =
//            new ThreadLocal<ThreadLocalSingleton>() {
//                @Override
//                protected ThreadLocalSingleton initialValue() {
//                    return new ThreadLocalSingleton();
//                }
//            };

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL_INSTANCE.get();
    }
}
