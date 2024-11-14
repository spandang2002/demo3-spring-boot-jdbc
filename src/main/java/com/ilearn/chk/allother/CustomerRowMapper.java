package com.ilearn.chk.allother;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
        Customer cust = new Customer();
        cust.setCid(rs.getInt("cid"));
        cust.setCname(rs.getString("cname"));
        cust.setEmail(rs.getString("email"));
        cust.setPhone(rs.getInt("phone"));
        cust.setCity(rs.getString("city"));
        return cust;
    }
}
