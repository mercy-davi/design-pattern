package com.davi.pattern.adapter.loginadapter.v2;

import com.davi.pattern.adapter.loginadapter.ResultMsg;
import com.davi.pattern.adapter.loginadapter.v1.service.SignInService;
import com.davi.pattern.adapter.loginadapter.v2.adapters.LoginAdapter;
import com.davi.pattern.adapter.loginadapter.v2.adapters.LoginForQQAdapter;
import com.davi.pattern.adapter.loginadapter.v2.adapters.LoginForTelAdapter;
import com.davi.pattern.adapter.loginadapter.v2.adapters.LoginForTokenAdapter;
import com.davi.pattern.adapter.loginadapter.v2.adapters.LoginForWechatAdapter;

/**
 * 结合策略模式、工厂模式、适配器模式
 *
 * @Date 2021/6/2 0:30
 * @Created by hdw
 */
public class PassportForThirdAdapter extends SignInService implements IPassportForThird {

    public ResultMsg loginForQQ(String id) {
//        return processLogin(id, RegisterForQQAdapter.class);
        return processLogin(id, LoginForQQAdapter.class);
    }

    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelephone(String telephone, String code) {
        return processLogin(telephone, LoginForTelAdapter.class);
    }

    public ResultMsg loginForRegister(String username, String passport) {
        super.register(username, passport);
        return super.login(username, passport);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            //适配器不一定要实现接口
            LoginAdapter adapter = clazz.newInstance();

            //判断传过来的适配器是否能处理指定的逻辑
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //类图的快捷键  Ctrl + Alt + Shift + U
}
