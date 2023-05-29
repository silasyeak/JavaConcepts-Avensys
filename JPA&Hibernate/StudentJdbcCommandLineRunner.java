package com.demo.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class StudentJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private StudentJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		repository.insert(new Student(1, "Silas", "A Street"));
		repository.insert(new Student(2, "Rish", "B Street"));
		repository.insert(new Student(3, "Emmanuel", "C Street"));
		repository.deleteById(2);
		
	}
	
}
