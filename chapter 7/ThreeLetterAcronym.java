/* Filename ComparisonCase.java */
/* Written by Andrew Meiling */
/* Written on April 5th, 2014 */
/* Chapter 7 */
/* Exercise # 8 */
/* Pg 335 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import javax.swing.*;

public class ThreeLetterAcronym
{
  public static void main(String[] args)
  {
    // Variables:
    String phrase, saveOriginalPhrase, acronym = "";
    int stringLength, i;
    char c;

    // Get phrase from user:
    phrase = JOptionPane.showInputDialog(null, "Please enter a three word phrase that you would like convert to an acronym.");

    saveOriginalPhrase = phrase;

    // get the length of the string:
    stringLength = phrase.length();

    //loop:
    for(i = 0; i < stringLength; i ++)
    {

      c = phrase.charAt(i);
      if(i == 0)
      {
        c = Character.toUpperCase(c);
        acronym = c + phrase.substring(0, i);
      }
      else
      {
        if(phrase.charAt(i) == ' ')
        {
          ++i;
          c = phrase.charAt(i);
          c = Character.toUpperCase(c);
          acronym = acronym + c;
        }
      }
    }

  // validate the length of the acronym and output info:
  if(acronym.length() < 3)
  {
    JOptionPane.showMessageDialog(null, "You entered a phrase that is less then three words, please try again!");

  }
  else if(acronym.length() == 3)
  {
    JOptionPane.showMessageDialog(null, "The original phrase was " + saveOriginalPhrase + "\nand the acronym is " + acronym);
  }
  else
  {
    JOptionPane.showMessageDialog(null, "You entered a phrase that is greater then three words, please try again!"); 
  }
  

  } 
}



