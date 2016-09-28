/* Filename Service.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* exercise # 5 */
/* Pg 420-421 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */
/* MEID AND2182148 */

public class Service 
{
	// Variables:
	private String descripton, x;
	private double price, y;
	private int time, z;

// constructor to that takes three values to return the data fields:
	public Service(String x, double y, int z)
	{
		 descripton = x;
		 price = y;
		 time = z;
	}
	// get methods for the data types:
	public String getDescription()
	{
		descripton = x;
		return descripton;
	}
	public double getPrice()
	{
		price = y;
		return price;
	}
	public int getTime()
	{
		time = z;
		return time;
	}


}