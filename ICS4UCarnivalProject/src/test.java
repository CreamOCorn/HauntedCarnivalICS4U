
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aa = new String[0];
		int money = 100;
		Roulette a = new Roulette(money, aa);
		
		
		a.addInventory(a.getInventoryArray(), "beer");
		a.addInventory(a.getInventoryArray(), "tea");

		
		System.out.println(a);
		
		a.playRoulette();
		
		System.out.println(a.getMoney());
		System.out.println(a.getTickets());
	}

}
