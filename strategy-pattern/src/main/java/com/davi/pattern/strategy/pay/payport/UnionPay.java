package com.davi.pattern.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * @Date 2021/5/30 23:24
 * @Created by hdw
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected BigDecimal queryBalance(String userId) {
        return new BigDecimal("120");
    }
}
