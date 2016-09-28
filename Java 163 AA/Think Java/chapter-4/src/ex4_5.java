
public class ex4_5 {
	
	public static void checkFermat(int a, int b, int c, int n) {
		if (n > 2) {
			int x = raiseToPow(a,n);// this is what I was told to use instead of math.pow(x,n);
			int y = raiseToPow(b,n);
			int z = raiseToPow(c,n);
			if (x + y == c) {
				System.out.println("Holy crap Fermat's therom is wrong!");
			} else {
				System.out.println("No, that doesn't work!");
			}
		} else {
			System.out.println("Only powers that are above 2 please!");
		}
	}

	public static void main(String[] args) {
		checkFermat(5,10,3,5);
	}
}
// This program would actually run if you sub raiseToPow(a,n) with Math.Pow(a,n) but that was not the instructions.