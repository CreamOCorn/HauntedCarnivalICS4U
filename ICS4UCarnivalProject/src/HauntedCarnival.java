
public class HauntedCarnival {
	
	private Player p;
	
	public HauntedCarnival(Player player) {
		p = player;
	}
	
	public int getTix () {
		return p.tickets;
	}
	
	public void gainTix (int tix) {
		p.tickets += tix;
	}
	
	public double getMoney () {
		return p.money;
	}
	
	public void gainMoney (int cash) {
		p.money += cash;
	}
	
	public void loseMoney (int cash) {
		p.money -= cash;
	}
	
	public void getPrizes (String prize) {
		p.addInventory(prize);
	}
	
	public void showPrizes () {
		p.showInventory();
	}
}
