// commission.java

public class Commission {
	public static void main(String[] args) {
		// create variables:
		double salesFigure, commissionRate;
		int commissionRate2;

		salesFigure = 100000;
		commissionRate = .07;
		commissionRate2 = 7;
		// method one:
		computeCommission(salesFigure, commissionRate);
		computeCommission(salesFigure, commissionRate2);
		computeCommission(salesFigure);


	} // end of main

	public static void computeCommission(double sales, double rate) {
		// first overloaded method:	
		// multiply sales times rate
		double com;

		com = sales * rate;
		System.out.println("Your commission is: " + com);

		}
	public static void computeCommission(double sales, int rate) {
		// second overloaded method:
		// must divide the commission rate figure by 100.00 before multiplying by the sales figure and displaying the commission.  
		double com;

		com = (rate/100.0) * sales;
		System.out.println("Your commission is: " + com);
	}
	public static void computeCommission(double sales) {
		// third overloaded method:
		double com;

		com = sales * .075;

		System.out.println("Your commission is: " + com);
	}
}