/* Filename StudentIdArray.java */
/* Written by Andrew Meiling */
/* Written on April 16th, 2014 */
/* Chapter 8 */
/* Exercise # 6 */
/* Pg 376 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import javax.swing.*;
import java.util.*;

public class ConvertDate {
  public static void main(String[] args) {
    // variables:
    final int MONTH_MAX = 12;
    final int MONTH_MIN = 1;
    int    monthNum,    dateNum,    yearNum, fullDateStringLength;
    String monthString = "", dateString = "", yearString = "", fullDateString, month = "";
    int testNum, i, index = 0, dayOfYear;
    char x, c;

    // parallel arrays:
    int[] monthNumArray       = {  0,         1,          2,       3,       4,     5,      6,      7,        8,           9,        10,         11,         12};
    String[] monthStringArray = {"x", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int[] maxDaysInMonth      = {  0,         31,        28,      31,      30,    31,     30,     31,       31,          30,        31,         30,         31};
    // Get the date from the user:
    fullDateString = JOptionPane.showInputDialog(null, "Please enter a date in the formate MM/DD/YYYY");

   	// Loop to separate date info:
    fullDateStringLength = fullDateString.length();
	for(i = 0; i < fullDateStringLength; i++)
	{
		c = fullDateString.charAt(i);
		if(c == '/')
		{
			monthString = fullDateString.substring(0,i);
			index = i + 1;
			for(i = index; i < fullDateStringLength; i++)
			{
				c = fullDateString.charAt(i);
				if(c == '/')
				{
					dateString = fullDateString.substring(index, i);
					index = i + 1;
					yearString = fullDateString.substring(index, index + 4);
					i = 999;
					
				}
			}
		}
	}

	// I need to now convert String info to integers:
	monthNum = Integer.valueOf(monthString);
	dateNum  = Integer.valueOf(dateString);
	yearNum  = Integer.valueOf(yearString);

	// month validation:
	if(monthNum < 0 || monthNum > 12)
	{
		JOptionPane.showMessageDialog(null, "You have entered an invalid month!");
	}
	else 
	{
		month = monthStringArray[monthNum];
	}

	// date validation:
	if(dateNum < 0 || dateNum > maxDaysInMonth[monthNum])
	{
		JOptionPane.showMessageDialog(null, "You have entered an invalid date!");
	}

	GregorianCalendar date = new GregorianCalendar(yearNum, monthNum, dateNum);
	dayOfYear = date.get(GregorianCalendar.DAY_OF_YEAR);

	JOptionPane.showMessageDialog(null, "Date is " + month + ", " + dateNum + " " + yearNum + "\nDay in the year is " + dayOfYear);
	
    }
}