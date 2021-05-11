package com.davi.pattern.prototype.deep;

/**
 * @Date 2021/5/11 23:55
 * @Created by hdw
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallow(q);
        System.out.println("浅克隆：" + (q.jinGuBang == n.jinGuBang));
    }
}
