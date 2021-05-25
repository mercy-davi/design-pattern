package com.davi.pattern.proxy.dbroute.proxy;

import com.davi.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Date 2021/5/19 22:54
 * @Created by hdw
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private final SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private Object proxyObject;

    public Object getInstance(Object proxyObject) {
        this.proxyObject = proxyObject;
        Class<?> clazz = proxyObject.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxyObject, args);
        after();
        return object;
    }

    // target 为订单对象Order
    private void before(Object target) {
        try {
            // 进行数据源切换
            System.out.println("Proxy before method");
            // 约定优于配置
            Long createTime = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            int dbRouter = Integer.parseInt(yearFormat.format(new Date(createTime)));
            System.out.println("动态代理类自动分配到【DB_" + dbRouter + "】数据源处理");
            DynamicDataSourceEntity.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void after() {
        // 还原为默认的数据源
        System.out.println("Proxy after method");
        DynamicDataSourceEntity.restore();
    }
}
