package com.davi.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2021/5/30 22:17
 * @Created by hdw
 */
public class PromotionStrategyFactory {

    private static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    private static final PromotionStrategy NONE_PROMOTION = new EmptyStrategy();

    private PromotionStrategyFactory() {}

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionType.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionType.CASH_BACK, new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionType.GROUP_BUY, new GroupBuyStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String promotionType) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionType);
        return promotionStrategy == null ? NONE_PROMOTION : promotionStrategy;
    }

    private interface PromotionType {
        String COUPON = "Coupon";
        String CASH_BACK = "CashBack";
        String GROUP_BUY = "GroupBuy";
    }
}
