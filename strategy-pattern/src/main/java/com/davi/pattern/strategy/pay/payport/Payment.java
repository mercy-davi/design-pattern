package com.davi.pattern.strategy.pay.payport;

import com.davi.pattern.strategy.pay.MsgResult;

import java.math.BigDecimal;

/**
 * @Date 2021/5/30 23:16
 * @Created by hdw
 */
public abstract class Payment {

    public abstract String getName();

    protected abstract BigDecimal queryBalance(String userId);

    public MsgResult pay(String userId, BigDecimal amount) {
        if (queryBalance(userId).compareTo(amount) < 0) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额为：" + amount);
    }
}
