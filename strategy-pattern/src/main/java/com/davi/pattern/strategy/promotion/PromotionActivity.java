package com.davi.pattern.strategy.promotion;

/**
 * @Date 2021/5/30 21:55
 * @Created by hdw
 */
public class PromotionActivity {
    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        this.promotionStrategy.doPromotion();
    }

}
