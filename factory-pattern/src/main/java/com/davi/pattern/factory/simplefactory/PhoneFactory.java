package com.davi.pattern.factory.simplefactory;

import com.davi.pattern.factory.Phone;

/**
 * @Date 2021/5/9 19:55
 * @Created by hdw
 */
public class PhoneFactory {

//    public Phone create(String name) {
//        if ("华为".equals(name)) {
//            return new HuaWeiPhone();
//        }
//        return null;
//    }

//    public Phone create(String className) {
//        try {
//            if (!(className == null || "".equals(className))) {
//                return (Phone) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public Phone create(Class clazz) {
        try {
            if (clazz != null) {
                return (Phone) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
