
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aa = new String[0];
		int money = 100;
		Roulette a = new Roulette(money, aa);
		
		String[] inventory = a.getInventoryArray();
		inventory = a.addInventory(inventory, "beer");
		a.setInventory(inventory);
		
		System.out.println(a);
		
		a.playRoulette();
		
		System.out.println(a.getMoney());
		System.out.println(a.getTickets());
	}

}
