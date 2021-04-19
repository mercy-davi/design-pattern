package com.davi.pattern.singleton.threadlocal;

/**
 * @Date 2021/4/19 23:56
 * @Created by hdw
 */
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
