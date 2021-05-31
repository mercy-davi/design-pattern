package com.davi.pattern.template.course;

/**
 * @Date 2021/5/31 21:19
 * @Created by hdw
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("---Java架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
