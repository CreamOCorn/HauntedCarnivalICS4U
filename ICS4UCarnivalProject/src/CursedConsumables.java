public abstract class CursedConsumables {
	
	
	//variables
	protected Player player;
	
	
	//constructor 
	/* Pre: Null
	 * Post: Null
	 * Action: gives values to variables(default values)*/
	public CursedConsumables(Player p) {
		player = p;
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

