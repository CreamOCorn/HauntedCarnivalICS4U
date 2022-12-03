import java.util.*;

public class ScarySnacks extends CursedConsumables{

	//creating new variable from Player
	private Player c;

	//making constructor equal the new variable from Player
	public ScarySnacks(Player player) {
		c = player;
	}
	
	
	public void userSnacks() {
		
		Scanner sc = new Scanner(System.in);
		String snackQ;
		
		System.out.println("Would you like to have a Snack?");
		snackQ = sc.nextLine();
		
		if(snackQ.equals("Y") || snackQ.equals("y")) {
			snackFood();
		}else {
			System.out.println("Return back to the carnival!");
		}
	}
	
	
	
	
	
	public void snackFood() {

		Scanner sc = new Scanner(System.in);

		String [] snackArray = new String[3];

		int userSnack;

		System.out.println("Welcome to the Snack Section!"
				+ "Each snack costs 6 dollars!\n"
				+ "\nHere are your Snack options! "
				+ "1. Scorpian Lollipops"
				+ "2. Cricket lollipops"
				+ "3. Chocolate Fingers"
				+ "\n Pick the numbers 1-3 to choose the snacks you want."
				+ "\n If you dont want any snacks press 4");
		userSnack = sc.nextInt();


		if(userSnack == 1) {
			System.out.println("The food you have chosen is: " + snackArray[0]);
			c.money = c.money - 6;
			c.addInventory(snackArray[0]);
		}else if(userSnack == 2) {
			System.out.println("The food you have chosen is: " + snackArray[1]);
			c.money = c.money - 6;
			c.addInventory(snackArray[1]);
		}else if(userSnack == 3) {
			System.out.println("The food you have chosen is: " + snackArray[2]);
			c.money = c.money - 6;
			c.addInventory(snackArray[2]);
		}else if(userSnack == 4) {
			System.out.println("Returning back to carnival");
		}
	}
	
	
	public void order() {
		System.out.println("Your inventory now looks like this: " );
		for(int i = 0; i<c.inventory.length; i++) {
		            System.out.println((i+1) + ") " + c.inventory[i]);
		        }
	}


	/* Pre: Abstract method from CursedConsumable
	 * Post: String
	 * Action: Gets name of food*/
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* Pre: Abstract method from CursedConsumable
	 * Post: void
	 * Action: sets Name of food*/
	@Override
	public void setName(String newName) {
		// TODO Auto-generated method stub

	}

	/* Pre: Abstract method from CursedConsumable
	 * Post: double
	 * Action: gets price of food*/
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* Pre: Abstract method from CursedConsumable
	 * Post: void
	 * Action: sets Price of food*/
	@Override
	public void setPrice(double newPrice) {
		// TODO Auto-generated method stub

	}
	
	
}
