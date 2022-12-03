import java.util.*;
public class HellboundDrinks extends CursedConsumables{

	
	
	private Player b;
	
	public HellboundDrinks(Player player) {
		b = player;
	}
	
	
	public void userDrinks() {
		
		Scanner sc  = new Scanner(System.in);
		
		String drinkQ;
		
		System.out.println("Would you like to get a drink? Y/N");
		drinkQ = sc.nextLine();
		
		if (drinkQ.equals("Y")) {
			drinks();
		}else {
			System.out.println("Going back to carnival!");
		}
	}
	
	
	public void drinks() {
		
		Scanner sc = new Scanner(System.in);
		
		String [] HellboundDrinks = new String[2];
		
		HellboundDrinks[0] = "Bloody Mary";
		HellboundDrinks[1] = "Ectoplasm Pineapple";
		
		
		System.out.println("Welcome to the Drink Section!"
				+ "Each drink costs 3 dollars!"
				+ "\nHere are your Drink options! "
				+ "1. Bloody Mary"
				+ "2. Ectoplasm Pineapple"
				+ "\n Pick the numbers 1-2 to choose the Meal you want."
				+ "\n If you dont want any Meals press 3");
		
		int mainChoice = sc.nextInt();
		
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
	
	public void order() {
		System.out.println("Your inventory now looks like this: " );
		for(int i = 0; i<b.inventory.length; i++) {
		            System.out.println((i+1) + ") " + b.inventory[i]);
		        }
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setName(String newName) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setPrice(double newPrice) {
		// TODO Auto-generated method stub
		
	}
}
