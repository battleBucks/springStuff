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
	
	// init and destroy
	public void init(){
		System.out.println("initializing.....");
	}
	
	public void cleanup(){
		System.out.println("Cleaning up around here!!!");
	}

}
