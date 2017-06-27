package springDemo;

public class TrackCoach implements Coach {

	// fields
	private FortuneService fortuneService;
	
	// constructor
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
		
	// member functions
	public String getDailyWorkout() {
		
		return "Run a hard 5k!";
	}

	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}
