/* Creating methods that return values: page 114

	Notes: 

	I. A method ends when any of the following events take place:
		1. the method completes all of its statements.
		2. The method throws an exception. Exceptions are errors; you will learn about them in the chapter Exception handling.
		3. The method reaches a return statement. 
			a. return statement: causes a method to end and the program's logic to return to the calling method. Also, a return statement frequently sends a value back to the calling method.
	II. The return type for a method can be any type used in Java, which includes the primitive types, int, double, char, and so on, as will as class types (including class types you create)
		1. A method's return type is know more succinctly as a method's type.
		2. A method's declared return type must match the type of the value used in the return statement; if i does not, the class does not compile. 
		3. A method can return, at most, one value. The value can be primitive data type, such as int, char, or double, or it can be a class type.
	III. You cannot place any statements after a method's return statement. 
		1. Such statements are unreachable statements because the logical flow leaves the method at the return statement. 
			a. An unreachable statement can never execute, and it causes a compiler error. Unreachable statements are also called dead code. 

	IV. Ways of using the returned value:
		1. The predictRaise() method returns a double, so it is appropriate to assign the method's returned value to a double variable:

			myNewSalary = predictRaise(mySalary);

		2. Alternatively, you can choose to use a method's returned value directly, without storing it in any variable. 

			System.out.println("New salary is " + calculateRaise(mySalary));

		3. You can also use the method call calculateRaise() in the same way that you would use any simple double value:

			double spendingMoney = calculateRaise(mySalary) - expenses;

	V. Chaining Method calls:
		1. Any method might call any number of other methods.
			a. For example: a main() method might call a predictRaise() method, and the predictRaise() method might call a calculateBonus() method.
				i. Looking at the call to the calculateBonus() method from the predictRaise() method, you do not know how to calculateBouse() works. You only know that it accepts a double as a parameter. 
				ii. This is the black box effect that they are talking about. 

*/

public class creatingMethodsThatReturnValues {
	public static void main(String[] args) {

		// declaring variables:
		double salary = 40000;
		double expenses = 1000;
		double myNewSalary, spendingMoney;

		// lets call this method by assigning it to another double:
		System.out.println("This is the first way to call and use the value of the variable: ");
		myNewSalary = predictRaise(salary);
		System.out.println(myNewSalary);
		System.out.println(" ");

		//  Lets call the method by using it directly:
		System.out.println("New salary is " + predictRaise(salary));
		System.out.println(" ");

		// This is the third and final way to call the method, by using it like you would any other double value:
		spendingMoney = predictRaise(salary) - expenses;
		System.out.println(spendingMoney);
		System.out.println(" ");


	
	} // end of main

	// creating method predictRaise: 
	public static double predictRaise(double moneyAmount) {
		// declaring method variables:
		double newAmount;
		final double RAISE = 1.10;

		// math
		newAmount = moneyAmount * RAISE;

		// return value of method:
		return newAmount;

	} // end of predictRaise()

} // end class creatingMethodsThatReturnValues{}








