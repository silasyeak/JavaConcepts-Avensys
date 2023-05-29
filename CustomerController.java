package com.example.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	@RequestMapping("/customers")
	public List<Customer> retrieveCustomers(){
		return Arrays.asList(
				new Customer("Silas", "A St", 1001, 500),
				new Customer("Sabrina", "B St", 1002, 600),
				new Customer("Emmanuel", "C St", 1003, 700),
				new Customer("He Xiang", "D St", 1004, 800),
				new Customer("James", "E St", 1005, 900)
				);
		
	}

}
