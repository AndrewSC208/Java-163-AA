// convert data.

public class ConvertData {
  public static void main(String[] args) {
    // variables:
    int    monthNum,    dateNum,    yearNum;
    String monthString, dateString, yearString, fullDateString;


    // parallel arrays:
    int[] monthNum       = {  0,         1,         2,       3,       4,     5,      6,      7,        8,           9,        10,         11,          12};
    String[] monthString = {"x", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    // Next step is to get the date from the user:
    fullDateString = JOptionPane.showInputDialog(null, "Please enter a date in the formate MM/DD/YYYY:");

    System.out.println(fullDateString);
    
  }
}