package com.davi.pattern.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * @Date 2021/5/30 23:22
 * @Created by hdw
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected BigDecimal queryBalance(String userId) {
        return new BigDecimal("500");
    }
}
