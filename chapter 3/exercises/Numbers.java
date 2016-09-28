// numbers.java

public class Numbers {
	public static void main(String[] args) {
		int one = 400, two = 230;

		// method calls:
		sum(one, two);
		difference (one, two);

	}
	public static void sum(int x, int y) {
		int sum;

		sum = x + y;

		System.out.println("The sum is: " + sum);
	}
	public static void difference(int x, int y) {
		int difference;
		difference = x - y;
		System.out.println("The difference is: " + difference);

	}
}