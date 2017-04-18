package com.luve2code.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getEnoughSleep() {
		return "Hey dude remember to sleep 7-8 hours a day at least!";
	}
}
