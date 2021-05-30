package com.davi.pattern.strategy.pay;

/**
 * @Date 2021/5/30 23:07
 * @Created by hdw
 */
public class MsgResult {
    private int code;
    private String msg;
    private Object data;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "支付状态：[" + code + "]," + msg +
                "交易详情：" + data;
    }
}
