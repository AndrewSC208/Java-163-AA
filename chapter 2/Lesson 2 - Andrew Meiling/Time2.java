/* Filename Time2.java */
/* Written by Andrew Meiling */
/* Written on February 5th, 2014 */
/* Chapter 2 */
/* Exercise # 6-b */
/* Pg 101 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

// import the utilities files that are needed for the scanner
import java.util.Scanner;

public class Time2 {
	public static void main(String[] args) {
		
		// variable declarations:
		int minutes, hours, remainingMinuts;
		final int HOUR = 60;
		Scanner keyBoard = new Scanner(System.in);

		// Input from the user:
		System.out.print("Write the amount of minutes that you worked on a job: ");
		minutes = keyBoard.nextInt();

		// Calculations of hours and remainingMinuts
		hours = (minutes / HOUR );
		remainingMinuts = ( minutes % HOUR );

		// Print statements to display information: 
		System.out.println("That equals " + hours + " Hours, and " + remainingMinuts + " minutes.");
		
	}
}