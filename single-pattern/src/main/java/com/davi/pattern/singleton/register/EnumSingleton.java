package com.davi.pattern.singleton.register;

/**
 * @Date 2021/4/19 23:07
 * @Created by hdw
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
