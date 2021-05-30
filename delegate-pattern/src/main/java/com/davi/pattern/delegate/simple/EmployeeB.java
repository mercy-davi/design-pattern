package com.davi.pattern.delegate.simple;

/**
 * @Date 2021/5/30 20:03
 * @Created by hdw
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我开始干活了，擅长架构，执行" + command);
    }
}
