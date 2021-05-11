package com.davi.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @Date 2021/5/11 23:41
 * @Created by hdw
 */
public class JinGuBang implements Serializable {
    public float h = 100f;
    public float d = 10f;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
