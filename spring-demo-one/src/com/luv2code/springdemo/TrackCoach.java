package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//define a private field for the dependency
	
	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it" + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("track coach inside startup");
	}
	
	// add destroy method

	public void doMyCleanupStuff() {
		System.out.println("track coach inside cleanup");
	}
	
}
