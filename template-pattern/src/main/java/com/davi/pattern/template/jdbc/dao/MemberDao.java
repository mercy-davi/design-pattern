package com.davi.pattern.template.jdbc.dao;

import com.davi.pattern.template.jdbc.JdbcTemplate;
import com.davi.pattern.template.jdbc.Member;
import com.davi.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Date 2021/5/31 22:39
 * @Created by hdw
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, (RowMapper<Member>) (rs, rowNum) -> {
            Member member = new Member();
            // 字段过多，可以采用原型模式解决
            member.setUserName(rs.getString("user_name"));
            member.setPassword(rs.getString("password"));
            member.setAge(rs.getInt("age"));
            member.setAddress("address");
            return member;
        }, null);
    }
}
