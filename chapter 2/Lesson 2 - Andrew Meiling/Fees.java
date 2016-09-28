/* Filename Fees.java */
/* Written by Andrew Meiling */
/* Written on February 5th, 2014 */
/* Chapter 2 */
/* Exercise # 8 */
/* Pg 101 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import javax.swing.JOptionPane;

public class Fees {

	public static void main(String[] args) {

		// we are going to declare all of the variables here:
		final int creditHourCost = 85, athleticFee = 65;
		String creditHourString, bookCostString;
		int creditHour, bookCost, totalCost, totalCostPerHour;


		// Prompt the user for the amount of credit hours that they are taking. 
		creditHourString = JOptionPane.showInputDialog(null, "How many credit hours are you taking?", "Credit hour dialog", JOptionPane.QUESTION_MESSAGE);
		creditHour = Integer.parseInt(creditHourString);


		// Prompt the user for the amount of money that they have spent on books. 
		bookCostString = JOptionPane.showInputDialog(null, "How much have you spent on books?", "Book cost dialog", JOptionPane.QUESTION_MESSAGE);
		bookCost = Integer.parseInt(bookCostString);

		// Print out the information that is needed.
		System.out.println("This is an explanation of your total fee's: ");
		System.out.println("Total credit hours taken: " + creditHour);
		System.out.println("Cost per credit hour is: $" + creditHourCost);
		System.out.println("Amount spent on books is: $" + bookCost);
		System.out.println("Don't forget the athletic fee of: $" + athleticFee);

		//--------------------------------------------------------------------------
		// A little extra fun to calculate the actual cost of school per credit hour:

		//The math part:
		// calculate total cost
		totalCost = ((creditHour * creditHourCost) + (bookCost + athleticFee));
		// calculate cost per hour
		totalCostPerHour = (totalCost / creditHour);

		// The print statement:
		System.out.println("This is the actual cost of school per credit hour with athletic fee's and book costs: $" + totalCostPerHour);
		System.out.println("The total cost of school with fee's and book's is: $" + totalCost);

	}
}