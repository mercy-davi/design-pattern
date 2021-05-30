package com.davi.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2021/5/30 20:01
 * @Created by hdw
 */
public class Leader {
    // 预先知道每个员工的特长、特征，再进行分发任务。

    private final Map<String, IEmployee> register = new HashMap<>();

    public Leader() {
        register.put("加密", new EmployeeA());
        register.put("架构", new EmployeeB());
    }

    public void doing(String command) {
        register.get(command).doing(command);
    }
}
