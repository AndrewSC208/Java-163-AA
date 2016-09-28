/* Filename TestPizza.java */
/* Written by Andrew Meiling */
/* Written on February 15th, 2014 */
/* Chapter 3 */
/* Exercise # 9.b */
/* Pg 153 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.Scanner;

public class TestPizza {

	public static void main(String[] args) {

		// variables go here:
		String top;
		int diameter;
		double price = 24.99;

		// This is the creation the scanner:
		Scanner input = new Scanner(System.in);
		// This is the constructor pizza:
		Pizza firstPizza = new Pizza();
		// This is the pizza that the customer ordered:
		Pizza newPizza = new Pizza();

		// Printing of the constructor:
		System.out.println("We are running a special right now: ");
		System.out.println("For $" + firstPizza.getPrice() + " you can get a " + firstPizza.getDiameter()+ " inch pizza, with " + firstPizza.getToppings() + "!"); 

		// Start the questions:

		System.out.println("Or, you can order a custom pizza! ");

		// topping assignment:
		System.out.println("What toppings do you want on your pizza? ");
		top = input.nextLine();
		newPizza.setToppings(top);

		// size assignment:
		System.out.println("What size pizza do you want (in inches please)? ");
		diameter = input.nextInt();
		newPizza.setDiameter(diameter);

		// change the price of new pizza:
		newPizza.setPrice(price);


		// Display of the newPizza (customer order):
		System.out.println("Your custom ordered pizza is a " + newPizza.getDiameter() + " inch pizza, with " + newPizza.getToppings() + " on top and will cost: $" + newPizza.getPrice() );
	}
}