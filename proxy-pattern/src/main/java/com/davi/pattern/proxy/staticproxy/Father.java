package com.davi.pattern.proxy.staticproxy;

import com.davi.pattern.proxy.Person;

/**
 * @Date 2021/5/16 23:36
 * @Created by hdw
 */
public class Father {

    private Person person;

    Father(Person person) {
        this.person = person;
    }

    void findLove() {
        System.out.println("父亲筛选对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");
    }
}
