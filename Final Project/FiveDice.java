/* Filename FiveDice.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* Game Zone exercise #13-14 */
/* Pg 209 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */
/* MEID AND2182148 */

import java.util.*;

public class FiveDice
{
	public static void main(String[] args)
	{
		// variables:
		final int ROLLS = 5;
		// Array with objects
		Die[] userRolls = new Die[ROLLS];
		for(int x = 0; x < userRolls.length; ++x)
		{
			userRolls[x] = new Die();

		}
		// Print Statements:
		System.out.print("These are the user rolls:     ");
		for(int y = 0; y < ROLLS; ++y)
		{
			System.out.print(userRolls[y].getDie() + " ");
		}

		Die[] computerRolls = new Die[ROLLS];
		for(int x = 0; x < userRolls.length; ++x)
		{
			computerRolls[x] = new Die();
		}
		System.out.println(" ");
		// Print Statements:
		System.out.print("These are the computer rolls: ");
		for(int y = 0; y < ROLLS; ++y)
		{
			System.out.print(computerRolls[y].getDie() + " ");
		}
		System.out.println(" ");
		
	}
}




































