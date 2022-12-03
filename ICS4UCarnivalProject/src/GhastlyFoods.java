import java.util.*;

//extends abstract cursedConsumables
public class GhastlyFoods extends CursedConsumables{

	//creating new variable from Player
	private Player a;

	//making constructor equal the new variable from Player
	public GhastlyFoods(Player player) {
		a = player;
	}

	/* Pre: Null
	 * Post: void
	 * Action: Allows the user to input whether they want an appetizer or meal or both*/
	public void userFoods(){

		Scanner sc = new Scanner(System.in);


		String foodQuestions;

		System.out.println("Would you like to get a appetizer! Y/N");
		foodQuestions = sc.nextLine();

		if(foodQuestions.equals("Y")) {
			snackFood();

			String foodmealQ;
			System.out.println("Would you also like to get a meal? Y/N");
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
			a.money = a.money - 6;
			a.addInventory(snackArray[0]);
		}else if(userSnack == 2) {
			System.out.println("The food you have chosen is: " + snackArray[1]);
			a.money = a.money - 6;
			a.addInventory(snackArray[1]);
		}else if(userSnack == 3) {
			System.out.println("The food you have chosen is: " + snackArray[2]);
			a.money = a.money - 6;
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
				+ "Each meal costs 12 dollars!!"
				+ "\nHere are your Meal options! "
				+ "1. Devils Hair Pasta"
				+ "2. Zombie Brain Burger"
				+ "3. Blood Soup"
				+ "\n Pick the numbers 1-3 to choose the Meal you want."
				+ "\n If you dont want any Meals press 4");

		int mainChoice = sc.nextInt();



		if(mainChoice == 1) {	
			System.out.println("The food you have chosen is: " + mealArray[0]);
			a.addInventory(mealArray[0]);
			a.money = a.money - 12;
		}else if(mainChoice == 2) {
			System.out.println("The food you have chosen is: " + mealArray[1]);
			a.addInventory(mealArray[1]);
			a.money = a.money - 12;
		}else if(mainChoice == 3) {
			System.out.println("The food you have chosen is: " + mealArray[2]);
			a.addInventory(mealArray[2]);
			a.money = a.money - 12;
		}else if (mainChoice == 4){
			System.out.println("Returning back to carnival");
		}

	}

	public void order() {
		System.out.println("Your inventory now looks like this: " );
		for(int i = 0; i<a.inventory.length; i++) {
		            System.out.println((i+1) + ") " + a.inventory[i]);
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
