package com.davi.pattern.observer.gpadvice;

import java.util.Observable;

/**
 * JDK提供的一种观察者的实现方式，被观察者
 *
 * @Date 2021/6/5
 * @Created by hdw
 */
public class GPer extends Observable {

    private final String name = "GPer生态圈";
    private static GPer gper = null;

    private GPer() {
    }

    public static GPer getInstance() {
        if (null == gper) {
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
