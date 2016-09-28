/* Filename Calculate.java */
/* Written by Andrew Meiling */
/* Written on March 8th, 2014 */
/* Chapter 5 */
/* Exercise # 6 */
/* Pg 253 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {

		int x, y;
		int decision;
		double value;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter in the first number: ");
		x = input.nextInt();
		System.out.println("Enter in the second number: ");
		y = input.nextInt();
		System.out.println("Type 1 to add the two integers together, 2 to subtract the second from the first, 3 to multiply the two integers, and 4 to divide the first from the second: ");
		decision = input.nextInt();

		switch(decision) {
			case 1:
				value = x + y;
				System.out.println("The sum is: " + value);
				break;
			case 2:
				value = x - y;
				System.out.println("The difference is: " + value);
				break;
			case 3:
				value = x * y;
				System.out.println("The product of the two numbers is: " + value);
				break;
			case 4:
				value = x / y;
				System.out.println("The factor of the two numbers is: " + value);
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}