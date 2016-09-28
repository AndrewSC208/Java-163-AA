// this is the adding parameters to methods section page 108
public class addingParametersToMethods108 {
	public static void main(String[] args) {

		/* notes:
			1. Arguments: This is data that is being sent to the method.
			2. Parameters: When the method receives the data items, they are called parameters. 
			
			I. An important principle of object-oriented programming is the notation of implementation hiding,
				a. the encapsulation of method details within a class. 
				b. This is when a client calls a method, it doesn't need to know the details of how the method is executed. 
				c. In other words the client only needs to know the interface of the method and not how it works. 
			II. When you are writing a method that accepts a parameter you have to declare the variable type and name inside of the parenthesis.
				A. Think of the parenthesis as a funnel into the method. 
			III. The parameter moneyAmount is a local variable to the predictRaise() method; that is, it is known only within the boundaries of the method.
		    

		*/

		// Variable declaration in class:
		double mySalary = 200.00;
		double moneyAmount = 800.00;

		// call method:
		System.out.println("Demonstrating some raises");
		predictRaise(400.00);
		predictRaise(mySalary);
		predictRaise(moneyAmount);


	}

	// Definition of predictRaise that will accept a parameter.
	public static void predictRaise(double moneyAmount) {
		
		// variable declaration inside method:
		double newAmount;
		final double RAISE = 1.10;

		// define moneyAmount:
		newAmount = moneyAmount * RAISE;

		// Print is out:
		System.out.println("With raise, salary is " + newAmount);
	}

}