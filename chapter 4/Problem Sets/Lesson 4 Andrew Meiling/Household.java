/* Filename Household.java */
/* Written by Andrew Meiling */
/* Written on February 25th, 2014 */
/* Chapter 4 */
/* Exercise # 3 */
/* Pg 206 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */


public class Household {
	// data fields
	private int occupants;
	private int annualIncome;

	// default constructor:
	Household() {
		occupants = 1;
		annualIncome = 0;
	} 
	// constructor that assigns occupants:
	Household(int x){
		occupants = x;
		annualIncome = 0;
	}
	// overloaded constructor that assigns occupants, and income:
	Household(int x, int y) {
		occupants = x;
		annualIncome = y;
	}
	// get and set methods for income and occupants:
	public int getIncome() {
		return annualIncome;
	}
	public void setIncome(int x) {
		annualIncome = x;
	}
	public int getOccupants() {
		return occupants;
	}
	public void setOccupants(int x) {
		occupants = x;
	}
}