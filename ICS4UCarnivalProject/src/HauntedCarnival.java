/*Author: An Ha
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: The class can add, subtract, and return information 
 *about the money, tickets, and inventories of players in the carnival.
 */

public abstract class HauntedCarnival {
	//variable declaration
	protected Player p;
	
	//constructor
	public HauntedCarnival(Player player) {
		p = player;
	}
	
	/* Pre: Null
	 * Post: void
	 * Action: Adds to the number of tickets a player has*/
	public abstract void winTix ();
	
	/* Pre: Null
	 * Post: void
	 * Action: Subtracts from the amount of money a player has*/
	public abstract void pay ();
	
	/* Pre: Null
	 * Post: void
	 * Action: Adds a prize to the player's inventory*/
	public abstract void winPrizes ();
	
	/* Pre: Null
	 * Post: boolean
	 * Action: Check if the player has enough money to play a game*/
	public abstract boolean checkPlayersMoney ();
}
