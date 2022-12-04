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
	
	//constructor 
	/* Pre: Null
	 * Post: Null
	 * Action: allows the user to input values to order*/
	public abstract void order();
	
	//constructor 
	/* Pre: Null
	 * Post: Null
	 * Action: Allows user to see the options to order*/
	public abstract void getOrder();
	
	//constructor 
	/* Pre: Null
	 * Post: Null
	 * Action: Prints out the order/inventory back to user*/
	public abstract void showOrder();

}

