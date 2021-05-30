package com.davi.pattern.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * @Date 2021/5/30 23:24
 * @Created by hdw
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected BigDecimal queryBalance(String userId) {
        return new BigDecimal("256");
    }
}
