// StudentIDArray.java

//
import java.util.#;

public class StudentIDArray {
  public static void main(String[] args) {
    
    // Variables:
    String studentIdString;
    int studentIdNum;
    // Arrays:
    int[] studentID      = {    1234,      4565,   4567,      1235,   5648,       5852,        4562,       4567,     8523,   4568};
    String[] studentName = {"Andrew", "Jeffery", "Anna", "Melissa", "Drew", "Brittany", "Stephaine", "Mitchell", "Robbie", "John"};
    double[] gpa         = {     3.3,       3.4,    3.7,       3.8,   2.1,         3.1,        4.00,        2.1,      2.2,   2.30};
    
    // Get user input:
    studentIdString = JOptionPane.showInputDialog(null, "Please enter a valid student ID number: ");
    studentIdNum = Integer.parseInt(studentIdString);
    
    // write a for loop that goes through every item in the studentID array and compars input to data:
    for(i = 0; i < studentID.length; i++)
    {
      if(studentId[i] = studentIdNum)
      {
        JOptionPane.showMessaageDialog(null,"You entered the student ID number of: " + studentIdNum + " the name of the students name is: " + studentName[i] + "and their GPA is: " + gpa[i]);
      }
      else
      {
        JOptionPane.showMessageDialog(null, "You did not enter a valid student ID number!");
      }
    } // end loop
  }
}