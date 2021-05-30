package com.davi.pattern.strategy.pay;

import com.davi.pattern.strategy.pay.payport.PayStrategy;
import com.davi.pattern.strategy.pay.payport.Payment;

import java.math.BigDecimal;

/**
 * @Date 2021/5/30 23:04
 * @Created by hdw
 */
public class Order {
    private String userId;
    private String orderId;
    private BigDecimal amount;

    public Order(String userId, String orderId, BigDecimal amount) {
        this.userId = userId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payType) {
        Payment payment = PayStrategy.get(payType);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "，开始扣款...");
        return payment.pay(userId, amount);
    }
}
