package com.davi.pattern.strategy.promotion;

/**
 * @Date 2021/5/30 22:03
 * @Created by hdw
 */
public class PromotionActivityTest {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = new PromotionActivity(new CouponStrategy());
//        promotionActivity.execute();
//        PromotionActivity promotionActivity1 = new PromotionActivity(new CashBackStrategy());
//        promotionActivity1.execute();
//    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity;
//        String promotionType = args[0];
//
//        if ("Coupon".equals(promotionType)) {
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        } else if ("CashBack".equals(promotionType)) {
//            promotionActivity = new PromotionActivity(new CashBackStrategy());
//        } else if ("GroupBuy".equals(promotionType)) {
//            promotionActivity = new PromotionActivity(new GroupBuyStrategy());
//        } else {
//            promotionActivity = new PromotionActivity(new EmptyStrategy());
//        }
//        promotionActivity.execute();
//    }

    public static void main(String[] args) {
        String promotionType = "Coupon";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory
                .getPromotionStrategy(promotionType));
        promotionActivity.execute();
    }
}
