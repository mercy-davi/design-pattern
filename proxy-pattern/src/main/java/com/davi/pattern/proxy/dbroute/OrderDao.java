package com.davi.pattern.proxy.dbroute;

/**
 * @Date 2021/5/19 22:36
 * @Created by hdw
 */
public class OrderDao {

    public int insert(Order order) {
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
