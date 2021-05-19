package com.davi.pattern.proxy.dbroute.db;

/**
 * @Date 2021/5/19 22:46
 * @Created by hdw
 */
public class DynamicDataSourceEntity {

    private static final String DEFAULT_SOURCE = null;

    private static final ThreadLocal<String> LOCAL = new ThreadLocal<>();

    private DynamicDataSourceEntity() {

    }

    public static String get() {
        return LOCAL.get();
    }

    public static void restore() {
        LOCAL.set(DEFAULT_SOURCE);
    }

    // DB_2018
    // DB_2019
    public static void set(String sourceName) {
        LOCAL.set(sourceName);
    }

    public static void set(int year) {
        LOCAL.set("DB_" + year);
    }
}
