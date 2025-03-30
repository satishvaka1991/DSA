package com.example.demo;

import org.springframework.stereotype.Component;

@Component("st")
public class Student {
	
	private String name;
	private Integer id;

	public Student() {
		System.out.println("Student Default Constructor !!!!!!");
	}
	
	public void intializedData() {
		
		this.name ="Satish";
		this.id =1;
		System.out.println(this.name + " -> " + this.id);
				
	}

}
