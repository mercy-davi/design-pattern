package com.davi.pattern.decorator.passport.old;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public interface ISignInService {
    ResultMsg register(String username, String password);


    /**
     * 登录的方法
     * @param username 用户名
     * @param password 密码
     * @return 登录结果
     */
    ResultMsg login(String username, String password);
}
