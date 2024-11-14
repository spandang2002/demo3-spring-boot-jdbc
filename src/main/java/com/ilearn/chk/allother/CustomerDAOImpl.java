package com.ilearn.chk.allother;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addCustomer(Customer cust) {
        String SQL = "insert into mycustomers values(?,?,?,?,?)";
        jdbcTemplate.update(SQL, cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity());
    }

    @Override
    public List<Customer> getAllCustomers() {
        String SQL = "select * from mycustomers";
        List<Customer> mylist = jdbcTemplate.query(SQL, new CustomerRowMapper());
        return mylist;
    }

    @Override
    public List<Customer> getCustomersByCity(String city) {
        String SQL = "select * from mycustomers where city=?";
        List<Customer> mylist = jdbcTemplate.query(SQL, new CustomerRowMapper(), city);
        return mylist;
    }
}
