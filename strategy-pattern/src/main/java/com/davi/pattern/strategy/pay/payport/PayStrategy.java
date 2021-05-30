package com.davi.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2021/5/30 23:33
 * @Created by hdw
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static final Map<String, Payment> PAYMENT_STRATEGY = new HashMap<>();

    static {
        PAYMENT_STRATEGY.put(ALI_PAY, new AliPay());
        PAYMENT_STRATEGY.put(JD_PAY, new JDPay());
        PAYMENT_STRATEGY.put(WECHAT_PAY, new WechatPay());
        PAYMENT_STRATEGY.put(UNION_PAY, new UnionPay());
    }

    private PayStrategy() {

    }

    // 通过统一入口实现动态策略
    public static Payment get(String payType) {
        if (!PAYMENT_STRATEGY.containsKey(payType)) {
            return PAYMENT_STRATEGY.get(DEFAULT_PAY);
        }
        return PAYMENT_STRATEGY.get(payType);
    }

}
