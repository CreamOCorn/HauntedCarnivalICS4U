
public abstract class CursedConsumables {
	
	protected double price;
	protected String name;
	protected String [] inventoryFood;
	
	public CursedConsumables() {
		price = 0; 
		name = "this food is not found";
		inventoryFood = new String [0];
		}
	
	public CursedConsumables(String newName, double newPrice) {
		name = newName;
		price = newPrice;
	}
	
	public abstract String getName();
	
	public abstract void setName(String newName);
	
	public abstract double getPrice();
	
	public abstract void setPrice(double newPrice);
	
	   
	public String[] InventoryFood(String a) {//serge this method is absolute genius

	        String[] newarr = new String[inventoryFood.length + 1];

	        for(int i = 0; i < inventoryFood.length; i++) {

	            newarr[i] = inventoryFood[i];
	        }
	        newarr[inventoryFood.length] = a;

	        return inventoryFood = newarr;
	    }
	
	
	
	
	public String toString() {
		return "You chose: " + name + "the price of the food will cost: " + price;
	}
	
	

}
