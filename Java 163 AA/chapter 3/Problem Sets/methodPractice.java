// this is an unrelated class that calls a method:
// this is some practice that I need to call some new methods:

public class methodPractice {
	public static void main(String[] args) {
		// this is the variable declarations: 
		int y = 10;
		int x = 25;

		// This is the first method that I am writing for this program. 
		nameAndAddress();

		// this is the method call for multiplyNumbers() and I will pass the value of x and y to it. 
		multiplyNumbers(x,y);


	} // end of main

	// this is a method that really I am not sure what I am going to do with:
	public static void nameAndAddress() {
		// This is a methos: 
		System.out.println("This is the name of a cool business");
		System.out.println("This is the second line of my address");
		System.out.println("I am going to grasp this concept and take it to town.");
	} // end of namerAndAddress()

	public static void multiplyNumbers(int x, int y) {
		// declaring local variables: 
		int product;
		
		product = x * y;
		// Print Statements
		System.out.println(product);
	}// end multiplyNumbers()
}