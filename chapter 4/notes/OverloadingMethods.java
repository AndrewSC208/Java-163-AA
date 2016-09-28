// Overloading a method: 
/* 

	Notes:
	1. Overloading methods:
		a. Overloading: involves using one term to indicate diverse meanings, or writing multiple methods with the same name but with different parameters lists. 	
			i. when you overload a Java method , you write multiple methods with a shared name.
			ii. the compiler understands your meaning based on the arguments you use with the methods call. 
		b. Ambiguous situation: one in which the compiler cannot determine which method to use.
			i. It is important to note that you can overload methods correctly by providing different parameter list for methods with the same name. 
			ii. Methods with identical names that have identical parameter lists but different return types are not overloaded they are illegal.

				example: int aMethod(int x)
						 void aMethod(int x)
						 // this is illegal

*/

public class OverloadingMethods {
	public static void main(Stirng[] args) {
		// variable declarations:



	}// end of main

	// method for double and rate in int overloaded:
	public static void calculateInterest(double bal, int rate) {
		double interest, rateAsPercent;
		rateAsPercent = rate / 100.00;
		interest = bal * rateAsPercent;
		System.out.println("Simple interest on $" + " at " + rate + "% rate is " interest);
	} // end of method

	// overloaded calculateInterest() methods that will take two doubles:
	// the compiler will know what method to use biased on the data that is passed to the method: 
	public static void calculateInterest(double bal, double rate) {

		double interest;
		interest = bal * rate;
		System.out.println("Simple interest on $" + " at " + rate + "% rate is " interest);
	}// end of method

}// end of class