/* Filename TestShirt.java */
/* Written by Andrew Meiling */
/* Written on February 25th, 2014 */
/* Chapter 4 */
/* Exercise # 5 */
/* Pg 207 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class Shirt {
	// data fields:
	private double collarSize;
	private double sleeveLength;
	private int numberOfPockets;
	final static String MATERIAL = "cotton";

	// constructor to receive parameters for shirt size:
	Shirt(double collarS, double sleeveL, int pockets) {
		collarSize = collarS;
		sleeveLength = sleeveL;
		numberOfPockets = pockets;
	}
	public void showShirt() {
		System.out.println("The specifications of the shirt are: ");
		System.out.println("Collar: " + collarSize);
		System.out.println("Sleeve: " + sleeveLength);
		System.out.println("Number of pockets: " + numberOfPockets);
		System.out.println("The material is: " + MATERIAL);
	}
}