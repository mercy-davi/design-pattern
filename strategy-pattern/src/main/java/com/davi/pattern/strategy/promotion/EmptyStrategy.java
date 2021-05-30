package com.davi.pattern.strategy.promotion;

/**
 * 无优惠
 *
 * @Date 2021/5/30 21:38
 * @Created by hdw
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
