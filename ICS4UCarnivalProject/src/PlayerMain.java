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
		double money;
		//printIntro(input);
		
		//initialize the HauntedCarnival using the parameter of how much money they're bringing
		System.out.println("You sift through your clothes...");
		System.out.print("How much money do you find in your pocket?\n$ ");
		money = input.nextDouble();
		Player p1 = new Player (money);
		
		while (!userChoice.equals("9")) { 
			System.out.println("-----------------------------------------------");
			System.out.println("Where would you like to go?\n"
					+ "1) Roulette\n"
					+ "2) Graveyard Dig\n"
					+ "3) Haunted Maze\n"
					+ "4) Devilish Diner\n"
					+ "5) Prize Stand\n\n"
					+ "6) Check your inventory\n"
					+ "9) Leave the carnival and go home");
			input = new Scanner (System.in);
			userChoice = (input.nextLine());
			System.out.println();
			
			if (userChoice.equals("1") || userChoice.equalsIgnoreCase("Roulette")) {
//				Roulette roulette = new Roulette();
//				
//				System.out.println("You make your way to the roulette stand. [Press Enter to Continue]");
//				input.nextLine();
//				roulette.playRoulette();
//				System.out.println("\nYou exit the stand the walk back to the main area...");
			} else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("Graveyard Dig")) {
				GraveyardDig gd = new GraveyardDig(p1);
				
				System.out.println("The graveyeard digging site is fully packed. [Press Enter to Continue]");
				input.nextLine();
				gd.playGD();
				System.out.println("\nYou leave the grave site and then make your way back to the park...");
			} else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("Haunted Maze")) {
				System.out.println("The sounds of screams from the hounted maze intruiges you. [Press Enter to Continue]");
				input.nextLine();
			} else if (userChoice.equals("4") || userChoice.equalsIgnoreCase("Devilish Diner")) {
				
				
				System.out.println("Your stomach grumbles as you go to the Devilish Diner for a quick bite. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("A vampire sees and leads you to a table in the dimly-lit restaurant. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("\"Hello there customer. What shall I serve you on this spooky evening...?\" [Press Enter to Continue]");
				input.nextLine();
				System.out.println("You unfold the menu...");
				
			} else if (userChoice.equals("5") || userChoice.equalsIgnoreCase("Prize Stand")) {
//				PrizeStand prizestand = new PrizeStand ();
//				
//				String choice;
//				System.out.println("A huge stand showcasing plushies, toys, and candies lights up the whole park. [Press Enter to Continue]");
//				input.nextLine();
//				System.out.println("\"Please help yourself to anything here!\" says a person with a hat as large as their grin.\n");
//				System.out.println("1) Use tickets to purchase a plushy\n"
//				 				+ "2) Go to the ATM Machine");
//				
//				choice = input.nextLine();
//				
//				if (choice == "1") {
//					prizestand.toys();
//				} else if (choice == "2") {
//					prizestand.moneyAsk();
//				}
//				
			} else if (userChoice.equals("6") || userChoice.toLowerCase().contains("inventory")) {
				System.out.println("You unzip your bag...\n");
				System.out.println(p1);
			} else if (userChoice.equals("9") || userChoice.toLowerCase().contains("leave") || userChoice.toLowerCase().contains("home")) {
				System.out.println("You stretch as you decide to wrap up for the day. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("Waving to all of the kind monsters, you exit the gate. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("\"See you again soon!\"");
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
		System.out.println("The flourescent bulbs of the billboard sign flicker... [Press Enter to Continue]");
		input.nextLine();
		System.out.println("You look up to see five words in bold letters before you... [Press Enter to Continue]");
		input.nextLine();
		System.out.println("\"WELCOME TO THE HAUNTED CARNIVAL!\" [Press Enter to Continue]");
		input.nextLine();
		System.out.println("You enter the gate. Attractions left and right all catch your eye. [Press Enter to Continue]");
		input.nextLine();
	}

}
