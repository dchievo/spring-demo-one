package com.luve2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach bballCoach = context.getBean("myBasketballCoach", Coach.class);		

		// call methods on the bean
		System.out.println(bballCoach.getDailyWorkout());
		System.out.println(bballCoach.getEnoughSleep());
		System.out.println(theCoach.getDailyFortune());

		// close context
		context.close();
	}

}
