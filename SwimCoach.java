package com.spring.tutorials;

public class SwimCoach implements Coach{

	private FortuneService fortuneservice;
	
	
	public SwimCoach(FortuneService theFortuneservice) {
		fortuneservice=theFortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim as far as you can";
	}

	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}
	
}
