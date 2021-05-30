package com.davi.pattern.strategy.promotion;

/**
 * @Date 2021/5/30 21:54
 * @Created by hdw
 */
public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }
}
