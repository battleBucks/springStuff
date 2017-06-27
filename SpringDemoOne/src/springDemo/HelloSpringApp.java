package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theBBCoach = context.getBean("myBBCoach", Coach.class);
		Coach theHCoach = context.getBean("myHCoach", Coach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theBBCoach.getDailyWorkout());
		System.out.println(theHCoach.getDailyWorkout());
		
		// call new methods for fortunes:
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theHCoach.getDailyFortune());
		System.out.println(theBBCoach.getDailyFortune());
		// close the context -- cleanup
		context.close();
		
		
	}

}
