/* Filename Furniture.java */
/* Written by Andrew Meiling */
/* Written on March 8th, 2014 */
/* Chapter 5 */
/* Exercise # 2b */
/* Pg 252 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */


import java.util.Scanner;
import javax.swing.JOptionPane;


public class Furniture2 {
	public static void main(String[] args) {

		String tableSizeString;
		int tableSize;
		int total;
		int tableType;
		int chairs;
		String purchasedTable = "";
		int tableCost = 0;
		int tableAndChairs;
		final int LOCAL_SHIPPING = 25;
		final int OUT_OF_STATE_SHIPPING = 150;
		final int CHAIRS_YES = 1;
		final int CHAIRS_NO = 2;
		final int PINE_COST = 100;
		final int PINE_CODE = 1;
		final String PINE = "Pine";
		final int OAK_COST = 225;
		final int OAK_CODE = 2;
		final String OAK = "Oak";
		final int MAHOGANY_COST = 310;
		final int MAHOGANY_CODE = 3;
		final String MAHOGANY = "Mahogany";

		boolean choiceIsGood = true;
		

		// define the input device:
		Scanner input = new Scanner(System.in);
		System.out.println("What type of table would you like to buy? ");
		System.out.print("Type 1 for Pine, 2 for Oak, 3 for Mahogany: ");
		tableType = input.nextInt();

		switch(tableType) {
			case PINE_CODE:
				purchasedTable = PINE;
				tableCost = PINE_COST;
				break;
			case OAK_CODE:
				purchasedTable = OAK;
				tableCost = OAK_COST;
				break;
			case MAHOGANY_CODE:
				purchasedTable = MAHOGANY;
				tableCost = MAHOGANY_COST;
				break;
			default:
				choiceIsGood = false;
		}

		if(choiceIsGood) {
			System.out.println("Would you like to add a set of five chairs for $250? ");
			System.out.print("Type 1 for yes or 2 for no: ");
			chairs = input.nextInt();
			if(chairs == CHAIRS_YES) {
				tableAndChairs = tableCost + 250;
				System.out.println("You decided to buy the " + purchasedTable + " table, and five matching chairs for a total of $" + tableAndChairs + " dollars!");

				tableSizeString = JOptionPane.showInputDialog(null, "Type 1 for large table and 2 for a small table:", "Table Size Dialog", JOptionPane.QUESTION_MESSAGE);
				tableSize = Integer.parseInt(tableSizeString);
				if(tableSize == 1) {
					total = tableCost + 35;
					System.out.println("Looks like you need a large table that is $35 dollars more for a total of: $" + total + " dollars. Plus the cost of the chairs.");
				} else {
					System.out.println("Your total for the small table is $" + tableCost + " dollars. Plus the cost of chairs.");
				}
			} else {
				System.out.println("You decided to buy only the " + purchasedTable + " table, that will cost $" + tableCost + " dollars!");
			}
		} else {
			tableCost = 0;
			System.out.println("You did not choose a table that was in our inventory!");
		}
	}
}











