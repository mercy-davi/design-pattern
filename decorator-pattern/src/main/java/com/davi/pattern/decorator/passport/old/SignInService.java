package com.davi.pattern.decorator.passport.old;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class SignInService implements ISignInService {

    public ResultMsg register(String username,String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录的方法
     * @param username 用户名
     * @param password 密码
     * @return 登录结果
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
