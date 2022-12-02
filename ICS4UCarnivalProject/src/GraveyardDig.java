/*Author: An Ha
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: The class contains the components to play a game 
 *where users can uncover prizes by digging points a coordinate grid.
 */

import java.util.Random;
import java.util.Scanner;


public class GraveyardDig extends HauntedCarnival {
	//variables
	private int dimensions = 7; //makes sure the cartesian plane is a 5x5 (extra 2 spots for axis)
	private String[][] plane; 
	private int xValue;
	private int yValue;
	
	//constructor
	public GraveyardDig (Player p) {
		super(p);
		plane = new String [dimensions][dimensions]; //the cartesian plane 
		xValue = 0;
		yValue = 0;
	}
	  
	/* Pre: Null
	 * Post: Void
	 * Action: Offers instructions to the user of how to play*/
	public void intro () {
		Scanner input = new Scanner (System.in);
		String review = "";
		while (!review.contains("y") && !review.contains("n")) {
			System.out.println("Do you need to read the instructions of the game? (Y/N)");
			review = input.nextLine().toLowerCase();
			if (review.contains("y")) {
				System.out.println("You will be choosing the x and y coordinates to dig from...");
				displayPlane();
				System.out.println("And you have the chance to dig up tickets or prizes! [Press Enter to Continue]");
				input.nextLine();
				System.out.println("However, you only have 5 tries! So, choose wisely! [Press Enter to Continue]");
				input.nextLine();
				System.out.println("Let's begin!\n");
			} else if (review.contains("n")){
				System.out.println("I guess you don't need the review! Let's jump right in!\n");
			}
		}
	}

	/* Pre: Null
	 * Post: Void
	 * Action: Establishes the grid pattern in the 2D array*/
	private void fillPlane () {
		//fill the entire thing with a grid
		for (int i = 0; i < dimensions; i++) {
			for (int j = 0; j < dimensions; j++) {
				plane[i][j] = "─┼─";
			}
		}
		//these two are blanks because this is where the cartesian plane stops
		plane[dimensions-2][0] = "  "; 
		plane[dimensions-1][dimensions-1] = "  ";
		
		//lay down the x axis
		for (int i = 1; i < dimensions ; i++) {
			plane[dimensions-2][i] = "─┼─";
			if (i < 10) { // allocates more space on x axis for 2-digit numbers
				plane[dimensions-1][i-1] = (i-1) + "  ";
			} else {
				plane[dimensions-1][i-1] = (i-1) + " ";
			}
		}
		plane[dimensions-1][0] = "  0  "; //the 0 needs extra space to align in the console
		plane[dimensions-2][1] = "└─"; //the bottom left corner where the x and y axes meet 
		//lay down the y axis
		for (int i = 0; i < dimensions-2; i++) {
			plane[i][dimensions-2] = "" + (i+1);	
			if (i > 8) { // allocates more space on y axis for 2-digit numbers
				plane[i][dimensions-1] = "┼─";	
			} else {
				plane[i][dimensions-1] = "─┼─";
			}
		}
	}
	
	/* Pre: Null
	 * Post: Void
	 * Action: Displays the cartesian plane*/
	public void displayPlane () {
		//print out the y axis alongside the cartesian plane (backwards so numbers descend down)
		for (int i = dimensions-3; i >= 0; i--) {
			System.out.print(plane[i][dimensions-2]);
			System.out.print(plane[i][dimensions-1]);
			for (int j = 0; j < dimensions-2; j++) {
				System.out.print(plane[i][j]);
			}
			System.out.println();
		}
		//print out the x axis after printing out the plane
		for (int i = 0; i < dimensions; i++) {
			System.out.print(plane[dimensions-2][i]);
		}
		System.out.println();
		//print out the x-axis' numbers at the very last line
		for (int i = 0; i < dimensions; i++) {
			System.out.print(plane[dimensions-1][i]);
		}
		System.out.println("\n");
	}
	
	/* Pre: Null
	 * Post: Void
	 * Action: Allows the user to choose a spot to "dig" by getting the x and y value of the coordinate*/
	public void chooseDigSpot () {
		//variable declaration
		int value = 0;
		Scanner input = new Scanner (System.in);
		
		while (value < 1 || value > dimensions-2) {
			System.out.println("What is the x coordinate of the square you want to dig?");
			value = input.nextInt();
			if (value < 1 || value > dimensions-2) { //alerts the user if their input is invalid, then lets them try again
				System.out.println("Sorry! The grid only allows for an x-value between 1-" + (dimensions-2) + ". Please try again.");
			} else {
				xValue = value;
			}
		}
		value = 0;
		while (value < 1 || value > dimensions-2) {
			System.out.println("What is the y coordinate of the square you want to dig?");
			value = input.nextInt();
			if (value < 1 || value > dimensions-2) { //alerts the user if their input is invalid, then lets them try again
				System.out.println("Sorry! The grid only allows for a y-value between 1-" + (dimensions-2) + ". Please try again.");
			} else {
				yValue = value;
			}
		}
		
		System.out.println();
	}
	
	/* Pre: Null
	 * Post: Void
	 * Action: Allows the user to "dig" and determines if they win something from it*/
	public void dig () {
		System.out.println("You sink your shovel into plot (" + xValue  + "," + yValue + ")...\n");
		if (plane[yValue-1][xValue-1] == "███") {
			System.out.println("\nYou already tried digging here so you just kinda dig... a deeper hole...\n");
		} else {
			plane[yValue-1][xValue-1] = "███";
		}
		
		displayPlane();
		
		int randNum;
		Random rand = new Random();
		
		randNum = rand.nextInt(5);
		
		if (randNum == 0) {
			winPrize();
		} else if (randNum == 1) {
			winTix();
		} else {
			System.out.println("Hm. Got nothing from that. Oh well.");
		}
		System.out.println();
	}
	
	/* Pre: Null
	 * Post: Void
	 * Action: Determines a random prize for the user to win*/
	public void winPrize () {
		String[] prizes = {"Stuffed Bear", "Lollipop", "Lucky Charm", "Bone", "Smol Lil Baybie Kitten"};
		Random rand = new Random();
		int randNum;
		
		randNum = rand.nextInt(5);
		
		System.out.println("You dug up... a " + prizes[randNum] + "!");
		
		p.addInventory(prizes[randNum]);
		System.out.println("Your inventory now looks like this!");
		p.showInventory();
	}

	/* Pre: Null
	 * Post: Void
	 * Action: Determines a random number of tickets for the user to win*/
	public void winTix () {
		int[] tixAmount = {5, 10, 20, 50, 100};
		Random rand = new Random();
		int randNum;
		
		randNum = rand.nextInt(5);
		
		System.out.println("You dug up... " + tixAmount[randNum] + " tickets!");
		
		p.tickets += (tixAmount[randNum]);
		
		System.out.println("You now have " + p.tickets + " tickets in total!");
	}
	
	/* Pre: Null
	 * Post: Boolean
	 * Action: Determines if the user will play the game or not*/
	public boolean checkPlayersMoney () {
		Scanner input = new Scanner(System.in);
		String pay = "";

		System.out.println("The sign says that the fee to play is $5...");
		if (p.money >= 5) {
			while (!pay.contains("y") && !pay.contains("n")) {
				System.out.println("Would you like to pay the fee and play? (Y/N)");
				pay = input.nextLine().toLowerCase();
				if (pay.contains("y")) {
					pay();
					return true;
				} else if (pay.contains("n")) {
					return false;
				} else {
					System.out.println("Hmm... The choice between \"Y\" or \"N\"...");
				}
			}
		} else {
			System.out.println("You dig into your pockets and only find " + decimal.format(p.money) + "...");
			System.out.println("Nevermind.");
			return false;
		}
		return true;
	}
	
	public void pay () {
		p.money -=5;
	}

	/* Pre: Null
	 * Post: Void
	 * Action: Utilizes all method to allow users to play the game*/
	public void playGD() {
		boolean canPlay = checkPlayersMoney();
		if (canPlay) {
			System.out.println("You stand over a plot of land, looking up to a board that shows the rules.");
			fillPlane();
			intro();
			displayPlane();
			
			for (int i = 1; i < 6; i++) {
				System.out.println("Try #" + i + "!");
				chooseDigSpot();
				dig();
			}
			System.out.println("Seems like you're out of tries...\n");
		}
	}
}
