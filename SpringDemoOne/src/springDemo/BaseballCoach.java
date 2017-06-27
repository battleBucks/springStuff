package springDemo;
/*
public class BaseballCoach implements Coach{ ///*baseball coach is compliant by implementing a given coach interface 
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}// end getDailyWorkout

}*/

public class BaseballCoach implements Coach {
	
	// fields
	private FortuneService fortuneService;
	
	//Constructor
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	// member functions
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice!!";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
