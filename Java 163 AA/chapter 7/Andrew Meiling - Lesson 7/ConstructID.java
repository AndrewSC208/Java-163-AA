/* Filename ComparisonCase.java */
/* Written by Andrew Meiling */
/* Written on April 5th, 2014 */
/* Chapter 7 */
/* Exercise # 11 */
/* Pg 336 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import javax.swing.*;

public class ConstructID
{
  public static void main(String[] args)
  {
    //variables; 
    String initials = "";
    String fullName;
    String fullAddress;      
    String addressNumString = ""; 
    int addressNum, stringLengthName, stringLengthAddress, i;          
    char c;

    // get the full name:
    fullName = JOptionPane.showInputDialog(null, "Please write you full name: ");

    // get the address:
    fullAddress = JOptionPane.showInputDialog(null, "Please enter the address that you currently live at: ");

    // first lets get the initials of the name:
    stringLengthName = fullName.length();
    // loop to get the initials:
    for(i = 0; i <stringLengthName; i ++)
    {
      c = fullName.charAt(i);
      if(i == 0)
      {
        c = Character.toUpperCase(c);
        initials = c + fullName.substring(0,i);
      }
      else
      {
        if(fullName.charAt(i) == ' ')
        {
          ++i;
          c = fullName.charAt(i);
          c = Character.toUpperCase(c);
          initials = initials + c;
        }
      }
    }

    // Get the numbers from the address:
    stringLengthAddress = fullAddress.length();
    // loop to get the numbers from the address:
    for(i =0; i < stringLengthAddress; i ++)
    {
      c = fullAddress.charAt(i);
      if(Character.isDigit(c))
      {
        addressNumString = c + fullAddress.substring(0,i);
      }
    }

    // Print out the created ID:
    System.out.println(initials + addressNumString);
    
  }
}