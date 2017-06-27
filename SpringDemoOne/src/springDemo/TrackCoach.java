package springDemo;

public class TrackCoach implements Coach {

	// fields
	private FortuneService fortuneService;
		
	//Constructor
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
		
	// member functions
	public String getDailyWorkout() {
		
		return "Run a hard 5k!";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
