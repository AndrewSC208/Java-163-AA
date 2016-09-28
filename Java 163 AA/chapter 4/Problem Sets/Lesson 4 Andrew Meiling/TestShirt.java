/* Filename TestShirt.java */
/* Written by Andrew Meiling */
/* Written on February 25th, 2014 */
/* Chapter 4 */
/* Exercise # 5 */
/* Pg 207 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class TestShirt {
	public static void main(String[] args) {
		// neck variables:
		double smallNeck = 14.00;
		double medNeck = 15.50;
		double lgNeck = 16.00;
		// sleeve variables:
		double shortSleeve = 30.00;
		double medSleeve = 33.50;
		double lgSleeve = 36.50;

	// Create three different shirt objects:
	Shirt smShirt = new Shirt(smallNeck, shortSleeve, 2);
	Shirt medShirt = new Shirt(medNeck, medSleeve, 1);
	Shirt lgShirt = new Shirt(lgNeck, lgSleeve, 0);

	// Display information of three different shirts:
	
	smShirt.showShirt();
	medShirt.showShirt();
	lgShirt.showShirt();
	
	}
}