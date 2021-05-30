package com.davi.pattern.strategy.promotion;

/**
 * @Date 2021/5/30 21:40
 * @Created by hdw
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程的价值直接减去优惠券面值抵扣");
    }
}
