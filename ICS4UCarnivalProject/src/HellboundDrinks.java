import java.util.*;

//extends CursedConsumables
public class HellboundDrinks extends CursedConsumables{

	
	//creating new variable of player
	private Player b;
	
	//making constructor equal the new variable from Player
	public HellboundDrinks(Player player) {
		b = player;
	}
	
	/* Pre: Null
	 * Post: void
	 * Action: Allows the user to input whether they want a drink or not*/
	public void getOrder() {
		
		//Scanner
		Scanner sc  = new Scanner(System.in);
		
		//String to choose if they want a drink or not
		String drinkQ;
		
		//Question for drink
		System.out.println("Would you like to get a drink? Y/N");
		drinkQ = sc.nextLine();
		
		//if statement for them picking Y or N
		if (drinkQ.equals("Y") || drinkQ.equals("y")) {
			order();
		}else {
			System.out.println("Going back to carnival!");
		}
	}
	
	/* Pre: Null
	 * Post: void
	 * Action: method which gives user options of drinks and allows them to choose what they want*/
	public void order() {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//String array out of 2 for 2 drinks
		String [] HellboundDrinks = new String[2];
		
		//2 drinks
		HellboundDrinks[0] = "Bloody Mary";
		HellboundDrinks[1] = "Ectoplasm Pineapple";
		
		
		System.out.println("Welcome to the Drink Section!"
				+ "Each drink costs 3 dollars!"
				+ "\nHere are your Drink options! "
				+ "\n1. Bloody Mary"
				+ "\n2. Ectoplasm Pineapple"
				+ "\nPick the numbers 1-2 to choose the Meal you want."
				+ "\nIf you dont want any Meals press 3");
		
		int mainChoice = sc.nextInt();
		
		
		//if statements for which one they choose, adds it to inventory and takes money out of account
		if(mainChoice == 1) {	
			System.out.println("The drink you have chosen is: " + HellboundDrinks[0]);
			b.addInventory(HellboundDrinks[0]);
			b.money = b.money - 3;
			
		}else if(mainChoice == 2) {
			System.out.println("The drink you have chosen is: " + HellboundDrinks[1]);
			b.addInventory(HellboundDrinks[1]);
			b.money = b.money - 3;
		}else if(mainChoice == 3) {
			System.out.println("Going back to the Carnival");
		}
	
	}
	
	/* Pre: Null
	 * Post: void
	 * Action: 	//order to show them what they have in their inventory after ordering that drink*/
	public void ShowOrder() {
		System.out.println("Your inventory now looks like this: " );
		for(int i = 0; i<b.inventory.length; i++) {
		            System.out.println((i+1) + ") " + b.inventory[i]);
		        }
		
	}
	}
