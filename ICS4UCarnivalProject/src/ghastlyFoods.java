import java.util.*;

public class ghastlyFoods extends CursedConsumables{
	
	private Player a;
	
	public ghastlyFoods(Player player) {
		a = player;
	}
	
	
	public void userFoods(){
		
		Scanner sc = new Scanner(System.in);

		
		String foodQuestions;
		
		System.out.println("Would you like to get a appetizer! Y/N");
		foodQuestions = sc.nextLine();
		
		if(foodQuestions.equals("Y")) {
			snackFood();
			
			String foodmealQ;
			System.out.println("Would you like to get a meal? Y/N");
			foodmealQ = sc.nextLine();
			
			if(foodmealQ.equals("Y")) {
				mainFood();
			}
			
		}else if(foodQuestions.equals("N")) {
			String mealQuestion;
			System.out.println("Would you like to get a meal? Y/N");
			mealQuestion = sc.nextLine();
			
			if(mealQuestion.equals("Y")) {
				mainFood();
			}
			
		}
		
	}
	
	public void snackFood() {
		
		Scanner sc = new Scanner(System.in);
		
		String [] snackArray = new String[3];
		
		int userSnack;
		
		System.out.println("Welcome to the Snack Section!"
				+ "\nHere are your Snack options! "
				+ "1. Scorpian Lollipops"
				+ "2. Cricket lollipops"
				+ "3. Chocolate Fingers"
				+ "\n Pick the numbers 1-3 to choose the snacks you want."
				+ "\n If you dont want any snacks press 4");
			userSnack = sc.nextInt();
		

		if(userSnack == 1) {
			System.out.println("The food you have chosen is: " + snackArray[0]);
			tickets = tickets = 20;
			a.addInventory(snackArray[0]);
		}else if(userSnack == 2) {
			System.out.println("The food you have chosen is: " + snackArray[1]);
			a.addInventory(snackArray[1]);
		}else if(userSnack == 3) {
			System.out.println("The food you have chosen is: " + snackArray[2]);
			a.addInventory(snackArray[2]);
		}else if(userSnack == 4) {
			System.out.println("Returning back to carnival");
		}
	}
		
	
	public void mainFood() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] mealArray = new String[3];
		
		mealArray[0] = "Devils Hair Pasta";
		mealArray[1] = "Zombie Brain Burger";
		mealArray[2] = "Blood Soup";
		
		System.out.println("Welcome to the Meal Section!"
				+ "\nHere are your Meal options! "
				+ "1. Devil’s Hair Pasta"
				+ "2. Zombie Brain Burger"
				+ "3. Blood Soup"
				+ "\n Pick the numbers 1-3 to choose the Meal you want."
				+ "\n If you dont want any Meals press 4");
		
		int mainChoice = sc.nextInt();
		
		
		
	if(mainChoice == 1) {	
		System.out.println("The food you have chosen is: " + mealArray[0]);
		a.addInventory(mealArray[0]);

	}else if(mainChoice == 2) {
		System.out.println("The food you have chosen is: " + mealArray[1]);
		a.addInventory(mealArray[1]);
		
	}else if(mainChoice == 3) {
		System.out.println("The food you have chosen is: " + mealArray[2]);
		a.addInventory(mealArray[2]);
	
	}else if (mainChoice == 4){
		System.out.println("Returning back to carnival");
	}
		
	}
	
	public void order() {
		for(int i = 0; i<a.inventoryFood.length; i++) {
			System.out.println("Your order is: " + inventoryFood[i]);
			System.out.println("Enjoy your food!");
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
