package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());

		
		//close the context
		context.close();
	}

}
