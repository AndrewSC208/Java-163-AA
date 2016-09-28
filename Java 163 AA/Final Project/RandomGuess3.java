/* Filename RandomGuess3.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* Game Zone exercise # 14 */
/* Pg 298 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */
/* MEID AND2182148 */

import java.util.Scanner;
import javax.swing.*;

public class RandomGuess3
{
	public static void main(String[] args)
	{
		// variables:
		int random, userGuess, i = 0, num;
		final int HIGHEST_VALUE = 1000;
		final int LOWEST_VALUE = 1;
		int YES_NO_OPTION = 0;
		// Scanner class:
		Scanner input = new Scanner(System.in);

		do {
			// generate a random number:
			random = ((int)(Math.random() * 1000) % HIGHEST_VALUE + LOWEST_VALUE);
			// get the users guess:
			System.out.print("Enter in a number between 1 and 1,000 >> ");
			userGuess = input.nextInt();
			for(i = 0; userGuess != random; ++i)
			{
				if(userGuess == random)
					System.out.println("You guessed the right number good job!");
				else if(userGuess > random)
				{
					System.out.print("Your guess is greater then the random number. Guess again >> ");
					userGuess = input.nextInt();
				}
				else if(userGuess < random)
				{
					System.out.print("Your guess is less than the random number. Guess again >> ");
					userGuess = input.nextInt();	
				}
			}
			System.out.println("It only took you " + i + " guesses to find the number.");
			// ask if they want to play again.
			num = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "No",JOptionPane.YES_NO_OPTION);
			if(num == 1)
				System.out.println("Thank you for playing the game.");
		} while(num == 0);
	}
}