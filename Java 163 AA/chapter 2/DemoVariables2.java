// This is example one

import java.util.Scanner;

public class DemoVariables2 {
	public static void main(String[] args) {

		//declare int's, and scanner
		int entry;
		Scanner keyBoard = new Scanner(System.in);

		//ask for int and assign from entry
		System.out.print("Enter and integer ");
		entry = keyBoard.nextInt();

		// this will now tell us what the int is.
		System.out.print("The entry is ");
		System.out.print(entry);
		
		// this is just to make a space after the line. 
		System.out.println(" ");

	}
}