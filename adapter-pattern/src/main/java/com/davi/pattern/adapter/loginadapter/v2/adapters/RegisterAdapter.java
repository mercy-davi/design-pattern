package com.davi.pattern.adapter.loginadapter.v2.adapters;


import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Date 2021/6/2 0:31
 * @Created by hdw
 */
public interface RegisterAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
