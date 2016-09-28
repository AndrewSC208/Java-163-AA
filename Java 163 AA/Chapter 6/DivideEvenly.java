// DivideEvenly exercise:
public class DivideEvenly {
	public static void main(String[] args) {

		// variable declaration:
		final int LIMIT = 1000000;
		int var;

		// Print statements:
		System.out.print(LIMIT + " is evenly divisible by: ");

		// for loop:
		for(var = 1; var <= LIMIT; ++var){
			if(LIMIT % var == 0)
				System.out.print(var + "  ");
				// Display the number and two spaces. 
		}

		System.out.println();


	}
}