package com.demo.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class CustomersJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CustomersJdbcRepository repository2;
	
	@Override
	public void run(String... args) throws Exception{
		repository2.insert(new Customers(1001, "Osman", "OsmanStreet"));
		repository2.insert(new Customers(1002, "Lim", "LimStreet"));
		repository2.insert(new Customers(1003, "Tan", "TanStreet"));
		repository2.deleteById(1002);
		
	}
	
}
