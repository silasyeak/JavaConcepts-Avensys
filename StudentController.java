package com.example.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/students
@RestController
public class StudentController {
	public List<Student> retrieveStudents(){
		return Arrays.asList(
				new Student(0001, "Siddu", 23, "Portland"),
				new Student(0002, "Rish", 21, "Singapore"),
				new Student(0003, "James", 24, "New York")
				
				);
	}

}
