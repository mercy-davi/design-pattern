package com.davi.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2021/5/31 21:25
 * @Created by hdw
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            // 1、获取连接
            Connection conn = this.getConnection();
            // 2、创建语句集
            PreparedStatement preparedStatement = this.createPrepareStatement(conn, sql);
            // 3、执行语句集
            ResultSet resultSet = this.executeQuery(preparedStatement, values);
            // 4、处理结果集
            // rowMapper类似于钩子函数，对流程进行微调
            List<?> result = this.parseResultSet(resultSet, rowMapper);
            // 5、关闭结果集
            this.closeResultSet(resultSet);
            // 6、关闭语句集
            this.closeStatement(preparedStatement);
            // 7、关闭连接
            this.closeConnection(conn);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void closeConnection(Connection conn) throws Exception {
        // 若为数据库连接池，做回收操作
        // 默认实现为关闭连接，允许覆盖
        conn.close();
    }

    protected void closeStatement(PreparedStatement preparedStatement) throws Exception {
        preparedStatement.close();
    }

    protected void closeResultSet(ResultSet resultSet) throws Exception {
        resultSet.close();
    }

    protected List<?> parseResultSet(ResultSet resultSet, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (resultSet.next()) {
            result.add(rowMapper.mapRow(resultSet, rowNum++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement preparedStatement, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            preparedStatement.setObject(i, values[i]);
        }
        return preparedStatement.executeQuery();
    }

    protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);
    }

    public Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
