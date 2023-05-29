package com.demo.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentJpaRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Student student) {
		entityManager.merge(student);
	}
	
	public Student findById(long id) {
		return entityManager.find(Student.class, id);
	}
	
	public void deleteById(long id) {
		Student student = entityManager.find(Student.class,id);
		entityManager.remove(student);
	}

}
