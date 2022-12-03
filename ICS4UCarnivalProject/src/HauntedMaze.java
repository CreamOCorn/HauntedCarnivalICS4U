/*Author: Serge Shpolskyy
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: This story-based quest game gives player a chance
 *to feel all of Halloween's thrill in a maze, where you need to
 *find a key from the room and escape it. You have a chance to find tickets
 *along the way and win a prize if you successfully escape the maze.
 */

import java.util.*;

public class HauntedMaze extends HauntedCarnivalGame{

	//constructor
	public HauntedMaze(Player p) {
		
		super(p);
	}
	
	//Pre: Null
	//Post: Void
	//Main method where all of the actions combined together. This is where all of the story is written.
	public void playMaze() {
		
		int cupcf = 0, wdoorf = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("You enter the maze, and see Ghost at the entrance. \n<Press enter to continue>");
		input.nextLine();
		System.out.println("He offers you this tasty-looking cupcake, would you like to accept this offer?\n1.Yes\n2.No");
		int cupc = input.nextInt();
		
		do{
		
			if(cupc == 2) {
				
				System.out.println("You decided not to eat the cupcake, hence not entering the maze and winning it before even starting.\nCONGRATULATIONS!!\nYou have won nothing.");
				break;
				
			} else if(cupc == 1) {
				
				System.out.println("What a shame. Turns out this cupcake had a sleeping pill, you lost your consciousness. \n<Press enter to continue>");
				input.nextLine();
				input.nextLine();
				System.out.println("You wake up in a room you have never seen before. It has 3 doors. \n<Press enter to continue>");
				input.nextLine();
				System.out.println("You look more closely and see that despite centre door being closed completely,\ntwo doors on the sides are slightly opened. \n<Press enter to continue>");
				input.nextLine();
				
				System.out.println("Choose one of the opened doors you want to go through:\n1. Right\n2. Left");
				int wdoor = input.nextInt();
					
				do {	
				
					if(wdoor == 1) {
						
						System.out.println("You have chosen the Right door. \n<Press enter to continue>");
						input.nextLine();
						input.nextLine();
						System.out.println("This room you've entered looks scary\nLots of blood around you and table covered in animal organs is standing in the centre of the room.\n<Press enter to continue>");
						input.nextLine();
						System.out.println("You realize that this is butchers room. \n<Press enter to continue>");
						input.nextLine();
						System.out.println("SUDDENLY, the door behind you shuts, and you can't leave the room now.\nWhat a shame. You now need to find two keys:\nTo get out of the maze;\nTo get out of the room.\n<Press enter to continue>");
						input.nextLine();
						System.out.println("You notice that there are 5 cabinets in this room. You decide to check them. \n<Press enter to continue>");
						input.nextLine();
						
						System.out.println("Choose the cabinet you want to check:\nCabinet 1\nCabinet 2\nCabinet 3\nCabinet 4\nCabinet 5");
						int wcabin = input.nextInt();
						do {
							
							if(wcabin == 1) {
								
								System.out.println("There is nothing in this cabinet. Maybe try to look in another one");
								wcabin = input.nextInt();
								
							} else if(wcabin == 2) {
								
								System.out.println("LOOK! There is a key!");
								
							} else if(wcabin == 3) {
								
								System.out.println("There is nothing in this cabinet. Maybe try to look in another one");
								wcabin = input.nextInt();
								
							} else if(wcabin == 4) {
								
								System.out.println("WOW! You have found 100 tickets here YAY! However you haven't found the key yet :( Maybe try to look in another one");
								winTix();
								wcabin = input.nextInt();
								
							} else if(wcabin == 5) {
								
								System.out.println("There is nothing in this cabinet. Maybe try to look in another one");
								wcabin = input.nextInt();
								
							} else {
								
								//if your input is invalid, player get a chance to choose again.
								while(wcabin < 1 || wcabin > 5) {
									
									System.out.println("Invalid input. Please, try again.");
									wcabin = input.nextInt();
								}
							}
							
						//if you choose the wrong cabinet, players gets a chance to choose again. 
						}while(wcabin != 2);
						
						System.out.println("You have found your key, but it doesn't seem to be the one from the door. \n<Press enter to continue>");
						input.nextLine();
						input.nextLine();
						System.out.println("You see a safe in the corner of the room. \n<Press enter to come closer>");
						input.nextLine();
						System.out.println("This key... Looks like it fits this safe. \n<Press enter to unlock>");
						input.nextLine();
						System.out.println("You have unlocked first safe door, you see another lock on it where you have to pick 3-number code.\n<Press enter to continue>");
						input.nextLine();
						
						//minigame, where you have to guess the code, however due to maze's plot, it is impossible.
						for(int i = 10; i > 0; i--) {
							
							System.out.println("You have " + i + " attempts left. Enter your code:");
							int cod = input.nextInt();
							if(cod >= 1000 || cod < 100) {
								
								System.out.println("You have entered the code with more than 3 numbers. PLease, try again.");
								cod = input.nextInt();
							}
						}
						
						System.out.println("You have tried 10 times, but weren't able to pick the code.\nMaybe something strong will do the work? Like a a crowbar\n\n(New Objective: Find the Crowbar)\n\n<Press enter to continue>");
						input.nextLine();
						input.nextLine();
						System.out.println("You look up above your head and notice that one of the ceiling tiles is just a little bit ajar.\n<Press enter to loos closer>");
						input.nextLine();
						System.out.println("You look inside and see a crowbar there. You are lucky! \n<Press enter to continue>");
						input.nextLine();
						System.out.println("You smack the safe and it crack-opens.\nYou see a key with a form of the buthcers knife, which exactly fits the lock of the door.\n<Press enter to unlock the door>");
						input.nextLine();
						System.out.println("You have unlocked a door and now the Main door is unlocked as well. \n<Press enter to continue>");
						input.nextLine();
						System.out.println("CONGRATULATIONS!! You have escaped the maze and won a prize!\nCheck your inventory.");
						winPrizes();
						cupcf = 1;
						wdoorf = 1;
						
					} else if(wdoor == 2) {
						
						System.out.println("You see a big room that is under constructions, and you can't do anything here.\nYou decide to leave.\n");
						wdoor = 1;
						
					} else {
													
							System.out.println("Invalid input. Please, try again.");
							wdoor = input.nextInt();						
					}
					
				//if your input is invalid, player gets a chance to choose again.
				}while(wdoorf != 1);
				
			} else {
									
					System.out.println("Invalid input. Please, try again.");
					cupc = input.nextInt();
			}
			
		//if your input is invalid, player gets a chance to choose again.
		}while(cupcf != 1);
	}
	
	//Pre: Null
	//Post: Void
	//Method which adds tickets to player. Used in main method
	public void winTix() {
		
		p.tickets += 100;		
	}
	
	//Pre: Null
	//Post: Void
	//Method which adds prize to the player's inventory.
	public void winPrizes() {
		
		p.addInventory("Butchers Knife");
	}
	
	//Pre: Null
	//Post: Void
	//Maze game is free to play, that's why this method is never used.
	public void pay() {
		
		
	}
	
	//Pre: Null
	//Post: Boolean
	//Same thing as the "pay()" method.
	public boolean checkPlayersMoney() {
		
		return true;
	}
}
