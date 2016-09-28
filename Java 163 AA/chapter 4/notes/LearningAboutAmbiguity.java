/* 

	notes:
		1. Learning about ambiguity:
			i. this is when you create a method that accepts a double but you pass an int to it so that the int then get type castes or promoted to a double. 
			ii. when you overload methods, you risk creating an ambiguous situation - one in which the compiler cannot determine which method to use.   

*/

public class LearningAbourAmbiguity {
	public static void main(String[] args) {
		double doubleValue = 45.67;
		int intValue - 17;

		simpleMethod(doubleValue);
		simpleMethod(intvalue);

	}// end main
	// overloaded methods:
	public static void simpleMethod(double d) {
		System.out.println("Method receives double parameter");
	}

	public static void simpleMethod(int d) {
		System.out.println("Method receives integer parameter");
	}
}