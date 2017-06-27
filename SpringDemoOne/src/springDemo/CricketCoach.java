package springDemo;

public class CricketCoach implements Coach {

	//fields
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//constructors
	public CricketCoach() {
		System.out.println("We are in the constrctor");
	}
	
	//methods
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}//end getDailyWorkout
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}//end getDailyFortune
	
	//Getter/Setter methods
	public void setFortuneService(FortuneService fortuneService){
		System.out.println("in the setter!");
		this.fortuneService = fortuneService;
	}//end setFortuneService
	
	
	public void setEmailAddress(String emailAddress){
		System.out.println("in the email setter!");
		this.emailAddress = emailAddress;
	}//end setEmailAddress
	public String getEmailAddress()
	{
		return emailAddress;
	}// end getEmailAddress
	
	public void setTeam(String team){
		System.out.println("in the team setter!");
		this.team = team;
	}// end setTeam
	public String getTeam()
	{
		return team;
	}//end getTeam

}
