/*Author: An Ha
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: The program allows the user to play through the carnival experiences, such as games, food, and prizes.
 */

import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userChoice = "0";
		Scanner input = new Scanner(System.in);
		String[] inventory = {"empty", "empty", "empty", "empty", "empty"};
		double money;
		//printIntro(input);
		
		System.out.println("You sift through your clothes...");
		System.out.println("How much money do you find in your pocket?");
		money = input.nextDouble();
		HauntedCarnival c = new HauntedCarnival(money, inventory);
		
		while (!userChoice.equals("9")) { 
			System.out.println("-----------------------------------------------");
			System.out.println("Where would you like to go now?\n"
					+ "1) Roulette\n"
					+ "2) Graveyard Dig\n"
					+ "3) Haunted Maze\n"
					+ "4) Devilish Diner\n"
					+ "5) Prize Stand\n\n"
					+ "6) Check your pockets\n"
					+ "9) Leave the carnival and go home");
			input = new Scanner (System.in);
			userChoice = (input.nextLine());
			System.out.println();
			
			if (userChoice.equals("1") || userChoice.equalsIgnoreCase("Roulette")) {
				Roulette roulette = new Roulette(c.getMoney(), c.getInventoryArray());
				
				System.out.println("You make your way to the roulette stand. [Press Enter to Continue]");
				input.nextLine();
				roulette.playRoulette();
				System.out.println("\nYou exit the stand the walk back to the main area...");
			} else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("Graveyard Dig")) {
				System.out.println("The graveyeard digging site. [Press Enter to Continue]");
				input.nextLine();
			} else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("Haunted Maze")) {
				System.out.println("The sounds of screams from the hounted maze intruiges you. [Press Enter to Continue]");
				input.nextLine();
			} else if (userChoice.equals("4") || userChoice.equalsIgnoreCase("Devilish Diner")) {
				System.out.println("Your stomach grumbles as you go to the Devilish Diner for a quick bite. [Press Enter to Continue]");
				input.nextLine();
			} else if (userChoice.equals("5") || userChoice.equalsIgnoreCase("Prize Stand")) {
				PrizeStand prizestand = new PrizeStand (c.getMoney(), c.getInventoryArray());
				String choice;
				System.out.println("A huge stand showcasing plushies, toys, and candies lights up the whole park. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("\"Please help yourself to anything here!\" says a person with a hat as large as their grin.\n");
				System.out.println("1) Use tickets to purchase a plushy\n"
								+ "2) Go to the ATM Machine");
				
				choice = input.nextLine();
				
				if (choice == "1") {
					prizestand.toys(c.getInventoryArray());
				} else if (choice == "2") {
					prizestand.moneyAsk(c.getMoney());
				}
				
			} else if (userChoice.equals("6") || userChoice.toLowerCase().contains("inventory")) {
				System.out.println("You unzip your bag...\n");
				System.out.println(c);
			} else if (userChoice.equals("9") || userChoice.toLowerCase().contains("leave") || userChoice.toLowerCase().contains("home")) {
				System.out.println("You stretch as you decide to wrap up for the day. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("Waving to all of the kind monsters, you exit the gate. [Press Enter to Continue]");
				input.nextLine();
			} else {
				System.out.println("That attraction doesn't seem to exist. You look around again.");
			}
		}
		
	}
	
	public static void printIntro(Scanner input) {
		System.out.println("You exit your car on a misty October night... [Press Enter to Continue]");
		input.nextLine();
		System.out.println("The fog surrounds you, concealing the ground beneath your feet... [Press Enter to Continue]");
		input.nextLine();
		System.out.println("The lights calls to you through the thick of the smoke. You feel drawn to it... [Press Enter to Continue]");
		input.nextLine();
		System.out.println("The flourescent bulbs of the billboard sign flicker... [Press Enter to Continue]");
		input.nextLine();
		System.out.println("You look up to see five words in bold letters before you... [Press Enter to Continue]");
		input.nextLine();
		System.out.println("\"WELCOME TO THE HAUNTED CARNIVAL!\" [Press Enter to Continue]");
		input.nextLine();
		System.out.println("You enter the gate, greeted by ghosts, ghouls, and witches all around. [Press Enter to Continue]");
		input.nextLine();
		System.out.println("Attractions left and right all catch your eye. [Press Enter to Continue]");
		input.nextLine();
	}

}
