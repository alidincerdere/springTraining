package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		// retrieve bean from spring container

		Coach coach = context.getBean("myCoach",Coach.class);
		
		Coach alphacoach = context.getBean("myCoach",Coach.class);
		
		//check if they are same
		
		boolean result = (coach==alphacoach);
		
		System.out.println("\n Pointing to same object " + result);
		
		System.out.println("\n memory location for the coach " + coach );
		
		System.out.println("\n memory location for the coach " + alphacoach );
		
		context.close();
		
	}

}
