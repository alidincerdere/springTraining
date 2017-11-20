package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;

public class RandomFortuneService implements FortuneService {

	private List<String> randomMotivations;
	
	public RandomFortuneService() {
		randomMotivations = new ArrayList<>();
		
		randomMotivations.add("you are great");
		randomMotivations.add("You are super");
		randomMotivations.add("You are magnificient");
		
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int x = (int) (Math.random()*100%3);
		return randomMotivations.get(x);
	}

}
