import java.util.Scanner;
public class ChooseManager2 {
	public static void main(String[] args) {

		// declare the variables and constants:
		int eventType;
		String chosenManager;
		final int PRIVATE_CODE = 1;
		final int CORPORATE_CODE =2;
		final String PRIV_MANAGER = "Dustin Britt";
		final String CORP_MANAGER = "Carmen Lindsey";

		// define the input device:
		Scanner input = new Scanner(System.in);
		System.out.println("What type of event are you scheduling?");
		System.out.print("Enter " + PRIVATE_CODE + " for private, " + CORPORATE_CODE + " for corporate...");
		eventType = input.nextInt();

		// Use a switch statement to make your decision:
		switch(eventType) {
			case 1:
				chosenManager = PRIV_MANAGER;
				break;
			case 2:
				chosenManager = CORP_MANAGER;
				break;
			default:
				chosenManager = "Invalid Entry";
		}
			

		// Display the chosen code and corresponding manager's name:
		System.out.println("You entered " + eventType);
		System.out.println("Manager for this event will be " + chosenManager);
	}
}