/* Filename Die.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* Game Zone exercise #13-14 */
/* Pg 209 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */
/* MEID AND2182148 */

public class Die 
{
	// Data fields:
	private int randomValue;
	private int roll;
	private int LOWEST_DIE_VALUE = 1;
	private int HIGHEST_DIE_VALUE = 6;

	
    public Die()
	{
		randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}

	// setter method:
	public void setDie() 
	{
		roll = randomValue;
	}

	// getter method:
	public int getDie()
	{
		return randomValue;
	}
}