// this is the you do it section on chapter 3
// import the scanner:
import java.util.Scanner;

public class SetUpSite2 { 
	public static void main(String[] args) {
		final int FOUNDED_YEAR = 1977;
		int currentYear;
		int age;
		// this is for the scanner:
		Scanner input = new Scanner(System.in);

		// method call of statementOfPhilosophy():
		statementOfPhilosophy();

		// we need some infor from the user:
		System.out.println("Enter the current year as a four-digit number ");
		currentYear = input.nextInt();

		age = calculateAge(FOUNDED_YEAR, currentYear);

		// these are print statemts for the information:
		System.out.println("Founded in " + FOUNDED_YEAR);
		System.out.println("Serving you for " + age + " years!");
	} // end of main

	// this is the method of statementOfPhilosophy(): 
	public static void statementOfPhilosophy() {
		System.out.println("Event Handlers incorporated is");
		System.out.println("dedicated to making your event");
		System.out.println("a most memorable one.");
	}
	public static int calculateAge(int originYear, int currDate) {
		int years;
		years = currDate - originYear;
		return years;
	}
}