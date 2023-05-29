package com.demo.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomersJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private String INSERT_QUERY = "INSERT INTO CUSTOMERS (id, name, address) VALUES (?, ?, ?)";
    private static String DELETE_QUERY = "DELETE FROM CUSTOMERS WHERE id = ?";
    private static String SELECT_QUERY = "SELECT * FROM CUSTOMERS WHERE id = ?";

    public void insert(Customers customers) {
        springJdbcTemplate.update(INSERT_QUERY, customers.getId(), customers.getName(), customers.getAddress());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Customers findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new Object[]{id}, new BeanPropertyRowMapper<>(Customers.class));
    }

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}


