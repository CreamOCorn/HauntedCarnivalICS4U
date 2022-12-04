import java.util.*;

public class PrizeStand {
	//creating variable from Player
	private Player p;
	
	//making constructor equal the new variable from Player
	public PrizeStand(Player player) {
		p = player;
	}
	
	/* Pre: Null
	 * Post: void
	 * Action: Asks user if they want to ask mom for more money*/
	public void moneyAsk() {

		//Scanner with random Scanner
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		//Asking user if they want to ask mom for more money
		String userInput;
		System.out.println("Would you like to call your mom for more money?Y/N");
		userInput = sc.nextLine();
		
		//if they choose yes
		if(userInput.equals("Y")) {
			System.out.println("Great lets see what she says!");
			int randInput;
			//random input from 1 - 2
			randInput = rand.nextInt(2)+ 1;
			
			//if randInput gets 1 the user gets 100 more dollars
			if(randInput == 1) {
				System.out.println("\nCongrats your mom said yes, you have now been given 100 more dollars!");
				p.money += 100; 
				
				System.out.println("\nYou have: " + p.displayMoney() + " dollars!");
			}else {
				System.out.println("\nYour mom said no, you have been given no money!");
			}
		}else {
			 System.out.println("Continue at the carnival!");
		}
	}
	/* Pre: Null
	 * Post: void
	 * Action: Allows the user to choose whether they want a plushy or not using tickets*/
	public void toys() {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Outputting how to get plushy
		String plushInput;
		System.out.println("Welcome to the Plushy Store!" + "/n Here you have many options, from cute plushies, to SCARY ones! \nThe plushys cost 40 tickets each");
		System.out.println("Would you like to buy plushies? Y/N");
		plushInput = sc.nextLine();
		
		//if y then shows them the plushys they can get
		if(plushInput.equals("Y")) {
			System.out.println("Great here are your options!" 
					+ "\n 1. Panda Plushy" 
					+ "\n 2. Turtle Plushy" 
					+ "\n 3. Scary Spider Plushy"
					+ "\n 4. Pumpkin Plushy"
					+ "\n 5. Ghost");
			
			System.out.println("Now you get to choose which plushy you want! Use the numbers 1-5 to choose which teady fits you best!");
			int plushChoice = sc.nextInt();
			
			
			if(plushChoice == 1) {
				//shows them plushy
				String panda = ("You picked the Panda Plushy!" + "\n Collect your prize:");
				
				System.out.println(""
						+ "⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⢰⣿⡿⠗⠀⠠⠄⡀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⡜⠁⠀⠀⠀⠀⠀⠈⠑⢶⣶⡄\r\n"
						+ "⢀⣶⣦⣸⠀⢼⣟⡇⠀⠀⢀⣀⠀⠘⡿⠃\r\n"
						+ "⠀⢿⣿⣿⣄⠒⠀⠠⢶⡂⢫⣿⢇⢀⠃⠀\r\n"
						+ "⠀⠈⠻⣿⣿⣿⣶⣤⣀⣀⣀⣂⡠⠊⠀⠀\r\n"
						+ "⠀⠀⠀⠃⠀⠀⠉⠙⠛⠿⣿⣿⣧⠀⠀⠀\r\n"
						+ "⠀⠀⠘⡀⠀⠀⠀⠀⠀⠀⠘⣿⣿⡇⠀⠀\r\n"
						+ "⠀⠀⠀⣷⣄⡀⠀⠀⠀⢀⣴⡟⠿⠃⠀⠀\r\n"
						+ "⠀⠀⠀⢻⣿⣿⠉⠉⢹⣿⣿⠁⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠉⠁⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀");
					
			//if statement if they dont have enough tickets	
			if(p.tickets<40) {
				System.out.println("You do not have enough tickets!");
			}else {
				//add plushy to inventory
				p.addInventory("panda");
				
				//takes out tickets
				p.tickets = p.tickets - 40;
			
				//outputs plushy
				System.out.println(panda);
			}
			
			}else if(plushChoice == 2) {
				String turtle = ("You picked the Turtle Plushy!" + "\n Collect your prize:");

						System.out.println(""
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⠀⠀⠀⠀\r\n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠊⠁⠀⠀⠀⠀⠈⠙⢦⡀⠀\r\n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⠀\r\n"
								+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇\r\n"
								+ "⠀⠀⠀⠀⠀⠀⠀⣀⠤⢄⣀⠀⠀⠀⡇⠀⠀⠀⠀⢰⣶⠄⠀⠀⠀⠀⡇\r\n"
								+ "⠀⠀⠀⠀⠀⡴⡋⠀⠀⠀⡨⠓⣄⠀⢳⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⡼⠀\r\n"
								+ "⠀⠀⠀⢀⡞⠀⢸⠓⠒⢺⡀⠀⠈⢣⠈⡇⠀⠀⠀⠀⠀⢠⡤⠴⠋⠀⠀\r\n"
								+ "⠀⠀⠀⡼⠒⠒⢏⠀⠀⠀⠙⣦⠖⠉⢧⡿⠀⠈⠙⡖⠚⠉⠀⠀⠀⠀⠀\r\n"
								+ "⠀⠀⡖⢧⡀⠀⠈⣦⡤⠤⠊⡏⣀⡴⠊⡹⠀⣠⠞⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "⢶⡞⡟⠦⣌⡓⠾⠥⠤⠴⠒⠋⣁⠴⢊⣤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "⠀⠀⡇⠀⠀⢉⣙⣒⣒⣒⣚⣉⠁⠀⢣⡤⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "⠀⠀⠙⠒⠒⠚⠒⠋⠉⠉⠀⠈⠓⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
				
						//if statement if they dont have enough tickets	
						if(p.tickets<40) {
							System.out.println("You do not have enough tickets!");
						}else {
							//add plushy to inventory
							p.addInventory("turtle");
							
							//takes out tickets
							p.tickets = p.tickets - 40;
						
							//prints out plushy
							System.out.println(turtle);
						}
				
			} else if(plushChoice == 3) {
				String spider = ("You picked the spider Plushy!" + "\n Collect your price:");
				
				System.out.println(""
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

				//if statement if they dont have enough tickets
				if(p.tickets<40) {
					System.out.println("You do not have enough tickets!");
				}else {
					
					//add plushy to inventory
					p.addInventory("spider");
					
					//takes out tickets
					p.tickets = p.tickets - 40;
				
					//prints out plushy
					System.out.println(spider);
				}
				
			}else if(plushChoice == 4) {
				String pumpkin = ("You picked the Pumpkin plushy!" + "\n Collect your prize:");
				
				System.out.println(""
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠞⠉⠁⠀⠉⠳⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠴⣞⠉⠀⢀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣸⣄⣀⣈⣳⡄⠀⣀⡤⠴⠖⠺⠷⢤⣤⠶⠒⠶⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⢶⣾⣿⣿⣷⠶⠶⢿⡿⠚⠁⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠉⠳⢶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⠞⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠉⠫⣟⢦⣄⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⢯⣯⠟⠁⠀⠀⠀⣠⠆⠀⠀⠀⠀⠀⠀⡾⠉⠈⢻⠀⠀⠀⠀⢳⠀⠀⢠⡖⠋⠙⢦⠈⠃⠙⢷⡄⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡾⠁⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠻⠤⠴⠟⠀⠀⠀⠀⢸⠀⠀⠘⢧⣀⣠⠟⠀⠀⠀⠀⠙⣦⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⠀⠘⣷⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⢠⠖⠒⢦⣄⡀⠀⢀⣤⠖⠒⢦⣀⠀⠀⠀⠀⣠⣤⡀⠀⠀⢀⡀⠈⣇⠀⠘⣧⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⠀⠀⠀⠀⠀⡼⠀⠀⠀⠀⠀⣼⣿⣦⣤⣀⣩⣿⣿⣿⣷⣤⣀⠈⣓⣦⣴⣿⣁⠀⠙⣦⣼⠉⠹⡄⢸⡄⠀⢹⡆\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢳⠈⣇⠀⠈⣿\r\n"
						+ "⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⠀⣿⠀⠀⣿\r\n"
						+ "⠐⣿⠉⢷⠴⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢸⡟⠉⠀⠀⠀⠀⠈⠉⠻⢿⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣿⠃⢀⡏⠀⣿⠀⠀⣿\r\n"
						+ "⠀⠙⣆⠀⣄⠈⢷⢶⡄⠀⠀⠀⠀⠀⠀⢸⣧⠀⠀⠀⠀⠀⢷⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠈⠻⣿⠇⠀⡼⠁⢀⡿⠀⢠⡟\r\n"
						+ "⠀⣾⠁⠀⠈⢳⡄⠀⢧⠀⠀⠀⠀⠀⠀⡼⣿⡄⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠋⠀⣰⠃⠀⣸⡇⠀⣼⠃\r\n"
						+ "⠀⠈⠙⣶⠀⠀⠹⡄⡾⠀⠀⠀⠀⢀⡾⣡⠏⢿⣄⠀⠀⠀⠈⣷⡀⠀⠀⠀⠀⠀⠀⠙⠶⠶⠒⠚⠋⠉⠉⠉⠙⠒⠶⢤⣄⣠⠞⠁⢀⡼⠁⠀⢠⡿⠀⣰⡟⠀\r\n"
						+ "⠀⠀⠀⠙⠲⠤⠤⢼⡷⣤⣀⣤⠖⣫⡜⠁⠀⠈⠻⣧⡀⠀⠀⠘⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⠀⠀⠀⠉⠉⠉⠉⠀⠀⢠⡿⠁⣰⡟⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠶⠖⠛⠁⠀⠀⠀⣠⡶⠛⢿⣦⡀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⣡⣾⠟⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠋⠀⠀⠀⠉⣻⣶⣤⣀⣻⣶⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣟⠁⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠦⣤⠤⠴⠚⠉⠀⠀⠉⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠃⠀⠀⠀⠀⣀⣠⣴⡾⠛⠉⠀⠈⢳⣄⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⢀⡴⠿⠤⠤⠴⠖⠛⠓⠒⠒⠒⠚⠛⠉⠁⠈⠻⣦⡀⠀⠀⠀⣹⡄⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣄⣀⣀⡤⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠒⠒⠋⠁⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
				
				//if statement if they dont have enough tickets
				if(p.tickets<40) {
					System.out.println("You do not have enough tickets!");
				}else {
					//adds plushy to inventory
					p.addInventory("pumpkin");
					
					//takes out tickets
					p.tickets = p.tickets - 40;
				
					//prints out plushy
					System.out.println(pumpkin);
				}
				
			}else if(plushChoice == 5) {
				String ghost = ("You picked the ghost plushy!" + "\n collect your price:");
				
				System.out.println(""
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣶⣶⣶⣶⣶⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⢀⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⢿⣿⣿⣿⣿⡏⠈⠛⢿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠈⢹⣿⢷⣢⡀⠀⢙⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠁⠀⣸⣿⣦⣼⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠠⣶⣤⣤⣤⣄⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠈⢹⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠉⠉⠉⠁⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠻⣿⣿⣿⣿⣿⣿⣶⣶⣤⣤⣶⡶⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠉⠛⠿⠿⠿⠿⠿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠜⠊⠛⠒⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡔⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣵⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣾⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣀⣀⣀⣀⣀⡀⠀⣀⣠⣼⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⢿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠿⠿⠿⠿⠿⠿⠿⠿⠿⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

				//if statement if they dont have enough tickets
				if(p.tickets<40) {
					System.out.println("You do not have enough tickets!");
				}else {
					//adds to inventory
					p.addInventory("ghost");
					
					//takes out tickets
					p.tickets = p.tickets - 40;
				
					//prints out plushy
					System.out.println(ghost);
				}
			}
		}
		

		
	}
	
}

