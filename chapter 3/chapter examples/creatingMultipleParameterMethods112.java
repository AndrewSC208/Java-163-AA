/* Creating Methods that require multiple parameters: 

	Notes:
	This is a very simple concept that will allow you to pass many different values through a method:
	
*/

public class creatingMultipleParameterMethods112 {
	public static void main(String[] args) {

		// Variable declaration for predicRaiseUsingRate:
		double mySalary = 200.00;
		double moneyAmount = 800.00;
		double raiseRate = .15;

		// Variable declaration for compute:
		char vType = 'S';
		int value = 23000;
		double commRate = 0.08;


		// call method predictRaiseUsingRate:
		System.out.println("Demonstrating some raises");
		predictRaiseUsingRate(400.00, raiseRate);
		predictRaiseUsingRate(mySalary, raiseRate);
		predictRaiseUsingRate(moneyAmount, raiseRate);
		System.out.println(" ");

		// call method computeCommision:
		System.out.println("This is the calculation of commission on cars sold:");
		computeCommission(value, commRate, vType);
		computeCommission(40000, 0.10, 'L');

	}

	// creating method computeCommission:
	public static void computeCommission(int value, double rate, char vehicle) {
		//declare variables
		double commission;

		// set value of commission:
		commission = value * rate;

		//Print statements:
		System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
		System.out.println("with " + (rate * 100) + "% commission rate, the commission is $" + commission);
	
	}
	

	// creating method predictRaiseUsingRate:
	public static void predictRaiseUsingRate(double money, double rate) {
		double newAmount;
		newAmount = money * (1 + rate);

		System.out.println("With raise, new salary is " + newAmount);
	}

}