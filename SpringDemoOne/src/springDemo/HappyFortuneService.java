package springDemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String [] fortuneArr = {"Today is your lucky day!", "Stay inside...", "Outlook not so good...!", "You'll break a personal best!", "Somebody has faith in you..."};
    
	Random r = new Random();
	int Result = r.nextInt(fortuneArr.length);
	
	public String getFortune() {
		Random r = new Random();
		int Result = r.nextInt(fortuneArr.length);
		return fortuneArr[Result];
	}

}
