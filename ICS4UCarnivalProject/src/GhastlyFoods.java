import java.util.*;

//extends abstract cursedConsumables
public class GhastlyFoods extends CursedConsumables{

	//making constructor equal the new variable from Player
	public GhastlyFoods(Player player) {
		super(player);
	}

	/* Pre: Null
	 * Post: void
	 * Action: Allows the user to input whether they want a meal or not, Used from CursedConsumables*/
	public void getOrder(){

		//Scanner
		Scanner sc = new Scanner(System.in);

		
		//variable to ask user if they want a meal
		String foodQuestions;

		System.out.println("Would you like to get a Meal! Y/N");
		foodQuestions = sc.nextLine();

		//if statement if they choose yes
		if(foodQuestions.equals("Y") || foodQuestions.equals("y")) {
			//goes through the mainFood method instead of printing it all here
			order();
			showOrder();
		}else {
			System.out.println("Return back to the carnival!");
		}

	}

	/* Pre: Null
	 * Post: void
	 * Action: method which gives user options of food and allows them to choose what they want, Used from CursedConsumables*/
	public void order() {

		//Scanner
		Scanner sc = new Scanner(System.in);

		//String out of 3 for 3 meal options
		String[] mealArray = new String[3];

		//3 meal options
		mealArray[0] = "Devils Hair Pasta";
		mealArray[1] = "Zombie Brain Burger";
		mealArray[2] = "Blood Soup";

		//outputting the 3 meals
		System.out.println("Welcome to the Meal Section!"
				+ "Each meal costs 12 dollars!!"
				+ "\nHere are your Meal options! "
				+ "\n1. Devils Hair Pasta"
				+ "\n2. Zombie Brain Burger"
				+ "\n3. Blood Soup"
				+ "\nPick the numbers 1-3 to choose the Meal you want."
				+ "\nIf you dont want any Meals press 4");

		int mainChoice = sc.nextInt();


		//if statements for which one they choose, adds it to inventory and takes money out of account
		if(mainChoice == 1) {	
			System.out.println("The food you have chosen is: " + mealArray[0]);
			player.addInventory(mealArray[0]);
			player.money = player.money - 12;
		}else if(mainChoice == 2) {
			System.out.println("The food you have chosen is: " + mealArray[1]);
			player.addInventory(mealArray[1]);
			player.money = player.money - 12;
		}else if(mainChoice == 3) {
			System.out.println("The food you have chosen is: " + mealArray[2]);
			player.addInventory(mealArray[2]);
			player.money = player.money - 12;
		}else if (mainChoice == 4){
			System.out.println("Returning back to carnival");
		}

	}
	
	
	/* Pre: Null
	 * Post: void
	 * Action: goes through method in superclass which shows user inventory*/
public void foodOrder() {
	showOrder();
}
}
