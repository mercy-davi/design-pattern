package com.davi.pattern.template.course;

/**
 * @Date 2021/5/31 21:12
 * @Created by hdw
 */
public class JavaCourse extends NetworkCourse {

    @Override
    void checkHomework() {
        System.out.println("检查Java的课后作业");
    }
}
