import java.util.*;
public class HellboundDrinks extends CursedConsumables{

	static HellboundDrinks [] drinks = new HellboundDrinks[3];
	
	
	
	public HellboundDrinks(String newName, double newPrice){
		super(newName, newPrice);
		
	}
	
	public String getName() { 
		return name;
	}
	
	public void setName(String newName) {
		name  = newName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
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
				+ "\nHere are your Drink options! "
				+ "1. Bloody Mary"
				+ "2. Ectoplasm Pineapple"
				+ "\n Pick the numbers 1-2 to choose the Meal you want."
				+ "\n If you dont want any Meals press 3");
		
		int mainChoice = sc.nextInt();
		
	if(mainChoice == 1) {	
		System.out.println("The drink you have chosen is: " + HellboundDrinks[0]);
		super.InventoryFood(HellboundDrinks[0]);
		
	}else if(mainChoice == 2) {
		System.out.println("The drink you have chosen is: " + HellboundDrinks[1]);
		super.InventoryFood(HellboundDrinks[0]);
		
	}else if(mainChoice == 3) {
		System.out.println("Going back to the Carnival");
	}
	
	}
	
	public void order() {
		for(int i = 0; i<super.inventoryFood.length; i++) {
			System.out.println("Your order is: " + inventoryFood[i]);
			System.out.println("Enjoy your food!");
	}
	
}
}
