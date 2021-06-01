package com.davi.pattern.adapter.loginadapter.v1.service;


import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Date 2021/6/2 0:20
 * @Created by hdw
 */
public class SignInForThirdService extends SignInService {

    public ResultMsg loginForQQ(String openId) {
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）

        //4、调用原来的登录方法

        return loginForRegister(openId, null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        //通过token拿到用户信息，然后再重新登陆了一次
        return null;
    }

    public ResultMsg loginForTelephone(String telephone, String code) {

        return null;
    }

    public ResultMsg loginForRegister(String username, String password) {
        super.register(username, null);
        return super.login(username, null);
    }
}
