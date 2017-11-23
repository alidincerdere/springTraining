package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		

		//load spring context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean comparison = (theCoach == alphaCoach);
		
		System.out.println("the objects are same: " + comparison);
		
		System.out.println("memory location for theCoach: " + theCoach );
		
		System.out.println("memory location for alphaCoach: " + alphaCoach);
		
		context.close();

	}

}
