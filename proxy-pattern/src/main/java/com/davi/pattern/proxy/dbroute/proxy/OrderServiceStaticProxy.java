package com.davi.pattern.proxy.dbroute.proxy;

import com.davi.pattern.proxy.dbroute.IOrderService;
import com.davi.pattern.proxy.dbroute.Order;
import com.davi.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Date 2021/5/19 22:54
 * @Created by hdw
 */
public class OrderServiceStaticProxy implements IOrderService {
    private final SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private final IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        // 真正调用前根据订单创建时间切库
        Long createTime = order.getCreateTime();
        int dbRouter = Integer.parseInt(yearFormat.format(new Date(createTime)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理");
        DynamicDataSourceEntity.set(dbRouter);

        this.orderService.createOrder(order);

        DynamicDataSourceEntity.restore();

        return 0;
    }
}
