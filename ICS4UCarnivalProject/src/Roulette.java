/*Author: Serge Shpolskyy
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: Minigame Roulette. Try your luck and win up to 1'000'000 tickets!!!
 *There are also chances to win 10'000, 1'000, 100 and 20 tickets.
 *Don't forget that this minigame based on gambling and your chances to lose still are the biggest.
 */

import java.util.*;

public class Roulette extends HauntedCarnivalGame {
	
	//constructor.
	public Roulette(Player p) {
		
		super(p);
		
	}
	
	//Main method. This is where all of the actions combined together.
	public void playRoulette() {
		
		Scanner input = new Scanner(System.in);
		String ans;
		
		System.out.println("Welcome to the ROULETTE! Win tickets by paying money and have a chance win up to 1'000'000 tickets!!!");
		
		System.out.println("\nPrice to play is 5 dollars. Would you like to play? (Enter \"y\" or \"n\")");
		ans = input.next();
		
		//if your input is invalid, program will repeat itself.
		while(!ans.equals("n") && checkPlayersMoney() == true){
			
			if(ans.equals("y")) {
			
				//while you choose to play again and not out of money, program will repeat itself.
				do {
				
					winTix();
					
					pay();
					
					System.out.println("Would you like to play again? (Enter \"y\" or \"n\")");
					ans = input.next();
					
					if(checkPlayersMoney() == false) {
						
						System.out.println("\nSorry, you are out of money.");
					}
				
				}while(ans.equals("y") && checkPlayersMoney() == true);
				
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
	
	//Method, where amount of tickets you will win is chosen
	public void winTix() {
		
		Random number = new Random();
		int num = number.nextInt(1000000) + 1;

		if(num <= 100) {
			
			System.out.println("\nYou've won 10'000 tickets!!! Congratulations!!!");
			p.tickets += 10000;
			
		} else if(num > 100 && num <= 10000) {
			
			System.out.println("\nYou've won 1'000 tickets!!! Congratulations!!!");
			p.tickets += 1000;
			
		} else if(num > 10000 && num <= 100000) {
			
			System.out.println("\nYou've won 100 tickets! Congratulations!!!");
			p.tickets += 100;
			
		} else if(num == 578439) {
			
			System.out.println("\nCONGRATULATIONS!!! YOU ARE NOW A MILLIONAIRE!!! YOU HAVE WON 1'000'000 TICKETS!!!");
			p.tickets += 1000000;
			
		} else if(num > 100000 && num <= 500000){
			
			System.out.println("\nYou've won 20 tickets.");
			p.tickets += 20;
			
		} else {
			
			System.out.println("\nYou lost :(");
		}
	}
	
	//You cannot win prizes in this game, only tickets, thus this method is empty
	public void winPrizes() {
		
		
	}
	
	//Method which subtracts amount of money and used in main method to pay for game.
	public void pay() {
		
		p.money -= 5;
	}
	
	//Method checks whether you have enough money on your balance.
	public boolean checkPlayersMoney() {
		
		if(p.money >= 5) {
			
			return true;
		}
		
		return false;
	}
}

