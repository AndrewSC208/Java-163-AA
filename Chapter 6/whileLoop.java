public class whileLoop {
	public static void main(String[] args) {
		// this is a little while loop that is all:

		int val;
		final int LIMIT = 10000000;

		val = 1;
		while(val < LIMIT) {
			System.out.println(val);
			val = val + 1; 
		}
	}
}