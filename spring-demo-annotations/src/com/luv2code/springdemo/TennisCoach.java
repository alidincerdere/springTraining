package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
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

}
