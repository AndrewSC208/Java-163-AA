/* Filename Pizza.java */
/* Written by Andrew Meiling */
/* Written on February 15th, 2014 */
/* Chapter 3 */
/* Exercise # 9.a */
/* Pg 153 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class Pizza {
	// these are some data types:
	String toppings;
	int diameter;
	double price;

	// this is a constructor for pizza:
	public Pizza() {
		toppings = "Black Olives";
		diameter = 16;
		price = 19.99;
	}

	// These are get and set methods:

	// get and set for toppings:
	public void setToppings(String top) {
		toppings = top;
	}

	public String getToppings() {
		return toppings;
	}

	public void setDiameter(int x) {
		diameter = x;
	}

	public int getDiameter() {
		return diameter;
	}
	public void setPrice(double x) {
		price = x;
	}
	public double getPrice() {
		return price;
	}
}
