package com.davi.pattern.adapter.poweradapter;

/**
 * @Date 2021/6/1 22:54
 * @Created by hdw
 */
public class PowerAdapter implements DC5 {
    // 持有引用，类似静态代理
    private final AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC：" + adapterInput + "V, 输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
