package com.davi.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2021/5/11 22:54
 * @Created by hdw
 */
public class ShallowClone implements Cloneable {

    public ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }

    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
