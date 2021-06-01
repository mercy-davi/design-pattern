package com.davi.pattern.adapter.loginadapter.v1.service;


import com.davi.pattern.adapter.loginadapter.Member;
import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Date 2021/6/2 0:20
 * @Created by hdw
 */
public class SignInService {

    /**
     * 注册方法
     *
     * @param username 用户名
     * @param password 密码
     * @return 返回结果
     */
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }


    /**
     * 登录的方法
     *
     * @param username 用户名
     * @param password 密码
     * @return 返回结果
     */
    public ResultMsg login(String username, String password) {
        return null;
    }

}
