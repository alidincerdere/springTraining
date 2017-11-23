package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFromFileFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {

		System.out.println("Inside Tennis Coach default constructor");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand valley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	/*
	 * no need for setters when using field injection
	@Autowired
	public void doCrazyStuff(FortuneService fortuneService) {
		System.out.println("inside crazy method");
		this.fortuneService = fortuneService;
	}
	*/
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> Tennis Coach inside start up");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> Tennis Coach inside clean up");
	}

}
