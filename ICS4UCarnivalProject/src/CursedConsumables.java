public abstract class CursedConsumables {
	
	
	//variables
	protected Player player;
	
	//constructor 
    public CursedConsumables (Player p) {
        player = p;
    }
	
	/* Pre: Null
	 * Post: Null
	 * Action: allows the user to input values to order*/
	public abstract void order();
	
	/* Pre: Null
	 * Post: Null
	 * Action: Allows user to see the options to order*/
	public abstract void getOrder();

	/* Pre: Null
	 * Post: Null
	 * Action: Prints out the order/inventory back to user*/
	public abstract void showOrder();

}

