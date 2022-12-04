/*Author: An Ha
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: The program allows the user to play through the carnival experiences, such as games, food, and prizes.
 */

import java.util.Scanner;

public class carnivalMain {

	public static void main(String[] args) {
		//variable declaration
		double money;
		Scanner input = new Scanner(System.in);
		
		//print the opening sequence
		printIntro(input);
		
		//initialize the player's stats using the parameter of how much money they're bringing
		System.out.println("You sift through your clothes...");
		System.out.print("How much money do you find in your pocket?\n$ ");
		money = input.nextDouble();
		Player p1 = new Player (money);
		
		//the program's main star, the menu
		loopMenu(input, p1);
	}
	
	/* Pre: Scanner input
	 * Post: void
	 * Action: Allows the user to interact with the opening sequence, introducing the park's ambience*/
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

	/* Pre: Scanner input
	 * Post: void
	 * Action: Prints the menu and allows the user to go to each 
	 * attraction based on their input, looping until they decide to exit*/
	public static void loopMenu(Scanner input, Player p1) {
		String userChoice = "0";
		//the carnival menu!
		while (!userChoice.equals("7")) { 
			System.out.println("-----------------------------------------------");
			System.out.println("What would you like to do?\n"
					+ "1) Roulette\n"
					+ "2) Graveyard Dig\n"
					+ "3) Haunted Maze\n"
					+ "4) Devilish Diner\n"
					+ "5) Prize Stand/ATM Machine\n"
					+ "6) Check your inventory\n\n"
					+ "7) Leave the carnival and go home");
			input = new Scanner (System.in); //refresh the scanner
			userChoice = (input.nextLine());
			System.out.println();
			
			//choose from menu
			if (userChoice.equals("1") || userChoice.equalsIgnoreCase("Roulette")) {
				//start an instance of Roulette
				Roulette roulette = new Roulette(p1);
				
				System.out.println("You make your way to the roulette stand. [Press Enter to Continue]");
				input.nextLine();
				roulette.playRoulette(); //play the game
				System.out.println("\nYou exit the stand the walk back to the main area...");
			} else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("Graveyard Dig")) {
				//start an instance of Graveyard Dig
				GraveyardDig gd = new GraveyardDig(p1);
				
				System.out.println("The graveyeard digging site is fully packed. [Press Enter to Continue]");
				input.nextLine();
				gd.playGD(); //play the game
				System.out.println("\nYou leave the grave site and then make your way back to the park...");
			} else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("Haunted Maze")) {
				//start an instance of Haunted Maze
				HauntedMaze hm = new HauntedMaze(p1);
				
				System.out.println("The sounds of screams from the haunted maze intrigues you, taking you to its entrance. [Press Enter to Continue]");
				input.nextLine();
				hm.playMaze(); //play the game
				System.out.println("\nYou leave the maze and then make your way back to the park...");
			} else if (userChoice.equals("4") || userChoice.equalsIgnoreCase("Devilish Diner")) {
				String choice = ""; //contains the user's input for the devilish diner menu
				System.out.println("Your stomach grumbles as you go to the Devilish Diner for a quick bite. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("A vampire sees and leads you to a jack-o-lantern-lit foodcourt. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("On the left, a haunted-looking shack displays the the words \"Ghastly Foods\".");
				System.out.println("On the right, a half-open pumpkin stand displays the the words \"Hellbound Drinks\".");
				System.out.println("In the middle, a humble stand displays the the words \"Scary Snacks\".\n");
				
				
				//menu for devilish diner
				while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
					System.out.println("Where do you choose to go?\n"
							+ "1) Ghastly Food\n"
							+ "2) Hellbound Drinks\n"
							+ "3) Scary Snacks\n");
					choice = input.nextLine();
					if (choice.equals("1")) {
						GhastlyFoods gf = new GhastlyFoods(p1);
						gf.userMain();
						gf.order();
					} else if (choice.equals("2")) {
						HellboundDrinks hbd = new HellboundDrinks(p1);
						hbd.userDrinks();
						hbd.order();
					} else if (choice.equals("3")) {
						ScarySnacks ss = new ScarySnacks(p1);
						ss.userSnacks();
						ss.order();
					} else {
						System.out.println("That doesn't seem to exist at the food court.");
					}
				}
			} else if (userChoice.equals("5") || userChoice.equalsIgnoreCase("Prize Stand")) {
				//start an instance of a Prize Stand
				PrizeStand prizestand = new PrizeStand (p1);
				
				String choice = ""; //contains the user's input for the prize stand menu
				System.out.println("A huge stand showcasing plushiess lights up the whole park. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("\"Please help yourself to anything here!\" says a person with a hat as large as their grin.\n");
				
				//menu for the user to play around with the prize stand
				while (!choice.equals("1") && !choice.equals("2")) {
					System.out.println("1) Purchase a plushy\n"
					 				+ "2) Go to the ATM Machine");
					
					choice = input.nextLine();
					if (choice.equals("1")) {
						prizestand.toys();
					} else if (choice.equals("2")) {
						prizestand.moneyAsk();
					} else {
						System.out.println("That doesn't seem to exist at the prize stand.");
					}
				}
			} else if (userChoice.equals("6") || userChoice.toLowerCase().contains("inventory")) {
				System.out.println("You unzip your bag...\n");
				System.out.println(p1); //print the player's money, tickets, and inventory information
			} else if (userChoice.equals("7") || userChoice.toLowerCase().contains("leave") || userChoice.toLowerCase().contains("home")) {
				//exit the program
				System.out.println("You stretch as you decide to wrap up for the day. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("Waving to all of the kind monsters, you exit the gate. [Press Enter to Continue]");
				input.nextLine();
				System.out.println("\"See you again soon!\"");
			} else {
				//re-input information if invalid
				System.out.println("That attraction doesn't seem to exist. You look around again.");
			}
		}	
	}
}
