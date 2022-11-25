
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aa = new String[0];
		int money = 100;
		HauntedCarnival a = new HauntedCarnival(money, aa);
		
		String[] inventory = a.getInventoryArray();
		inventory = a.addInventory(inventory, "beer");
		a.setInventory(inventory);
		
		System.out.println(a);
	}

}
