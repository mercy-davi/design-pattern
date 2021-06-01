package com.davi.pattern.adapter.loginadapter.v2.adapters;


import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Date 2021/6/2 0:26
 * @Created by hdw
 */
public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
