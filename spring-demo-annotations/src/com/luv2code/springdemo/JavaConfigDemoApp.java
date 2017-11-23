package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read Spring config java file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		theCoach.getDailyWorkout();
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		Coach basketCoach = context.getBean("basketballCoach",Coach.class);
		
		System.out.println(basketCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		Coach swimCoach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		
		context.close();		

	}

}
