public class Employee {

	// Variable declarations:
	private int empNum;
	private double empPayRate;

	// methods:

	// methods construct:
	public void setValues() {
		empNum = 111;
		empPayRate = 22.22;
	}

	public void methodThatUsesInstanceAttributes() {
		System.out.println("Employee number is " + empNum);
		System.out.println("Pay rate is " + empPayRate);
	}

	public void methodThatUsesLocalVariables() {
		int empNum = 33333;
		double empPayRate = 555.55;
		System.out.println("Employee number is " + empNum);
		System.out.println("Pay rate is " + empPayRate);
	}
	
}