package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	DemoApplication(){
		System.out.println("Demo application defaault constructor !!!!");
	}

	public static void main(String[] args) {
		
		ApplicationContext container = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Count of beans " +container.getBeanDefinitionCount());
		
		  for (String name : container.getBeanDefinitionNames()) {
		  System.out.println(name); System.out.println(); }
		Student st = (Student) container.getBean(Student.class);
		st.intializedData();
	}

}
