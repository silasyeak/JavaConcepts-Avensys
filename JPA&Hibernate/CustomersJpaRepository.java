package com.demo.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class CustomersJpaRepository {
    @PersistenceContext
    private final EntityManager entityManager;
    
    public CustomersJpaRepository(EntityManager entityManager) {
    	this.entityManager = entityManager;
    }
    public void insert(Customers customers) {
    	entityManager.merge(customers);
    }
    public Customers findById(long id) {
    	return entityManager.find(Customers.class, id);
    }
    public void deleteById(long id) {
    	Customers customers = findById(id);
    	entityManager.remove(customers);
    }
    
    public void updateById(Customers customers) {
    	Customers customerLocated = findById(customers.getId());
    	customerLocated.setName(customers.getName());
    	customerLocated.setAddress(customers.getAddress());
    	entityManager.merge(customers);
    	
    }
    
}