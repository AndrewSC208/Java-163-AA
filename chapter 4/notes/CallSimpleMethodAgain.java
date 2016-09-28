public class CallSimpleMethodAgain {
	public static void main(String[] args) {
		double doubleValue = 45.67;
		int intValue = 17;
		simpleMethod(doubleValue);
		simpleMethod(inValue);
	} // end of main 
	public static void simpleMethod(double d) {
		System.out.println("Method receives double parameter");
	}
	public static void simpleMethod(int d) {
		System.out.println("Method receives integer parameter");
	}
} // end of class