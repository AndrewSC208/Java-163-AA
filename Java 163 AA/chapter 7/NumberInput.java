// this is the number input program:
import javax.swing.*;
public class NumberInput
{
  public static void main(String [] args)
  {
    // variable declarations:
    String inputString;
    int inputNumber;
    int result;
    final int FACTOR = 10;
    
    // get info from the user:
    inputString = JOptionPane.showInputDialog(null, "Enter a number");
    inputNumber = Integer.parseInt(inputString);
    result = inputNumber*FACTOR;
    JOptionPane.ShowMessageDialog(null, inputNumber + " * " + FACTOR + "=" + result);
    
  }
}