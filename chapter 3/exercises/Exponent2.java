// Exponent.java
import java.util.Scanner;

public class Exponent2 {
	public static void main(String[] args) {
		// Variables: 
		int x;
		// Scanner class:
		Scanner input = new Scanner(System.in);

		// Get info from the user:
		System.out.print("Type and int: ");
		x = input.nextInt();

		squares(x);

		cubed(x);

	}
	public static void squares(int x) {
		int squared;

		squared = x * x;

		System.out.println(squared);
	}
	public static void cubed(int x) {
		int cubed;

		cubed = x * x * x;

		System.out.println(cubed);
	}
}