// Working with prefix and postfix increments operators:
public class DemoIncrement {
	public static void main(String[] args) {

		// variable declarations:
		int v = 4;
		int plusPlusV = ++v;
		v = 4;
		int vPlusPlus = v++;

		// print statements:
		System.out.println("V is " + v);
		System.out.println("++v is " + plusPlusV);
		System.out.println("v++ is " + vPlusPlus);

	}
}