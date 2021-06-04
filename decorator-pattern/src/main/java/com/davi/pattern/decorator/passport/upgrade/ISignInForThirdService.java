package com.davi.pattern.decorator.passport.upgrade;

import com.davi.pattern.decorator.passport.old.ISignInService;
import com.davi.pattern.decorator.passport.old.ResultMsg;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public interface ISignInForThirdService extends ISignInService {

    /**
     * QQ登录
     * @param id id
     * @return 登录结果
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id id
     * @return 登录结果
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token token
     * @return 登录结果
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telephone 手机
     * @param code code
     * @return 登录结果
     */
    ResultMsg loginForTelephone(String telephone, String code);

    /**
     * 注册后自动登录
     * @param username 用户名
     * @param passport 密码
     * @return 登录结果
     */
    ResultMsg loginForRegister(String username, String passport);
}
