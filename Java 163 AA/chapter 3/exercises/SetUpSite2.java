// shell class to create a SetUpSite class and an empty main()

// Import the scanner class:
import java.util.Scanner;

public class SetUpSite2 {
	
	public static void main(String[] args) {

		// Variable declarations
		final int FOUNDED_YEAR = 1977;
		int currentYear;
		int age;
		// Declaration on the scanner class:
		Scanner input = new Scanner(System.in);


		// this is the method call:
		statementOfPhilosophy();

		System.out.print("Enter the crrent year as a four-digit number ");
		currentYear = input.newInt();

		age = claculateAge(FOUNDED_YEAR, currentYear);

		System.out.println("Founded in " + FOUNDED_YEAR);
		System.out.println("Serving you for" + age + " years "):
	}

	public static void statementOfPhilosophy() {
		System.out.println("Event Handlers Incorporated is");
		System.out.println("dedicated to making your event");
		System.out.println("a most memorable one.");
	}

	public static int calculateAge(int originYear, int currDate) {
		int years;
		years = currDate - originYear;
		return years;
	}
}
