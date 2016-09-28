/* Filename SalonReport.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* exercise # 5 */
/* Pg 420-421 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */
/* MEID AND2182148 */

import java.util.Scanner;

public class SalonReport
{
	public static void main(String[] args)
	{
		// variables:
		int menuInput;


		// create a scanner:
		Scanner input = new Scanner(System.in);

		// I need to create an array to hold six service objects and fill it will info from the chart:
		Service report[] = new Service[7];


		report[0] = new Service("Cut", 8.00, 15);
		report[1] = new Service("Shampoo", 4.00, 10);
		report[2] = new Service("Manicure", 18.00, 30);
		report[3] = new Service("Style", 48.00, 55);
		report[4] = new Service("Permanent", 18.00, 35);
		report[5] = new Service("Trim", 6.00, 5);
		

		do 
		{
			System.out.print("Enter 1) to sort by description 2) to sort by price 3) Sort by Time(Minutes) 0) to Exit >> ");
			menuInput = input.nextInt();

			System.out.println(menuInput);

			// this where I sort everything:
			if(menuInput == 1)
			{
				// this will sort by description:
				sortDescription(report);
				
			}
			else if(menuInput == 2)
			{
				// this will sort by price:
				sortPrice(report);
			}
			else if(menuInput == 3)
			{
				// this will sort by the time:
				sortTime(report);
			}
			else
				System.out.println("You did not enter a valid sort option.");


		} while(menuInput != 0);
	}
	public static void sortDescription(Service[] array)
	{
		int a, b;
		Service temp;
		int hightSubscript = array.length-1;
		for(a = 0; a < hightSubscript; ++a)
		{
			for(b = 0; b < hightSubscript; ++b)
			{
				if(array[b].getDescription().length() > array[b + 1].getDescription().length())
				{
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
		}
	}
	public static void sortPrice(Service[] array)
	{
		int a, b;
		Service temp;
		int hightSubscript = array.length-1;
		for(a = 0; a < hightSubscript; ++a)
		{
			for(b = 0; b < hightSubscript; ++b)
			{
				if(array[b].getPrice() > array[b + 1].getPrice())
				{
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
		}
	}
	public static void sortTime(Service[] array)
	{
		int a, b;
		Service temp;
		int hightSubscript = array.length-1;
		for(a = 0; a < hightSubscript; ++a)
		{
			for(b = 0; b < hightSubscript; ++b)
			{
				if(array[b].getTime() > array[b + 1].getTime())
				{
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
		}
	}
}











