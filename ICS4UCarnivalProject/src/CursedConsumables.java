
public abstract class CursedConsumables {
	
	protected double price;
	protected String name;
	
	public CursedConsumables() {
		price = 0; 
		name = "this food is not found";
		}
	
	public CursedConsumables(String newName, double newPrice) {
		name = newName;
		price = newPrice;
	}
	
	public String getName() {
		return name;
		}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public String toString() {
		return "You chose: " + name + "the price of the food will cost: " + price;
	}
	
	

}
