/* Filename Dollars.java */
/* Written by Andrew Meiling */
/* Written on February 5th, 2014 */
/* Chapter 2 */
/* Exercise # 10 */
/* Pg 101 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import javax.swing.JOptionPane;

public class Dollars {

	public static void main(String[] args) {

		// Variables: 
		long dollars, twenties, twentiesRemainder, tens, tensRemainder, fives, fivesRemainder, ones;
		String dollarsString;
		

		// Prompt the user for the dollar amount to be converted:
		dollarsString = JOptionPane.showInputDialog(null, "What dollar amount would you like converted into 20's, 10's, 5's, and 1's? ", "Dollar Amount to Convert Dialog Box", JOptionPane.QUESTION_MESSAGE);
		dollars = Long.parseLong(dollarsString);
		
		// lets do the math:
		twenties = (dollars/ 20); 
		twentiesRemainder = (dollars % 20);

		tens = (twentiesRemainder / 10);
		tensRemainder = (twentiesRemainder % 10);

		fives = (tensRemainder / 5);
		fivesRemainder = (tensRemainder % 5);

		ones = fivesRemainder;


		// Print statements for values:
		System.out.println("Breaking down " + dollars + " into 20's, 10's, 5's, and 1's: ");
		System.out.println("20's Needed: " + twenties);
		System.out.println("10's Needed: " + tens);
		System.out.println("5's Needed:  " + fives);
		System.out.println("1's Needed:  " + ones);

	}
}