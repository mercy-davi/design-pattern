package com.davi.pattern.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * @Date 2021/5/30 23:20
 * @Created by hdw
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected BigDecimal queryBalance(String userId) {
        return new BigDecimal("900");
    }
}
