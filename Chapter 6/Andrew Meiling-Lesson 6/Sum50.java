/* Filename Sum50.java */
/* Written by Andrew Meiling */
/* Written on March 22nd, 2014 */
/* Chapter 6 */
/* Exercise # 4 */
/* Pg 296 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class Sum50 {
	public static void main(String[] args) {
		// variable declarations:
		int total = 0;

		for(int val = 1; val <= 50; val++) {
			total = val + total;

			System.out.println(total);
		}

	}
}