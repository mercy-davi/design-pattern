package com.davi.pattern.prototype.shallow;

import java.util.ArrayList;

/**
 * @Date 2021/5/11 1:05
 * @Created by hdw
 */
public class ShallowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setAge(22);
        student.setName("zhangsan");
        list.add(student);

        ArrayList<Student> list1 = (ArrayList<Student>) list.clone();
        System.out.println(list1);

        System.out.println("********************");

        ShallowClone shallowClone = new ShallowClone();
        ShallowClone shallowClone1 = new ShallowClone();
        ShallowClone clone = shallowClone.clone();
        System.out.println(shallowClone.getList() == clone.getList());
        System.out.println(shallowClone1.getList() == clone.getList());
    }
}
