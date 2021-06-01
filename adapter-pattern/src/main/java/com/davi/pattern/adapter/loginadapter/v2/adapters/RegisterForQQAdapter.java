package com.davi.pattern.adapter.loginadapter.v2.adapters;


import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Date 2021/6/2 0:31
 * @Created by hdw
 */
public class RegisterForQQAdapter implements RegisterAdapter, LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
