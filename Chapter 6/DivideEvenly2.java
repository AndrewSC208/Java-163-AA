// DivideEvenly exercise:
public class DivideEvenly2 {
	public static void main(String[] args) {

		// variable declaration:
		final int LIMIT = 100;
		int var;
		int number;

		// Print statements:
		System.out.print(LIMIT + " is evenly divisible by: ");

		// for loop:
		for(number = 1; number <= LIMIT; ++number) {
			System.out.print(number + " is evenly divisible by ");
			for(var = 1; var <= number; ++var)
				if(number % var == 0)
					System.out.print(var + " ");
					// Display the number and two spaces

			System.out.println();
		}

	}
}