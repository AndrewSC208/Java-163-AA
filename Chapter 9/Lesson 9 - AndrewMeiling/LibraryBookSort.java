/* Filename LibraryBookSort.java */
/* Written by Andrew Meiling */
/* Written on April 19th, 2014 */
/* Chapter 9 */
/* Exercise # 3-b */
/* Pg 420 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import javax.swing.*;
import java.util.*;

public class LibraryBookSort
{
	public static void main(String[] args)
	{
		// variables:
		final int TOTAL_BOOKS = 5;
		String a = "", t = "", pgC = "", sortCodeString;
		int p = 0, sortCode;

		// Array of 5 objects:
		LibraryBook[] someBooks = new LibraryBook[TOTAL_BOOKS]; 
	    for(int x = 0; x < TOTAL_BOOKS; ++x)
	    {
	    	a = JOptionPane.showInputDialog(null, "Enter the authors name");
			t = JOptionPane.showInputDialog(null, "Enter the title of the book");
			pgC = JOptionPane.showInputDialog(null, "Enter the page count");
			p = Integer.parseInt(pgC);	
	    	someBooks[x] = new LibraryBook(a,t,p);
	    }
	    // Get what object the user wants to sort by:
	    sortCodeString = JOptionPane.showInputDialog(null, "What would you like to sort the books by? Enter 1 for Author , 2 for Title, 3 for Page Count:");
	    sortCode = Integer.parseInt(sortCodeString);
	    
	    // if statement to determine sort:
	    if(sortCode == 1)
	    {
	    	// sort by author:
	    	bubbleSortAuthor(someBooks);

	    } 
	    else if(sortCode == 2)
	    {
	    	// sort by title:
	    	bubbleSortTitle(someBooks);
	    	
	    } 
	    else if(sortCode == 3)
	    {
	    	// sort by page count:
	    	bubbleSortPageCount(someBooks); 

	    } 
	    else
	    	JOptionPane.showMessageDialog(null, "You did not enter a valid sort code.");

	    // Display info:
	    System.out.println(someBooks[0].getAuthor() + " " + someBooks[0].getTitle() + " " + someBooks[0].getPageCount());
	    System.out.println(someBooks[1].getAuthor() + " " + someBooks[1].getTitle() + " " + someBooks[1].getPageCount());
	    System.out.println(someBooks[2].getAuthor() + " " + someBooks[2].getTitle() + " " + someBooks[2].getPageCount());
	    System.out.println(someBooks[3].getAuthor() + " " + someBooks[3].getTitle() + " " + someBooks[3].getPageCount());
	    System.out.println(someBooks[4].getAuthor() + " " + someBooks[4].getTitle() + " " + someBooks[4].getPageCount());

	    } // end of main class.

    // Bubble sort method that will sort based of array objects:
    public static void bubbleSortAuthor(LibraryBook[] array)
    {
    	int a, b;
    	LibraryBook temp;
    	int highSubscript = array.length -1;
    	for(a = 0; a < highSubscript; ++a)
    	{
    		for(b = 0; b < highSubscript; ++b)
    		{
    			if(array[b].getAuthor().charAt(0) > array[b + 1].getAuthor().charAt(0))
    			{
    				temp = array[b];
    				array[b] = array[b + 1];
    				array[b + 1] = temp;
    			}
    		}
    	}
    }
    public static void bubbleSortTitle(LibraryBook[] array)
    {
    	int a, b;
    	LibraryBook temp;
    	int highSubscript = array.length -1;
    	for(a = 0; a < highSubscript; ++a)
    	{
    		for(b = 0; b < highSubscript; ++b)
    		{
    			if(array[b].getTitle().charAt(0) > array[b + 1].getTitle().charAt(0))
    			{
    				temp = array[b];
    				array[b] = array[b + 1];
    				array[b + 1] = temp;
    			}
    		}
    	}
    }
    public static void bubbleSortPageCount(LibraryBook[] array)
    {
    	int a, b;
    	LibraryBook temp;
    	int highSubscript = array.length -1;
    	for(a = 0; a < highSubscript; ++a)
    	{
    		for(b = 0; b < highSubscript; ++b)
    		{
    			if(array[b].getPageCount() > array[b + 1].getPageCount())
    			{
    				temp = array[b];
    				array[b] = array[b + 1];
    				array[b + 1] = temp;
    			}
    		}
    	}
    }
}

























