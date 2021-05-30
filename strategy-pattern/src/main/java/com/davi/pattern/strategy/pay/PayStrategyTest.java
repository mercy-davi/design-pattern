package com.davi.pattern.strategy.pay;

import com.davi.pattern.strategy.pay.payport.PayStrategy;

import java.math.BigDecimal;

/**
 * @Date 2021/5/30 23:40
 * @Created by hdw
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "2021053000001", new BigDecimal("324.45"));
//        MsgResult result = order.pay(PayStrategy.ALI_PAY);
        MsgResult result = order.pay(PayStrategy.UNION_PAY);
        System.out.println(result);
    }
}
