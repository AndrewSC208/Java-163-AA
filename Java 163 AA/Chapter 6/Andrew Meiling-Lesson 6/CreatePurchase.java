/* Filename CreatePurchase.java */
/* Written by Andrew Meiling */
/* Written on March 22nd, 2014 */
/* Chapter 6 */
/* Exercise # 10-b */
/* Pg 297 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */


import java.util.Scanner;
public class CreatePurchase {
	public static void main(String[] args) {

		// variable declarations:
		int invoiceNum;
		double saleAmt;
		// Keyboard scanner:
		Scanner input = new Scanner(System.in);
		// create new purchase item
		Purchase saleItem = new Purchase();

		// prompt user for info
		System.out.print("What is the invoice number?(Make sure that it is between 1000 and 8000) >> ");
		invoiceNum = input.nextInt();

		// validate invoice number is between 1000 and 8000:
		while(invoiceNum < 1000 || invoiceNum > 8000) {
			System.out.print("You did not enter a valid invoice number, please enter an invoice number between 1000 and 8000. >> ");
			invoiceNum = input.nextInt();
		}
		// Set invoice number:
		saleItem.setInvoiceNum(invoiceNum);

		// Get the sale amount from the user:
		System.out.print("What was the sale amount? >> ");
		saleAmt = input.nextDouble();

		// Make sure that the sale amt in a non negative number:
		while(saleAmt <= 0) {
			System.out.print("You entered a negative sale amount. Please enter a positive amount. >> ");
			saleAmt = input.nextDouble();
		}
		saleItem.setSaleAmt(saleAmt);

		// Display all of the info:
		saleItem.display();
	}
}