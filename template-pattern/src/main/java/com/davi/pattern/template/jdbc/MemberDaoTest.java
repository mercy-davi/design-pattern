package com.davi.pattern.template.jdbc;

import com.davi.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @Date 2021/5/31 23:30
 * @Created by hdw
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
