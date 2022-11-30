import java.util.Scanner;

/*Author: An Ha
 *Date: December 4, 2022
 *Course: ICS4U
 *Description: The class contains the components to play a game 
 *where users can uncover prizes by digging points a coordinate grid.
 */

public class GraveyardDig extends HauntedCarnival {
	private int dimensions = 7;
	private String[][] plane = new String [dimensions][dimensions]; //the cartesian plane is initially a 5x5 2D array
	
	public GraveyardDig (double money, String[] inventory) {
		super(money, inventory);
	}
	
	/* Pre: Cartesian Plane 2D Array, dimensions of the cartesian plane
	 * Post: Void
	 * Action: Fills the cartesian plane 2D array with a grid*/
	public void fillPlane (String[][] plane, int dimensions) {
		//fill the entire thing with a grid
		for (int i = 0; i < dimensions; i++) {
			for (int j = 0; j < dimensions; j++) {
				plane[i][j] = "─┼─";
			}
		}
		//these two are blanks because this is where the cartesian plane stops
		plane[dimensions-2][0] = "  "; 
		plane[dimensions-1][dimensions-1] = "  ";
		
		//lay down the x axis
		for (int i = 1; i < dimensions ; i++) {
			plane[dimensions-2][i] = "─┼─";
			if (i < 10) { // allocates more space on x axis for 2-digit numbers
				plane[dimensions-1][i-1] = (i-1) + "  ";
			} else {
				plane[dimensions-1][i-1] = (i-1) + " ";
			}
		}
		plane[dimensions-1][0] = "  0  "; //the 0 needs extra space to align in the console
		plane[dimensions-2][1] = "└─"; //the bottom left corner where the x and y axes meet 
		//lay down the y axis
		for (int i = 0; i < dimensions-2; i++) {
			plane[i][dimensions-2] = "" + (i+1);	
			if (i > 8) { // allocates more space on y axis for 2-digit numbers
				plane[i][dimensions-1] = "┼─";	
			} else {
				plane[i][dimensions-1] = "─┼─";
			}
		}
	}
	
	public void digPlane (String[][] plane, int dimensions) {
		//variable declaration
		int value = 0;
		Scanner input = new Scanner (System.in);
		
		while (value < 1 || value > dimensions-2) {
			System.out.println("What is the x coordinate of the Rectangle's bottom left corner?");
			value = input.nextInt();
			if (value < 1 || value > dimensions-2) { //alerts the user if their input is invalid, then lets them try again
				System.out.println("Sorry! The grid only allows for an x-value between 1-" + (dimensions-3) + " to make a valid rectangle. Please try again.");
			} else {
				temp.setBotLeftX(value);
			}
		}
		value = 0;
		while (value < 1 || value > dimensions-2) {
			System.out.println("What is the y coordinate of the Rectangle's bottom left corner?");
			value = input.nextInt();
			if (value < 1 || value > dimensions-2) { //alerts the user if their input is invalid, then lets them try again
				System.out.println("Sorry! The grid only allows for a y-value between 1-" + (dimensions-3) + " to make a valid rectangle. Please try again.");
			} else {
				temp.setBotLeftY(value);
			}
		}
		
		setRectWidth(temp, dimensions);
		setRectLength(temp, dimensions);
		
		temp.setRect();
		System.out.println();
	}
	
	
	
}
