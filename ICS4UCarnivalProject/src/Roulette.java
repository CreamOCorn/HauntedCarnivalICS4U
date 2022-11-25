
import java.util.*;

public class Roulette extends HauntedCarnival {

	private int number;
	
	
	public Roulette(int money1, String[] inventory1) {
		
		super(money1, inventory1);
		
	}
	
	public void playRoulette(int money1) {
		
		Random number = new Random();
		int num = number.nextInt(1000000) + 1;
		
		if(num <= 10) {
			
			System.out.println("You've won 10'000 tickets!!! Congratulation!!!");
			super.addTickets(10000);
		}
	}
}

//578439