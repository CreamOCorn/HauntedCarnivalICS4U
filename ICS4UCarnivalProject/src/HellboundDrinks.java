import java.util.*;
public class HellboundDrinks extends CursedConsumables{

	static HellboundDrinks [] drinks = new HellboundDrinks[3];
	
	
	
	public HellboundDrinks(String newName, double newPrice){
		super(newName, newPrice);
		
	}
	
	public String getName() { 
		return name;
	}
	
	public void setName(String newName) {
		name  = newName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	
	public void timesOrdered() {
		Scanner input = new Scanner(System.in);
		
		int order;
		System.out.println("How many foods would you like to order: ");
		order = input.nextInt();	
		
		drinks[order] = new HellboundDrinks(name, price);
}
	
	public void showOrder() {
		for(int i = 0; i<drinks.length; i++) {
			System.out.println((i+1) + "is" + drinks[i]);
		}
	}
	
}
