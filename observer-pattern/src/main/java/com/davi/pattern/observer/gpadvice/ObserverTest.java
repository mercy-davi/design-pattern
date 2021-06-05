package com.davi.pattern.observer.gpadvice;

/**
 * @Date 2021/6/5
 * @Created by hdw
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");


        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        // @Tom老师
        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publishQuestion(question);


    }

}
