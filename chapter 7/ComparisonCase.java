/* Filename ComparisonCase.java */
/* Written by Andrew Meiling */
/* Written on April 5th, 2014 */
/* Chapter 7 */
/* Exercise # 5 */
/* Pg 334 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.Scanner;

public class ComparisonCase
{
  public static void main(String [] args)
  {
    // Declare variables:
    String nameOne = "Andrew";
    String nameTwo = "ANDREW";
    
    // Compare the two names and the case:
    System.out.println("Compare two name and the case: ");
    compareNameAndCase(nameOne, nameTwo);
    // compare the two name and ignore the case:
    
    System.out.println("Compare two names and ignoring the case: ");
    compareNamesIgnoringCase(nameOne, nameTwo);
  }
  // Lets make some methods:
  // method to compare the names and the case:
  public static void compareNameAndCase(String one, String two)
  {
      if(one.equals(two))
      {
        System.out.println("True");
      }
      else
      {
        System.out.println("False");
      }
  }
  public static void compareNamesIgnoringCase(String one, String two)
  {
      if(one.equalsIgnoreCase(two))
      {
        System.out.println("True");
      }
      else
      {
        System.out.println("False");
      }
  }
}