import java.util.*;

public class PrizeStand extends HauntedCarnival {
	
	

	public PrizeStand(int money1, String[] inventory1) {
		
		super(money1, inventory1);
	}

	

	
	public void moneyAsk(int money1) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String userInput;
		System.out.println("Would you like to call your mom for more money?Y/N");
		userInput = sc.nextLine();
		
		if(userInput.equals("Y")) {
			System.out.println("Great lets see what she says!");
			int randInput;
			
			randInput = rand.nextInt(2)+ 1;
			
			if(randInput == 1) {
				System.out.println("\nCongrats your mom said yes, you have now been given 100 more dollars!");
				money1 = money1 + 100; 
				
				System.out.println("\nYou have: " + super.getMoney() + " dollars!");
			}else {
				System.out.println("\nYour mom said no, you have been given no money!");
			}
		}else {
			 System.out.println("Continue at the carnival!");
		}
	}
	
	public void toys(String inventory1) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String plushInput;
		System.out.println("Welcome to the Plushy Store!" + "/n Here you have many options, from cute plushies, to SCARY ones! The plushys cost 20$ each");
		System.out.println("Would you like to buy plushies? Y/N");
		plushInput = sc.nextLine();
		
		if(plushInput.equals("Y")) {
			System.out.println("Great here are your options!" 
					+ "\n 1. Panda Plushy" 
					+ "\n 2. Turtle Plushy" 
					+ "\n 3. Scary Spider Plushy"
					+ "\n 4. Pumpkin Plushy"
					+ "\n 5. Ghost");
			
			System.out.println("Now you get to choose which plushy you want! Use the numbers 1-5 to choose which teady fits you best!");
			
			int plushChoice = 0;
			
			if(plushChoice == 1) {
				String panda = ("You picked the Panda Plushy!" + "\n Collect your prize:"
						+ "		System.out.println(\"⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣦⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⠀⠀⠀⢿⣿⠟⠋⠉⠀⠀⠀⠀⠉⠑⠢⣄⡀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⠀⠀⢠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣦⡀\\r\\n\"\r\n"
						+ "				+ \"⠀⣀⠀⠀⢀⡏⠀⢀⣴⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⠇\\r\\n\"\r\n"
						+ "				+ \"⣾⣿⣿⣦⣼⡀⠀⢺⣿⣿⡿⠃⠀⠀⠀⠀⣠⣤⣄⠀⠀⠈⡿⠋⠀\\r\\n\"\r\n"
						+ "				+ \"⢿⣿⣿⣿⣿⣇⠀⠤⠌⠁⠀⡀⢲⡶⠄⢸⣏⣿⣿⠀⠀⠀⡇⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠈⢿⣿⣿⣿⣿⣷⣄⡀⠀⠀⠈⠉⠓⠂⠀⠙⠛⠛⠠⠀⡸⠁⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠻⣿⣿⣿⣿⣿⣿⣷⣦⣄⣀⠀⠀⠀⠀⠑⠀⣠⠞⠁⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⢸⡏⠉⠛⠛⠛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⢿⣿⣿⣿⣿⡄⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⡀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⢸⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡇⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⢸⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡟⠻⠿⠟⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⠀⣿⣿⣿⣿⣶⠶⠤⠤⢤⣶⣾⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⠀⠹⣿⣿⣿⠏⠀⠀⠀⠈⢿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
						+ "				+ \"⠀⠀⠀⠀⠀⠈⠉⠉⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\");");
			
				super.addInventory(super.getInventoryArray(), "panda");
			
				System.out.println(panda);
				
			}else if(plushChoice == 2) {
				String turtle = ("You picked the Turtle Plushy!" + "\n Collect your prize:"
			+ "					 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠊⠁⠀⠀⠀⠀⠈⠙⢦⡀⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠀⠀⠀⠀⠀⣀⠤⢄⣀⠀⠀⠀⡇⠀⠀⠀⠀⢰⣶⠄⠀⠀⠀⠀⡇\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠀⠀⠀⡴⡋⠀⠀⠀⡨⠓⣄⠀⢳⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⡼⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠀⢀⡞⠀⢸⠓⠒⢺⡀⠀⠈⢣⠈⡇⠀⠀⠀⠀⠀⢠⡤⠴⠋⠀⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠀⡼⠒⠒⢏⠀⠀⠀⠙⣦⠖⠉⢧⡿⠀⠈⠙⡖⠚⠉⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⡖⢧⡀⠀⠈⣦⡤⠤⠊⡏⣀⡴⠊⡹⠀⣠⠞⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "				+ \"⢶⡞⡟⠦⣌⡓⠾⠥⠤⠴⠒⠋⣁⠴⢊⣤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⡇⠀⠀⢉⣙⣒⣒⣒⣚⣉⠁⠀⢣⡤⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "				+ \"⠀⠀⠙⠒⠒⠚⠒⠋⠉⠉⠀⠈⠓⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\"");
				
				super.addInventory(super.getInventoryArray(), "turtle");
				
				System.out.println(turtle);
				
			} else if(plushChoice == 3) {
				String spider = ("You picked the spider Plushy!" + "\n Collect your price:"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⢰⠛⠉⠳⡀⠀⠀⠀⠀⢀⣠⠤⠴⠒⠒⠒⠒⠤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⠉⠙⠻⣧⠀⠀⢳⡀⠀⣠⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠶⢻⢷⣤⡀⠀⠈⢧⡀⠀⣷⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠋⠀⠀⢸⠀⠙⢿⡄⠀⠀⢱⣴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⣠⠴⡶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠁⣀⣀⣴⡛⠳⣄⠀⠙⣦⣄⣠⣇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢁⣴⢧⡈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⣏⢀⡼⠁⢹⠀⠉⠉⢙⣳⡾⠁⠀⠀⠀⠀⠉⠙⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠋⡇⠀⠙⢷⣌⠓⢄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠞⠁⠀⣨⠏⠀⣠⡼⠲⡶⣶⠋⢹⡗⣦⣀⣀⡀⣀⣀⣤⠀⠈⢳⡀⠀⢀⣀⣀⠀⢀⡞⠉⢳⣤⠞⠁⢠⠏⠙⠦⡀⠙⢧⠚⢳⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⣠⡴⠚⠁⠀⣀⣴⠞⠁⣠⠞⡿⠀⢀⡇⠸⣤⣸⡶⠿⣇⣶⡇⠻⠿⠀⠀⠀⠀⢹⠀⡏⠀⢹⡄⢸⣧⠀⠘⡏⠀⢠⠏⠀⠀⠀⠈⠳⣄⠱⢬⣧⡀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⣠⠞⠁⣠⣶⣶⠟⠋⠁⢀⡴⠃⣰⠁⢀⣾⠀⣠⠟⠋⢳⡶⠛⢥⡀⠀⠀⠀⡤⢶⣶⡋⠸⡇⠀⠈⣿⡟⢹⠀⠀⣿⡶⠋⠀⠀⠀⠀⠀⠀⠈⠳⣾⣿⣏⠓⠤⣄⠀⠀\r\n"
			+ "⠀⠀⢀⡤⠞⠁⣠⣾⠟⠁⠀⣠⡤⠖⠋⠀⢠⠧⣄⡞⠈⡿⠁⠀⢀⡞⠀⠀⠀⣷⡀⠀⣼⠁⢸⣀⣿⠖⣇⠀⠀⣿⣿⠶⡇⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢏⠹⣟⠊⠉⠀⠀\r\n"
			+ "⠀⠀⠈⠓⠒⣻⠿⠃⣠⠖⠋⠁⠀⠀⠀⣖⠁⣠⠏⠀⢸⠀⠀⢠⠎⠀⠀⠀⡾⠁⠉⢉⡇⠀⡜⠉⠀⠀⢸⠀⠀⢻⠁⠀⣼⠀⠈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⡘⢦⡀⠀⠀\r\n"
			+ "⠀⠀⠀⡠⠞⢁⣠⠞⠁⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠘⠷⠤⢼⣀⠀⠀⣼⠇⠀⢀⡞⠀⣸⠃⠀⠀⠀⠀⡇⠀⢸⠀⠀⢸⡖⠒⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣏⠓⢤⣀\r\n"
			+ "⣤⠖⠋⣀⠴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠀⠀⡞⠀⢠⠇⠀⠀⠀⠀⠀⡷⠒⠺⡇⠀⠀⣇⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠒⠒\r\n"
			+ "⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣀⣀⡾⠀⠀⠀⠀⠀⠀⢸⠀⠀⡇⠀⠀⢿⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣇⠀⢹⠀⠀⢸⡄⣸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⢸⠀⠀⢸⡏⠉⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⠾⡇⠀⠘⡇⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠀⢳⠀⠀⠹⣤⣼⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⣇⣀⣸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
				
				super.addInventory(super.getInventoryArray(), "spider");
				
				System.out.println(spider);
			}else if(plushChoice == 4) {
				String pumpkin = ("You picked the Pumpkin plushy!" + "\n Collect your prize:" 
			+ "\"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠞⠉⠁⠀⠉⠳⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠴⣞⠉⠀⢀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣸⣄⣀⣈⣳⡄⠀⣀⡤⠴⠖⠺⠷⢤⣤⠶⠒⠶⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⢶⣾⣿⣿⣷⠶⠶⢿⡿⠚⠁⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠉⠳⢶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⠞⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠉⠫⣟⢦⣄⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⢯⣯⠟⠁⠀⠀⠀⣠⠆⠀⠀⠀⠀⠀⠀⡾⠉⠈⢻⠀⠀⠀⠀⢳⠀⠀⢠⡖⠋⠙⢦⠈⠃⠙⢷⡄⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡾⠁⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠻⠤⠴⠟⠀⠀⠀⠀⢸⠀⠀⠘⢧⣀⣠⠟⠀⠀⠀⠀⠙⣦⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⠀⠘⣷⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⢠⠖⠒⢦⣄⡀⠀⢀⣤⠖⠒⢦⣀⠀⠀⠀⠀⣠⣤⡀⠀⠀⢀⡀⠈⣇⠀⠘⣧⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⠀⠀⠀⠀⠀⡼⠀⠀⠀⠀⠀⣼⣿⣦⣤⣀⣩⣿⣿⣿⣷⣤⣀⠈⣓⣦⣴⣿⣁⠀⠙⣦⣼⠉⠹⡄⢸⡄⠀⢹⡆\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢳⠈⣇⠀⠈⣿\\r\\n\"\r\n"
			+ "			+ \"⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⠀⣿⠀⠀⣿\\r\\n\"\r\n"
			+ "			+ \"⠐⣿⠉⢷⠴⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢸⡟⠉⠀⠀⠀⠀⠈⠉⠻⢿⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣿⠃⢀⡏⠀⣿⠀⠀⣿\\r\\n\"\r\n"
			+ "			+ \"⠀⠙⣆⠀⣄⠈⢷⢶⡄⠀⠀⠀⠀⠀⠀⢸⣧⠀⠀⠀⠀⠀⢷⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠈⠻⣿⠇⠀⡼⠁⢀⡿⠀⢠⡟\\r\\n\"\r\n"
			+ "			+ \"⠀⣾⠁⠀⠈⢳⡄⠀⢧⠀⠀⠀⠀⠀⠀⡼⣿⡄⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠋⠀⣰⠃⠀⣸⡇⠀⣼⠃\\r\\n\"\r\n"
			+ "			+ \"⠀⠈⠙⣶⠀⠀⠹⡄⡾⠀⠀⠀⠀⢀⡾⣡⠏⢿⣄⠀⠀⠀⠈⣷⡀⠀⠀⠀⠀⠀⠀⠙⠶⠶⠒⠚⠋⠉⠉⠉⠙⠒⠶⢤⣄⣠⠞⠁⢀⡼⠁⠀⢠⡿⠀⣰⡟⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠙⠲⠤⠤⢼⡷⣤⣀⣤⠖⣫⡜⠁⠀⠈⠻⣧⡀⠀⠀⠘⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⠀⠀⠀⠉⠉⠉⠉⠀⠀⢠⡿⠁⣰⡟⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠶⠖⠛⠁⠀⠀⠀⣠⡶⠛⢿⣦⡀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⣡⣾⠟⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠋⠀⠀⠀⠉⣻⣶⣤⣀⣻⣶⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣟⠁⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠦⣤⠤⠴⠚⠉⠀⠀⠉⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠃⠀⠀⠀⠀⣀⣠⣴⡾⠛⠉⠀⠈⢳⣄⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⢀⡴⠿⠤⠤⠴⠖⠛⠓⠒⠒⠒⠚⠛⠉⠁⠈⠻⣦⡀⠀⠀⠀⣹⡄⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣄⣀⣀⡤⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠒⠒⠋⠁⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\"");
				
				super.addInventory(super.getInventoryArray(), "pumpkin");
				
				System.out.println(pumpkin);
				
			}else if(plushChoice == 5) {
				String ghost = ("You picked the ghost plushy!" + "\n collect your price:"
			+ "\n ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣶⣶⣶⣶⣶⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⢀⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⢿⣿⣿⣿⣿⡏⠈⠛⢿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠈⢹⣿⢷⣢⡀⠀⢙⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠁⠀⣸⣿⣦⣼⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠠⣶⣤⣤⣤⣄⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠈⢹⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠉⠉⠉⠁⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠻⣿⣿⣿⣿⣿⣿⣶⣶⣤⣤⣶⡶⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠉⠛⠿⠿⠿⠿⠿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠜⠊⠛⠒⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡔⠁⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣵⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣾⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣀⣀⣀⣀⣀⡀⠀⣀⣠⣼⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⢿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\\r\\n\"\r\n"
			+ "			+ \"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠿⠿⠿⠿⠿⠿⠿⠿⠿⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\"");
				
				super.addInventory(super.getInventoryArray(), "ghost");
				
				System.out.println(ghost);
			}
		}
		

		
	}
	
}

