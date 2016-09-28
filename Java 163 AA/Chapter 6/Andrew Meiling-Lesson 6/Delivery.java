/* Filename Delivery.java */
/* Written by Andrew Meiling */
/* Written on March 22nd, 2014 */
/* Chapter 6 */
/* Exercise # 11 */
/* Pg 297 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class Delivery {
	// data fields:
	private int delYear; // 2011
	private int delNum;	 // 0075
	private int delDistance; // 1 or 2
	private double weight = 0;
	private String delCode;
	private double fee; // follow chart as it reads
	private final int OVER_NIGHT_FEE = 35;
	private char overNightChar;

	public Delivery(int year, int num, int y, double lbs, char onv) {
		// pass the variables:
		delYear = year;
		delNum = num;
		delDistance = y;
		weight = lbs;
		overNightChar = onv;

		// determine 8 digit delCode:
		delCode = (delYear + "" + delNum);

		// determine delivery fee:
		if(delDistance == 1) { // evaluates long distance or not?
			if(weight < 5.00) {
				fee = 12.00;
			} else if(weight >= 5.00 && weight < 20.00) {
				fee = 16.50;
			} else {
				fee = 22.00;
			}
		} 
		if(delDistance == 2) {
			if(weight < 5.00) {
				fee = 35.00;
			} else {
				fee = 47.95;
			}
		}
		if(overNightChar == 'y') {
			fee = fee + OVER_NIGHT_FEE;
		}
		

	} // end of constructor. 


	public void displayDelivery() {
		
		System.out.println("Delivery code is: " + delYear + "" + delNum);
		System.out.println("Delivery year is: " + delYear);
		System.out.println("Delivery number for that year: " + delNum);
		System.out.println("Delivery distance: " + delDistance);
		System.out.println("Delivery wight is: " + weight + "lbs");
		System.out.println("Delivery fee is: $" + fee);
	}
}

