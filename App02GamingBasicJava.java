package gamerevision2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {

	public static void main(String[] args) {
		//1: launch the spring context
		
				
		//2: configure the things which our spring will manage -- Configuration Class
		
		//@Configuration --> is Annotation Configuration object 
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//3: retrieve the beans managed by the spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("student"));
		
		//we are referring to the bean's name --> returns A Street
		System.out.println(context.getBean("B Street"));
		//you are accessing it with the bean class here --> returns A Street
		System.out.println(context.getBean(Address.class));
		
	}

}
