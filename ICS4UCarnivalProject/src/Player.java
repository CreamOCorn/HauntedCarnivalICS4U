
import java.text.NumberFormat;
import java.util.*;


public class Player {
	NumberFormat decimal = NumberFormat.getCurrencyInstance();
	public double money;
	public int tickets;
	public String[] inventory;
	
	public Player (double money1) {
		money = money1;
		tickets = 0;
		inventory = new String [0]; //start as an empty array
	}
	
	public String[] addInventory(String a) {//serge this method is absolute genius
		
		String[] newarr = new String[inventory.length + 1];
		
		for(int i = 0; i < inventory.length; i++) {
			
			newarr[i] = inventory[i];
		}
		newarr[inventory.length] = a;
		
		return inventory = newarr;
	}
	
	public void showInventory() {
		if (inventory.length == 0) {
			System.out.print("Seems empty here...");
		} else {
			for (int i = 0; i < inventory.length; i++) {
				System.out.println((i+1) + ") " + inventory[i]);
			}
		}
	}
	
	//Should we put this into the prize stand instead? - An
	public void convertToTickets() {
		
		Scanner input = new Scanner(System.in);
		int howmuch;
		
		System.out.println("How much money do you want to convert? (You currently have " + decimal.format(money) + ")");
		howmuch = input.nextInt();
		
		do {
		
		if(howmuch <= money) {
		
			tickets = tickets + (howmuch*20);
			money = money - howmuch;
			System.out.println("You now have " + tickets + " tickets.");
			break;
		
		} else {
		
			do {
				
				System.out.println("You have entered the number that exceeded your amount of money, please try again.");
				howmuch = input.nextInt();
			
			}while(howmuch > money);
		}
		
		}while(howmuch < money);
		
		input.close();
	}
	
	public String toString() {
		
		String info = "Money: " + decimal.format(money) + "\nTickets: " + tickets + "\nInventory:";
		
		if (inventory.length == 0) {
			info += " Empty";
		} else {
			info += "\n";
			for(int i = 0; i < inventory.length; i++) {
				info += "  " + (i+1) + ") " + inventory[i] + "\n";
			}
		}
		
		return info;
	}
}
