// Working with prefix and postfix increments operators:
public class DemoIncrament2 {
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

		// variable declaration:
		int w = 17, x = 17, y = 18;
		boolean compare1 = (++w == y);
		boolean compare2 = (x++ == y);

		// Print statements:
		System.out.println("First compare is " + compare1);
		System.out.println("Second compare is " + compare2);

	}
}