// This is example one

import java.util.Scanner;

public class DemoVariables5 {
	public static void main(String[] args) {

		//declare int's, and scanner
		int entry;
		int anotherEntry;
		Scanner keyBoard = new Scanner(System.in);

		//ask for int and assign from entry
		System.out.print("Enter and integer ");
		entry = keyBoard.nextInt();

		//ask for int and assign from anotherEntry
		System.out.print("Enter and integer ");
		anotherEntry = keyBoard.nextInt();

		// this will now tell us what the int is.
		System.out.print("The entry is ");
		System.out.println(entry);

		// this will now tell us what the int is.
		System.out.print("The other entry is ");
		System.out.println(anotherEntry);

		// This is all of the fun math with the two different variables:
		System.out.println(entry + " plus " + anotherEntry + " is " + entry + anotherEntry);
		// If I take out the parens then it java with think of it as a string and concatinate them instead of adding them

		System.out.println(entry + " minus " + anotherEntry + " is " + (entry - anotherEntry));

		System.out.println(entry + " times " + anotherEntry + " is " + entry * anotherEntry);
		// So if I take out the parens around entry and anotherEntry then it will still multiply them. This is becasue of the order of operations.

		System.out.println(entry + " divided " + anotherEntry + " is " + (entry / anotherEntry));

		System.out.println("The remainder is " + (entry % anotherEntry));	

		// this is just to make a space after the line. 
		System.out.println(" ");

	}
}