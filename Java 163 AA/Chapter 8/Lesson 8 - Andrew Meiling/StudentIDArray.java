/* Filename StudentIdArray.java */
/* Written by Andrew Meiling */
/* Written on April 16th, 2014 */
/* Chapter 8 */
/* Exercise # 12 */
/* Pg 377 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */


import javax.swing.*;

public class StudentIDArray {
  public static void main(String[] args) {
    
    // Variables:
    String studentIdString;
    int studentIdNum, i;
    boolean print = false;
    // Arrays:
    int[] studentID      = {    1234,      4565,   4567,      1235,   5648,       5852,        4562,       4567,     8523,   4568};
    String[] studentName = {"Andrew", "Jeffery", "Anna", "Melissa", "Drew", "Brittany", "Stephanie", "Mitchell", "Robbie", "John"};
    double[] gpa         = {     3.3,       3.4,    3.7,       3.8,   2.1,         3.1,        4.00,        2.1,      2.2,   2.30};
    
    // Get user input:
    studentIdString = JOptionPane.showInputDialog(null, "Please enter a valid student ID number: ");
    studentIdNum = Integer.parseInt(studentIdString);
    
    // write a for loop that goes through every item in the studentID array and compares input to data:
    for(i = 0; i < studentID.length; ++i)
    {
      if(studentID[i] == studentIdNum)
      {
        JOptionPane.showMessageDialog(null,"You entered the student ID number of: " + studentIdNum + " the name of the students name is: " + studentName[i] + " and their GPA is: " + gpa[i]);
        print = true;
        i = studentID.length + 999;
      }
      else
      {
        print = false;  
      }
    }
    if(print == false) 
    {
      JOptionPane.showMessageDialog(null, "You did not enter a valid student ID number");
    }
  }
}
