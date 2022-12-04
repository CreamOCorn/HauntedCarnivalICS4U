public abstract class CursedConsumables {
	
	
	//variables
	protected double price;
	protected String name;
	
	
	//constructor 
	/* Pre: Null
	 * Post: Null
	 * Action: gives values to variables(default values)*/
	public CursedConsumables() {
		price = 0; 
		name = "this food is not found";
		}
	
	//constructor which makes name and price instead of it being given
	public CursedConsumables(String newName, double newPrice) {
		name = newName;
		price = newPrice;
	}
	
	
	/* Pre: Null
	 * Post: String
	 * Action: gets name of food*/
	public abstract String getName();
	
	/* Pre: Null
	 * Post: Void
	 * Action: sets name of food*/
	public abstract void setName(String newName);
	
	/* Pre: Null
	 * Post: double
	 * Action: gets price of food*/
	public abstract double getPrice();
	
	/* Pre: Null
	 * Post: Void
	 * Action: sets price of food*/
	public abstract void setPrice(double newPrice);
	
	   
	/* Pre: Null
	 * Post: String
	 * Action: returns a ToString of the name and price if it is necessary*/
	public String toString() {
		return "You chose: " + name + "the price of the food will cost: " + price;
	}
	
	

}

