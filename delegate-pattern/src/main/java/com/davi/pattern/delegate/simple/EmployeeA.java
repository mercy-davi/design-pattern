package com.davi.pattern.delegate.simple;

/**
 * @Date 2021/5/30 20:03
 * @Created by hdw
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始干活了，擅长加密，执行" + command);
    }
}
