package com.davi.pattern.factory.simplefactory;

import com.davi.pattern.factory.HuaWeiPhone;
import com.davi.pattern.factory.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * @Date 2021/5/9 19:55
 * @Created by hdw
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
          // 产品过多时有大量的new Xxx代码,引入工厂，将复杂的创建过程隐藏，调用者无需关系具体细节
//        Phone phone = new HuaWeiPhone();
//        phone.photo();

        PhoneFactory phoneFactory = new PhoneFactory();
          // 名字容易写错，不可控
//        Phone phone = phoneFactory.create("华为");
          // 依旧没有解决类名易传错问题
//        Phone phone = phoneFactory.create("com.davi.pattern.factory.HuaWeiPhone");
        Phone phone = phoneFactory.create(HuaWeiPhone.class);
        phone.photo();

        // 举例
        Calendar calendar = Calendar.getInstance();
        Logger logger = LoggerFactory.getLogger("com.davi.pattern.factory.simplefactory.SimpleFactoryTest");
        Logger logger1 = LoggerFactory.getLogger(SimpleFactoryTest.class);
    }
}
