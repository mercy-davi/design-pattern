package com.davi.pattern.adapter.loginadapter.v2.adapters;


import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Date 2021/6/2 0:25
 * @Created by hdw
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
