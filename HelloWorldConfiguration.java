package gamerevision2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//I think record works like regular class I think?
record Student(String name, int age) {};
record Address(String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Silas";
	}
	
	@Bean
	public int age() {
		return 27;
	}
	
	@Bean
	public Student student() {
		//you are creating a var and new object with the recording
		//and then returning the student?
		var student = new Student("Sabrina", 23);
		return student;
		
	}
	
	@Bean(name = "B Street")
	public Address addy() {
		var addy = new Address("A Street");
		return addy;
	}
}
