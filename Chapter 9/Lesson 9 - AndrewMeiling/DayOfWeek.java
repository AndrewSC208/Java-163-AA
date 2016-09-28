/* Filename DayOfWeek.java */
/* Written by Andrew Meiling */
/* Written on April 19th, 2014 */
/* Chapter 9 */
/* Exercise # 6 */
/* Pg 421 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.*;
public class DayOfWeek
{
	// enumeration:
	enum Days {MONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	public static void main(String[] args)
	{
		// variables:
		Days userDay;
		String userEntry;
		int pos;
		Scanner input = new Scanner(System.in);
		// Print out the enum:
		System.out.println("The days the store is open are: ");
		for(Days x : Days.values())
			System.out.println(x + " ");
		// Get day from user:
		System.out.print("Enter one of the following days to find out the hours of operation. >> ");
		userEntry = input.nextLine();
		userEntry = userEntry.toUpperCase();
		userDay = Days.valueOf(userEntry);
		pos = userDay.ordinal();
		System.out.println("");
		// switch statement:
		switch(pos)
		{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("We are open from 9:00 am to 9:00 pm");
				System.out.println("");
				break;
			case 5:
				System.out.println("We are open from 9:00 am to 6:00 pm");
				System.out.println("");
				break;
			case 6:
				System.out.println("We are open from 11:00 am to 5:00 pm");
				System.out.println("");
				break;
		}
	}
}