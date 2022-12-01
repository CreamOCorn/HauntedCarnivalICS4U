
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aa = new String[0];
		int money = 100;
		PrizeStand a = new PrizeStand(money, aa);
		
		
		a.addInventory(a.getInventoryArray(), "beer");
		
		System.out.println(a);
		

		
		System.out.println(a.getMoney());
		System.out.println(a.getTickets());
		
		
		
		a.toys(null);
	}

}
