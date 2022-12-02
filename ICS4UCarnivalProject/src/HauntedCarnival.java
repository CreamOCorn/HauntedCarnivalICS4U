/*Author: An Ha
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: The class can add, subtract, and return information about players in the carnival.
 */

import java.text.NumberFormat;

public class HauntedCarnival {
	//variable declaration
	NumberFormat decimal = NumberFormat.getCurrencyInstance();
	private Player p;
	
	//constructor
	public HauntedCarnival(Player player) {
		p = player;
	}
	
	/* Pre: Null
	 * Post: int
	 * Action: Returns the number of tickets a player has*/
	public int getTix () {
		return p.tickets;
	}
	
	/* Pre: int tix
	 * Post: void
	 * Action: Adds to the number of tickets a player has*/
	public void gainTix (int tix) {
		p.tickets += tix;
	}
	
	/* Pre: Null
	 * Post: double
	 * Action: Returns the amount of money a player has*/
	public double getMoney () {
		return p.money;
	}
	
	/* Pre: Null
	 * Post: String
	 * Action: Displays the amount of money a player has in currency format*/
	public String displayMoney () {
		return decimal.format(p.money);
	}
	
	/* Pre: int cash
	 * Post: void
	 * Action: Adds to the amount of money a player has*/
	public void gainMoney (int cash) {
		p.money += cash;
	}
	
	/* Pre: int cash
	 * Post: void
	 * Action: Subtracts from the amount of money a player has*/
	public void loseMoney (int cash) {
		p.money -= cash;
	}
	
	/* Pre: String prize
	 * Post: void
	 * Action: Adds a prize to the player's inventory*/
	public void getPrizes (String prize) {
		p.addInventory(prize);
	}
	
	/* Pre: null
	 * Post: void
	 * Action: Displays the contents of a player's inventory*/
	public void showPrizes () {
		p.showInventory();
	}
}
