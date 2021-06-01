package com.davi.pattern.adapter.loginadapter.v2;


import com.davi.pattern.adapter.loginadapter.ResultMsg;

/**
 * 只扩展
 *
 * @Date 2021/6/2 0:28
 * @Created by hdw
 */
public interface IPassportForThird {

    /**
     * QQ登录
     *
     * @param id id
     * @return 返回结果
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     *
     * @param id id
     * @return 返回结果
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     *
     * @param token token
     * @return 返回结果
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     *
     * @param telephone 手机号
     * @param code      code
     * @return 返回结果
     */
    ResultMsg loginForTelephone(String telephone, String code);

    /**
     * 注册后自动登录
     *
     * @param username 用户名
     * @param passport 密码
     * @return 返回结果
     */
    ResultMsg loginForRegister(String username, String passport);
}
