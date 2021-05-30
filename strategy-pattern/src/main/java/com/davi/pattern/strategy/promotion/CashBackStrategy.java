package com.davi.pattern.strategy.promotion;

/**
 * @Date 2021/5/30 21:51
 * @Created by hdw
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返现金额直接转到支付宝账号");
    }
}
