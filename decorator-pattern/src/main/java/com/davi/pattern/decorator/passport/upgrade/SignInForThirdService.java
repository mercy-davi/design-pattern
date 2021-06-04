package com.davi.pattern.decorator.passport.upgrade;


import com.davi.pattern.decorator.passport.old.ISignInService;
import com.davi.pattern.decorator.passport.old.ResultMsg;

/**
 * @Date 2021/6/4
 * @Created by hdw
 */
public class SignInForThirdService implements ISignInForThirdService {

    private final ISignInService signInService;

    public SignInForThirdService(ISignInService signInService) {
        this.signInService = signInService;
    }

    public ResultMsg register(String username, String password) {
        return signInService.register(username, password);
    }

    public ResultMsg login(String username, String password) {
        return signInService.login(username, password);
    }

    public ResultMsg loginForQQ(String id) {
        return null;
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelephone(String telephone, String code) {
        return null;
    }

    public ResultMsg loginForRegister(String username, String passport) {
        return null;
    }
}
