// test methods 
public class testMethods {
	public static void main(String[] args) {
		// variables:
		int one = 75, two = 80;

		//passing variables through methods:
		displayIt(one);
		displayIt(two);

		// passing variables through methods:
		displayItTimesTwo(one);
		displayItTimesTwo(two);

		// Passing variables through methods:
		displayItPlusOneHundred(one);
		displayItPlusOneHundred(two);
	}
	public static void displayIt(int x) {

		// print statement:
		System.out.println(x);

	}

	public static void displayItTimesTwo(int x) {
		// Variables:
		int y;
		// math:
		y = x * 2;
		// Print statement:
		System.out.println(y);
	}

	public static void displayItPlusOneHundred(int x) {
		// variables:
		int y;
		// math:
		y = x + 100;
		// Print statements:
		System.out.println(y);
	}
}