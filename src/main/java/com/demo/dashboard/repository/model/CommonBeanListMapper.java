package com.demo.dashboard.repository.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonBeanListMapper implements RowMapper<CommonBean> {

    public CommonBean mapRow(ResultSet rs, int rowNum) throws SQLException {
        CommonBean commonBean = new CommonBean();

        commonBean.setValue(rs.getInt("ID"));
        commonBean.setLabel(rs.getString("DESCRIPTION"));

        return commonBean;
    }

}
