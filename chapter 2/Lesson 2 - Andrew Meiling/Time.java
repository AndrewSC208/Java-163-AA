/* Filename Time.java */
/* Written by Andrew Meiling */
/* Written on February 5th, 2014 */
/* Chapter 2 */
/* Exercise # 6-a */
/* Pg 101 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class Time {
	public static void main(String[] args) {
		// variable declarations:
		int minutes = 750, hours, remainingMinuts;
		final int HOUR = 60;

		// Math to calculate hours, and remainingMinuts
		hours = (minutes / HOUR );
		remainingMinuts = ( minutes % HOUR );

		// Print statements to display information: 
		System.out.println("Total minutes worked on a job equals " + minutes + ".");
		System.out.println("That equals " + hours + " Hours, and " + remainingMinuts + " minutes.");
		
	}
}