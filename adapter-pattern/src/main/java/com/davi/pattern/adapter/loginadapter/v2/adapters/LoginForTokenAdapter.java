package com.davi.pattern.adapter.loginadapter.v2.adapters;


import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Date 2021/6/2 0:27
 * @Created by hdw
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
