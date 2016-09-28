/* Filename Eggs.java */
/* Written by Andrew Meiling */
/* Written on February 15th, 2014 */
/* Chapter 3 */
/* Exercise # 3 */
/* Pg 152 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {

		// Variable declarations:
		int numberOfEggs;
		// need to put in a scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("How many egg's do you have? ");
		numberOfEggs = input.nextInt();

		dozensOfEggs(numberOfEggs);

	} // end main
	public static  void dozensOfEggs(int x) {
		int dozen;
		int remainder;

		// the math 
		dozen = x / 12;
		remainder = x % 12;

		System.out.println(x + " equals " + dozen + " dozen (with " + remainder + " eggs left over)");

	}
}