
import java.util.*;

public class Roulette extends HauntedCarnival {
	
	public Roulette(int money1, String[] inventory1) {
		
		super(money1, inventory1);
		
	}
	
	public void playRoulette() {
		
		Scanner input = new Scanner(System.in);
		String ans;
		
		System.out.println("Welcome to the ROULETTE! Win tickets by paying money and have a chance win up to 1'000'000 tickets!!!");
		
		System.out.println("\nPrice to play is 5 dollars. Would you like to play? (Enter \"y\" or \"n\")");
		ans = input.next();
		
		if(ans.equals("y")) {
		
			do {
			
				Random number = new Random();
				int num = number.nextInt(1000000) + 1;

				if(num <= 10) {
					
					System.out.println("You've won 10'000 tickets!!! Congratulations!!!");
					super.addTickets(10000);
					
				} else if(num > 10 && num <= 1000) {
					
					System.out.println("You've won 1'000 tickets!!! Congratulations!!!");
					super.addTickets(1000);
					
				} else if(num > 1000 && num <= 100000) {
					
					System.out.println("You've won 100 tickets! Congratulations!!!");
					super.addTickets(100);
					
				} else if(num == 578439) {
					
					System.out.println("CONGRATULATIONS!!! YOU ARE NOW A MILLIONAIRE!!! YOU HAVE WON 1'000'000 TICKETS!!!");
					super.addTickets(1000000);
					
				} else {
					
					System.out.println("You've won 20 tickets.");
					super.addTickets(20);
				}
				
				super.setMoney(super.getMoney() - 5); 
				
				System.out.println("Would you like to play again? (Enter \\\"y\\\" or \\\"n\\\")");
				ans = input.next();
				
				if(super.getMoney() <= 0) {
					
					System.out.println("Sorry, you are out of money.");
				}
			
			}while(ans.equals("y") && super.getMoney() > 0);
		
		} else {
			
			System.out.println("To bad you don't want to gamble away money :(");
		}
		
		input.close();
	}
}

