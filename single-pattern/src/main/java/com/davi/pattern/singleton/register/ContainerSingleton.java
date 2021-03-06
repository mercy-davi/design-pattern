package com.davi.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Date 2021/4/19 23:34
 * @Created by hdw
 */
public class ContainerSingleton {
    private ContainerSingleton() {

    }

    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();

    // 对象方便管理，其实也是属于懒加载
    // 存在线程安全问题，用synchronized解决
    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }
}
