package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	@Autowired	
	public TennisCoach(FortuneService fortuneService) {
		//fortune service is created with component annotation
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

		return "Practice your backhand valley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
