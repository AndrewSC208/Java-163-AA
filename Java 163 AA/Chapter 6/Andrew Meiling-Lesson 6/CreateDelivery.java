/* Filename CreateDelivery.java */
/* Written by Andrew Meiling */
/* Written on March 22nd, 2014 */
/* Chapter 6 */
/* Exercise # 11 */
/* Pg 297 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.Scanner;

public class CreateDelivery {
	public static void main(String[] args) {
		// variable declarations:
		int year;
		int deliveryNumber;
		double packageWeight;
		final int SHORT_DIS_CODE = 1;
		final int LONG_DIS_CODE = 2;
		int distanceCode;
		boolean overNight;
		String overNightString;
		char overNightChar;
		
		// Keyboard scanner:
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for year of order:
		System.out.print("What is the year of the order? (only years between 2001 and 2025 are valid) >> ");
		year = keyboard.nextInt();
		keyboard.nextLine();
		// Validate the year to make sure that it is the proper parameters:
		while(year < 2001 || year > 2025) {
			System.out.println("You entered an invalid year.");
			System.out.println("You entered: " + year);
			System.out.print("Enter a year between 2001 and 2025. >> ");
			year = keyboard.nextInt();	
			keyboard.nextLine();
		}

		// Get the delivery number from the user:
		System.out.print("What is the delivery number? >> ");
		deliveryNumber = keyboard.nextInt();
		keyboard.nextLine();
		// validate deliveryNumber to make sure that it is between 1 and 9999
		while(deliveryNumber < 1 || deliveryNumber > 9999) {
			System.out.println("You entered and invalid year.");
			System.out.println("You entered: " + deliveryNumber);
			System.out.print("Enter a delivery number between 1 and 9999. >> ");
			deliveryNumber = keyboard.nextInt();
			keyboard.nextLine();
		}
		// Get the package weight from the user:
		System.out.print("What is the weight of the package? >> ");
		packageWeight = keyboard.nextDouble();
		keyboard.nextLine();
		while(packageWeight < .10 || packageWeight > 100.00) {
			System.out.println("You entered an invalid weight.");
			System.out.println("You entered: " + packageWeight + "lbs");
			System.out.print("Enter a weight between .10 lbs and 100 lbs. >> ");
			packageWeight = keyboard.nextDouble();
			keyboard.nextLine();
		}
		// Get the distance code from the user:
		System.out.print("What is the distance code? Enter " + SHORT_DIS_CODE + " for local Delivery, or " + LONG_DIS_CODE + " for long distance delivery. >> ");
		distanceCode = keyboard.nextInt();
		keyboard.nextLine();
		while(distanceCode != SHORT_DIS_CODE && distanceCode != LONG_DIS_CODE) {
			System.out.println("You entered and invalid distance code.");
			System.out.println("You entered: " + distanceCode);
			System.out.print("What is the distance code? Enter " + SHORT_DIS_CODE + " for local Delivery, or " + LONG_DIS_CODE + " for long distance delivery. >> ");
			distanceCode = keyboard.nextInt();
			keyboard.nextLine();
		}

		// Ask the user if they want overnight shipping:
		System.out.print("Do you want overnight shipping for $35.00? (y or n) >> ");
		overNightString = keyboard.nextLine();
		overNightChar = overNightString.charAt(0);

		// This is the constructor method that is going to pass all the info into Delivery:
		Delivery newDelivery = new Delivery(year, deliveryNumber, distanceCode, packageWeight, overNightChar);
		// This is the display method:
		newDelivery.displayDelivery();

	}
}
















