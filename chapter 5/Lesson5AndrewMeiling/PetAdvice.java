/* Filename PetAdvice.java */
/* Written by Andrew Meiling */
/* Written on March 8th, 2014 */
/* Chapter 5 */
/* Exercise # 8 */
/* Pg 253 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.Scanner;

public class PetAdvice {
	public static void main(String[] args) {

		int residance;
		int hoursHome;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 1 if you live in an apartment, 2 if a house, and 3 a dormitory: ");
		residance = input.nextInt();
		System.out.println("How many hours are you home during the day? Enter 1 if 18 or more, 2 if 10 to 17, 3 if 8 to 9, 4 if 6 to 7, and 5 if 0 to 5");
		hoursHome = input.nextInt();

		switch(residance) {
			case 1:
				if(hoursHome <= 2)
					System.out.println("You should have a cat");
					
				else 
					System.out.println("Get a Hamster");
					break;
			case 2:
				if(hoursHome == 1)
					System.out.println("Get a Pot-bellied Pig");
					
				else
					if(hoursHome == 2)
						System.out.println("Get a dog");
					else
						System.out.println("Get a snake");
						break;
			case 3:
				if(hoursHome >= 5)
					System.out.println("Get and Ant Farm");
					
				else
					System.out.println("Get a Fish");
					break;
			default:
				System.out.println("You did not put in the proper residence code!");
		}	

	}
}