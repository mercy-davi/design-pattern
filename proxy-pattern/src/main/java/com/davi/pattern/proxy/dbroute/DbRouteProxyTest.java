package com.davi.pattern.proxy.dbroute;

import com.davi.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Date 2021/5/19 23:02
 * @Created by hdw
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
//        order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2020/05/20");
            order.setCreateTime(date.getTime());

//            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
