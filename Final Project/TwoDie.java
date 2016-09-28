/* Filename TwoDie.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* Game Zone exercise #13-14 */
/* Pg 209 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */
/* MEID AND2182148 */

import java.util.*;
public class TwoDie
{
	public static void main(String[] args)
	{
		// creating a new dice object:
		Die dice1 = new Die();
		Die dice2 = new Die();

		System.out.println("The first roll is:  " + dice1.getDie());
		System.out.println("The second roll is: " + dice2.getDie());
	}
}