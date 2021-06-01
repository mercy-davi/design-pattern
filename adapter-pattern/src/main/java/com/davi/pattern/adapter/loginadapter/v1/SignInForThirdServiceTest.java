package com.davi.pattern.adapter.loginadapter.v1;


import com.davi.pattern.adapter.loginadapter.v1.service.SignInForThirdService;

/**
 * @Date 2021/6/2 0:19
 * @Created by hdw
 */
public class SignInForThirdServiceTest {
    public static void main(String[] args) {
        SignInForThirdService service = new SignInForThirdService();
        service.login("tom", "123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
