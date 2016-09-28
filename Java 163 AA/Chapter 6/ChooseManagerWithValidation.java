// YOU DO IT EXAMPLE ONE:
import java.util.Scanner;
public class ChooseManagerWithValidation {
	public static void main(String[] args) {

		// Variable declarations:
		int eventType;
		String chosenManager;
		final int PRIVATE_CODE = 1;
		final int CORPORATE_CODE = 2;
		final String PRIV_MANAGER = "Dustin Britt";
		final String CORP_MANAGER = "Carmen Lindsey";
		Scanner input = new Scanner(System.in);

		// Get the info that you need from the user:
		System.out.println("What type of event are you scheduling?");
		System.out.print("Enter " + PRIVATE_CODE + " for private, " + CORPORATE_CODE + " for corporate. >> ");
		eventType = input.nextInt();

		// Loop to validate:
		while(eventType != PRIVATE_CODE && eventType != CORPORATE_CODE) {
			System.out.println("You made an invalid selection");
			System.out.println("You entered " + eventType);
			System.out.print("Please enter " + PRIVATE_CODE + " for private, " + CORPORATE_CODE + " for corporate. >> ");
			eventType = input.nextInt();

		// Decision structure:
		if(eventType == PRIVATE_CODE)
			chosenManager = PRIV_MANAGER;
		else
			chosenManager = CORP_MANAGER;

		// display values:
		System.out.println("You entered " + eventType);
		System.out.println("Manager for this event will be " + chosenManager);
		}
	}
}