
import java.util.*;

public class HauntedCarnival {

	private double money;
	private int tickets;
	private String[] inventory;
	
	public HauntedCarnival(int money1, String[] inventory1) {
		
		money = money1;
		tickets = 0;
		inventory = inventory1;
	}
	
	public double getMoney() {
		
		return money;
	}
	
	public int getTickets() {
		
		return tickets;
	}
	
	public String[] getInventory() {
		
		return inventory;
	}
	
	public void convertToTickets() {
		
		Scanner input = new Scanner(System.in);
		int howmuch;
		
		System.out.println("How much money do you want to convert? (You currently have " + money + ")");
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
}
