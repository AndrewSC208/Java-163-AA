/* Filename TestHousehold.java */
/* Written by Andrew Meiling */
/* Written on February 25th, 2014 */
/* Chapter 4 */
/* Exercise # 3 */
/* Pg 206 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class TestHousehold {
	public static void main(String[] args) {
		// variables:
		int five = 5;
		double firstSalary = 100000;

		// New HouseHold objects:
		Household defaultHouse = new Household();
		// First house:
		Household firstHouse = new Household();
		Household secondHouse = new Household(five);
		Household thirdHouse = new Household(7, 100000);
		

		// Default HouseHold:
		System.out.println("This displays the default settings of the Household object: ");
		System.out.println("Household income: $" + defaultHouse.getIncome());
		System.out.println("Household occupants: " + defaultHouse.getOccupants());
		System.out.println(" ");

		// First HouseHold:
		firstHouse.setIncome(50000);
		firstHouse.setOccupants(6);
		System.out.println("This is the income of the first house: $" + firstHouse.getIncome());
		System.out.println("Their are " + firstHouse.getOccupants() + " occupants living in the house.");
		System.out.println(" ");

		// Second HouseHold:
		System.out.println("This is the income of the second house: $" + secondHouse.getIncome());
		System.out.println("Their are " + secondHouse.getOccupants() + " occupants living in the house.");
		System.out.println(" ");

		// Third HouseHold:
		System.out.println("This is the income of the third house: $" + thirdHouse.getIncome());
		System.out.println("Their are " + thirdHouse.getOccupants() + " occupants living in the house.");
		System.out.println(" ");
	}
}