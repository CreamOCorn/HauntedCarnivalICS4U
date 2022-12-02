
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aa = new String[0];
		int money = 100;
		Player a = new Player(money);
		Roulette b = new Roulette(a);
		
		
		a.addInventory("beer");
		a.addInventory("tea");
		
		b.playRoulette();
		
		System.out.println(a);

	}

}
