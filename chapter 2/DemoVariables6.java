// This is example one

import java.util.Scanner;

public class DemoVariables6 {
	public static void main(String[] args) {

		//declare int's, and scanner
		double entry;
		double anotherEntry;
		Scanner keyBoard = new Scanner(System.in);

		//ask for int and assign from entry
		System.out.print("Enter a double ");
		entry = keyBoard.nextDouble();

		//ask for int and assign from anotherEntry
		System.out.print("Enter a another double ");
		anotherEntry = keyBoard.nextDouble();

		// this will now tell us what the int is.
		System.out.print("The entry is ");
		System.out.print(entry);

		// this will now tell us what the int is.
		System.out.print("The other entry is ");
		System.out.print(anotherEntry);

		// This is all of the fun math with the two different variables:
		System.out.println(entry + " plus " + anotherEntry + " is " + (entry + anotherEntry));

		System.out.println(entry + " minus " + anotherEntry + " is " + (entry - anotherEntry));

		System.out.println(entry + " times " + anotherEntry + " is " + (entry * anotherEntry));

		System.out.println(entry + " divided " + anotherEntry + " is " + (entry / anotherEntry));

		System.out.println("The remainder is " + (entry % anotherEntry));	

		// this is just to make a space after the line. 
		System.out.println(" ");

	}
}