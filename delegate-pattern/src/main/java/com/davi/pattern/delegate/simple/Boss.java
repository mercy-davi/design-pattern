package com.davi.pattern.delegate.simple;

/**
 * @Date 2021/5/30 20:00
 * @Created by hdw
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
