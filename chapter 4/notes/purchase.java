public class Purchase {
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
	public double getSalesAmt() {
		return salesAmt;
	}
	public double getSalesTax() {
		return salesTax;
	}
	public double display() {
		System.out.println("Invoice Number: " + invoiceNum);
		System.out.println("Sale Amount: " + saleAmt);
		System.out.println("Sales Tax:" + salesTax);
	}
	// display method:

}