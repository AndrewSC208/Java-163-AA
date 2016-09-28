// shell class to create a SetUpSite class and an empty main()

// Import the scanner class:
import java.util.Scanner;

public class SetUpSite3 {
	
	public static void main(String[] args) {

		// Variable declarations
		final int FOUNDED_YEAR = 1977;
		int currentYear;
		int age;
		// Declaration on the scanner class:
		Scanner input = new Scanner(System.in);
		// Declares new EventSite and names it oneSite.
		EventSite oneSite = new EventSite();
		int siteNum;


		// this is the statementOfPhilosophy() call:
		statementOfPhilosophy();

		// This is input scanner that assigns a value to currentYear:
		System.out.print("Enter the current year as a four-digit number ");
		currentYear = input.nextInt();

		// This is the input scanner that assigns a value to siteNum
		System.out.print("Enter the event site number ");
		siteNum = input.nextInt();

		// This passes siteNum int to EventSite and sets siteNum as sitNumber in EventSite method:
		oneSite.setSiteNumber(siteNum);

		// The calculateAge method call and sets value to age:
		age = calculateAge(FOUNDED_YEAR, currentYear);

		// Print statements: 
		System.out.println("Founded in " + FOUNDED_YEAR);
		System.out.println("Serving you for " + age + " years ");
		System.out.println("The site number is " + oneSite.getSiteNumber());
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
