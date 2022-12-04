/*Author: Serge Shpolskyy
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: The class stores variables of money, tickets and inventory.
 *Makes possible to add items into inventory, convert money to tickets, display money and
 *inventory, and shows overall statistics.
 */

import java.text.NumberFormat;
import java.util.*;


public class Player {
	//variable declaration.
    NumberFormat decimal = NumberFormat.getCurrencyInstance();
    public double money;
    public int tickets;
    public String[] inventory;

    //constructor
    public Player (double money1) {
        money = money1;
        tickets = 0;
        inventory = new String [0]; //start as an empty array
    }

    //Pre: Null
  	//Post: String[]
    //modifier method - adds items into inventory.
    public String[] addInventory(String a) {

        String[] newarr = new String[inventory.length + 1];

        for(int i = 0; i < inventory.length; i++) {

            newarr[i] = inventory[i];
        }
        newarr[inventory.length] = a;

        return inventory = newarr;
    }

    //Pre: Null
  	//Post: Void
    //accessor method - shows the inventory.
    public void showInventory() {
        if (inventory.length == 0) {
            System.out.print("Seems empty here...");
        } else {
            for (int i = 0; i < inventory.length; i++) {
                System.out.println((i+1) + ") " + inventory[i]);
            }
        }
    }

    //Pre: Null
  	//Post: String
    //accessor method - displays money.
    public String displayMoney() {
        return decimal.format(money);
    }
    
    //Pre: Null
  	//Post: String
    //method to display overall statistics.
    public String toString() {

        String info = "Money: " + decimal.format(money) + "\nTickets: " + tickets + "\nInventory:";

        if (inventory.length == 0) {
            info += " Empty";
        } else {
            info += "\n";
            for(int i = 0; i < inventory.length; i++) {
                info += "  " + (i+1) + ") " + inventory[i] + "\n";
            }
        }

        return info;
    }
}