package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		
		System.out.println("Cricket Coach: inside setter method email address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method for team");
		this.team = team;
	}



	private FortuneService fortuneService;
	
	public CricketCoach( ) {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practive fast bowling for 15 mins";
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method fortune service");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
