/* Filename Interest.java */
/* Written by Andrew Meiling */
/* Written on February 15th, 2014 */
/* Chapter 3 */
/* Exercise # 8 */
/* Pg 152 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import javax.swing.JOptionPane;

public class Interest {
	public static void main(String[] args) {
		
		// Method Calls: 
		interestCalculation(promptUserAmount());

	}

	// user prompt method:
	public static double promptUserAmount() {
		// variables
		double startAmount;
		String startAmountString;

		startAmountString = JOptionPane.showInputDialog(null, "What is the starting value of the investment?", "Starting value dialog", JOptionPane.QUESTION_MESSAGE);
		startAmount = Double.parseDouble(startAmountString);

		return startAmount;

	}

	// interestCalculation method:
	public static void interestCalculation(double x) {
		
		// Variables
		final double INTEREST_RATE = .05;
		double amount;
		double total;

		// Math:
		amount = INTEREST_RATE * x;
		total = amount + x;

		// Print statement:
		System.out.println("The total is of the investment after a five percent increase is: $" + total);	
	
	}
	
}