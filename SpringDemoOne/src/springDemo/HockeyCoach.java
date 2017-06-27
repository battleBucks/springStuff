package springDemo;

public class HockeyCoach implements Coach {
	// fields
	private FortuneService fortuneService;
		
	//Constructor
	public HockeyCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
		
    // member functions
    public String getDailyWorkout()
    {
    	return "Skate around like a monkey on banana peels";
    }

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
