package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("allicationContext.xml");
		//get the bean from spring container
		coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		//call a method of the bean 
		
		//close the context
	}

}
