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
	    public void showOrder() {
			System.out.println("Your inventory now looks like this: " );
			for(int i = 0; i<player.inventory.length; i++) {
			            System.out.println((i+1) + ") " + player.inventory[i]);
			}
	    }
}

