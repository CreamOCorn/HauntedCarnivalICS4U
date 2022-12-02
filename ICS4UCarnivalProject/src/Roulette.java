
import java.util.*;

public class Roulette extends HauntedCarnival {
	
	public Roulette(Player player) {
		
		super(player);
		
	}
	
	public void playRoulette() {
		
		Scanner input = new Scanner(System.in);
		String ans;
		
		System.out.println("Welcome to the ROULETTE! Win tickets by paying money and have a chance win up to 1'000'000 tickets!!!");
		
		System.out.println("\nPrice to play is 5 dollars. Would you like to play? (Enter \"y\" or \"n\")");
		ans = input.next();
		
		while(!ans.equals("n") && super.getMoney() > 0){
			
			if(ans.equals("y")) {
			
				do {
				
					Random number = new Random();
					int num = number.nextInt(1000000) + 1;
	
					if(num <= 10) {
						
						System.out.println("\nYou've won 10'000 tickets!!! Congratulations!!!\n");
						super.gainTix(10000);
						
					} else if(num > 10 && num <= 1000) {
						
						System.out.println("\nYou've won 1'000 tickets!!! Congratulations!!!\n");
						super.gainTix(1000);
						
					} else if(num > 1000 && num <= 100000) {
						
						System.out.println("\nYou've won 100 tickets! Congratulations!!!\n");
						super.gainTix(100);
						
					} else if(num == 578439) {
						
						System.out.println("\nCONGRATULATIONS!!! YOU ARE NOW A MILLIONAIRE!!! YOU HAVE WON 1'000'000 TICKETS!!!\n");
						super.gainTix(1000000);
						
					} else if(num > 100000 && num <= 500000){
						
						System.out.println("\nYou've won 20 tickets.\n");
						super.gainTix(20);
						
					} else {
						
						System.out.println("\nYou lost :(\n");
					}
					
					super.gainMoney(-5);
					
					System.out.println("Would you like to play again? (Enter \"y\" or \"n\")");
					ans = input.next();
					
					if(super.getMoney() <= 0) {
						
						System.out.println("\nSorry, you are out of money.");
					}
				
				}while(ans.equals("y") && super.getMoney() > 0);
				
			} else if(ans.equals("n")){
				
				System.out.println("Too bad you don't want to gamble away money :(");
				
			} else {
				
				while(!ans.equals("y") && !ans.equals("n")) {
					
					System.out.println("Your answer is invalid. Please, try again.");
					ans = input.next();

				}
			}
		}
		if(ans.equals("n")) {
			
			System.out.println("Too bad you don't want to gamble away money :(");
		}
	}
}

