/* Filename Schedule.java */
/* Written by Andrew Meiling */
/* Written on April 19th, 2014 */
/* Chapter 9 */
/* Exercise # 4 */
/* Pg 420 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.*;

public class Schedule 
{
	public static void main(String[] args)
	{
		// variables:
		String entry;
		int x = 0;
		boolean z = false;
		Scanner input = new Scanner(System.in);

		// classes[class][day]
		String[][] classes = { {"CIS 110", "M, W, F 8:00 am" },
                               {"MAT 122", "T, Th   8:00 am" },
                               {"CIS 130", "M, W, F 12:00 pm"}, 
                               {"MAT 140", "T, Th   12:00 pm"} };
        // get class from user:
        System.out.print("Enter the class code >> ");
        entry = input.nextLine();
        // Test loop:
        for(x = 0; x < classes.length; ++x)
    	{
    		if(classes[x][0].equals(entry))
    		{
    			System.out.println(classes[x][1]);
    			z = true;
    		}
    	}

    	if(z == false)
    	{
    		System.out.println("You did not enter a valid class!");
    	}
	}
}