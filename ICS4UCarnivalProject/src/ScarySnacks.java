import java.util.*;

//extends CursedConsumables
public class ScarySnacks extends CursedConsumables{

	//creating new variable from Player
	private Player c;

	//making constructor equal the new variable from Player
	public ScarySnacks(Player player) {
		c = player;
	}
	
	/* Pre: Null
	 * Post: void
	 * Action: Allows the user to input whether they want a snack or not*/
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
	
	
	
	
	/* Pre: Null
	 * Post: void
	 * Action: method which gives user options of snacks and allows them to choose what they want*/
	public void snackFood() {
		
		//Scanner
		Scanner sc = new Scanner(System.in);

		//String array of 3 for 3 foods
		String [] snackArray = new String[3];
		
		//3 snacks
		snackArray[0] = "Scorpion Lollipops";
		snackArray[1] = "Cricket Lollipops";
		snackArray[2] = "Chocolate Fingers";

		int userSnack;

		//outputs the snacks and picks options
		System.out.println("Welcome to the Snack Section!"
				+ "Each snack costs 6 dollars!\n"
				+ "\nHere are your Snack options! "
				+ "\n1. Scorpian Lollipops"
				+ "\n2. Cricket lollipops"
				+ "\n3. Chocolate Fingers"
				+ "\nPick the numbers 1-3 to choose the snacks you want."
				+ "\nIf you dont want any snacks press 4");
		userSnack = sc.nextInt();

		//if statements for which one they choose, adds it to inventory and takes money out of account
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
	
	/* Pre: Null
	 * Post: void
	 * Action: 	//order to show them what they have in their inventory after ordering that snack*/
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