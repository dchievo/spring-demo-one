package com.luve2code.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run bitches!";
	}
	
	@Override
	public String getEnoughSleep() {
		return "Remember to sleep 8 hours a day!";
	}

}
