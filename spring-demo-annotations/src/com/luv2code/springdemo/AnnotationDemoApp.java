package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read Spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		theCoach.getDailyWorkout();
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		Coach basketCoach = context.getBean("basketballCoach",Coach.class);
		
		System.out.println(basketCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();		

	}

}
