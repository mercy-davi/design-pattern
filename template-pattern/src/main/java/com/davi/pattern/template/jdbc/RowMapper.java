package com.davi.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * ORM映射定制化的接口
 *
 * @Date 2021/5/31 21:24
 * @Created by hdw
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
