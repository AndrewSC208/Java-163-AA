/* Filename Purchase.java */
/* Written by Andrew Meiling */
/* Written on March 22nd, 2014 */
/* Chapter 6 */
/* Exercise # 10-a */
/* Pg 297 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class Purchase {

	// Variable declarations:
	private int invoiceNum;
	private double saleAmt;
	private double salesTax;
	private final double SALES_TAX = .05;

	// set methods:
	public void setInvoiceNum(int inv) {
		invoiceNum = inv;
	}
	public void setSaleAmt(double amt) {
		saleAmt = amt;
		// calculate sales tax and add to saleAmt
		salesTax = saleAmt * SALES_TAX;
	}
	// get methods:
	public int getInvoiceNum() {
		return invoiceNum;
	}
	public double getSaleAmt() {
		return saleAmt;
	}
	public double getSalesTax() {
		return salesTax;
	}
	public void display() {
		// do the math:
		double x, total;
		x = saleAmt * SALES_TAX;
		total = x + saleAmt;
		// Print statements:
		System.out.println("Invoice Number: " + invoiceNum);
		System.out.println("Sale Amount: $" + saleAmt);
		System.out.println("Sales Tax: $" + x);
		System.out.println("Total: $" + total);
	}
	// display method:

}