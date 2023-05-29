package com.demo.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private String INSERT_QUERY = "INSERT INTO student (id, name, address) VALUES (?, ?, ?)";
    private static String DELETE_QUERY = "DELETE FROM student WHERE id = ?";
    private static String SELECT_QUERY = "SELECT * FROM student WHERE id = ?";

    public void insert(Student student) {
        springJdbcTemplate.update(INSERT_QUERY, student.getId(), student.getName(), student.getAddress());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Student findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
    }

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}


